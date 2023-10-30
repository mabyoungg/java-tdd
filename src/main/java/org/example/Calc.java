package org.example;

public class Calc {
    public static int run(String num) {
        if (num.isBlank()) {
            return 0;
        }

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

//       switch (sign) {
//           case "+":
//               return num1 + num2;
//           case "-":
//               return num1 - num2;
//           case "*":
//               return num1 * num2;
//           case "/":
//               return num1 / num2;
//           default:
//               return 0;
//       }

    }

}
