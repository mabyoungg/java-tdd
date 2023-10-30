package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Calc에 run 메서드 int 리턴")
    void test1() {
        int result = Calc.run("test");
    }
}
