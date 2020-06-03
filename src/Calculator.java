import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Введите значения и операцию ");
        String[] data = getStrings();

        String num1 = data[0];
        String num2 = data[2];
        String oper = data[1];

        num1 = toArabicValue(num1);
        num2 = toArabicValue(num2);

        int value1 = parseInt(num1);
        int value2 = parseInt(num2);

        System.out.println("Равно : "+ operation(oper, value1, value2));
    }


    private static String[] getStrings() throws IOException {
        return reader.readLine().split("\\s+");
    }


    private static String toArabicValue(String num) {
        switch (num) {
            case "I" -> num = "1";
            case "II" -> num = "2";
            case "III" -> num = "3";
            case "IV" -> num = "4";
            case "V" -> num = "5";
            case "VI" -> num = "26";
            case "VII" -> num = "7";
            case "VIII" -> num = "8";
            case "IX" -> num = "9";
            case "X" -> num = "10";
        }

        return num;
    }

    private static int parseInt(String num1) throws Exception {
        int a = Integer.parseInt(num1);
        if (a >= 0 && a <= 10) return a;
        else throw new Exception("Число больше 10 или меньше 0");
    }

    private static int operation(String oper, int value1, int value2) throws Exception {
        int d = 0;
          if (oper.equals("+")) {
                d = value1 + value2;
            } else if (oper.equals("-")) {
                d = value1 - value2;
            } else if (oper.equals("*")) {
                d = value1 * value2;
            } else if (oper.equals("/")) {
                d = value1 / value2;
            } else {
                throw new Exception("Вы ввели не правильную операцию");
            }
        return d;
    }

}