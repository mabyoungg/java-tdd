package org.example;

public class Calc {
    public static int run(String num) {
        if(num.contains("-")) {
            String[] numSplit = num.split(" \\- ");

            int num1 = Integer.parseInt(numSplit[0]);
            int num2 = Integer.parseInt(numSplit[1]);

            return num1 - num2;
        } else if(num.contains("+")) {
            String[] numSplit = num.split(" \\+ ");

            int num1 = Integer.parseInt(numSplit[0]);
            int num2 = Integer.parseInt(numSplit[1]);

            return num1 + num2;
        }

        return 0;
    }
}
