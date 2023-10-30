package org.example;

public class Calc {
    public static int run(String num) {
        if (num.isBlank()) {
            return 0;
        }

        num = stripOuterParentheses(num);

        String[] numSplit = num.split(" ");

        int num1 = Integer.parseInt(numSplit[0]);
        int num2 = Integer.parseInt(numSplit[2]);
        String sign = numSplit[1];

        int result = switch (sign) {
            case "+":
                yield num1 + num2;
            case "-":
                yield num1 - num2;
            case "*":
                yield num1 * num2;
            case "/":
                yield num1 / num2;
            default:
                yield 0;
        };

        return result;

    }

    private static String stripOuterParentheses(String num) {
        while (true) {
            if(num.contains("(")){
                if (num.startsWith("(") && num.endsWith(")")){
                    num = num.substring(1, num.length()-1);
                }
            } else {
                return num;
            }

        }

    }

}
