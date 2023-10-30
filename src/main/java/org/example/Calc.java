package org.example;

public class Calc {
    public static int run(String num) {
        int result;

        String[] numSplit = num.split("\\*");
        result = Integer.parseInt(numSplit[0].trim()) * Integer.parseInt(numSplit[1].trim());

        return result;
    }
}
