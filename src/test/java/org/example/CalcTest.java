package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("Calc에 run 메서드 int 리턴")
    void test1() {
        int result = Calc.run("test");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void test2() {
        int result = Calc.run("10 + 10");

        assertThat(result).isEqualTo(20);

    }

    @Test
    @DisplayName("10 - 10 = 0")
    void test3() {
        int result = Calc.run("10 - 10");

        assertThat(result).isEqualTo(0);

    }
}
