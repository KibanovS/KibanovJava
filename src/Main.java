import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание 1
        Calculator calc = new Calculator();
        int a = 8;
        int b = 4;
        String max = calc.max(a, b);
        System.out.println("a = " + a + " b = " + b);
        System.out.println(max);
        System.out.println(a + " + " + b + " = " + calc.addition(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtraction(a, b));
        System.out.println(a + " / " + b + " = " + calc.division(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiplication(a, b));


        // Задание 2
        StringsService string = new StringsService();
        String firstLine = "Синее";
        String secondLine = "Море";
        String thirdLine = "Синее";
        System.out.println(firstLine + " - " + secondLine);
        System.out.println(string.compare(firstLine, secondLine));
        System.out.println(firstLine + " - " + thirdLine);
        System.out.println(string.compare(firstLine, thirdLine));

        // Задание 3
        Array array = new Array();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array.getEvenNumbers(arr)));

    }
    }
