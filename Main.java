import java.util.Scanner;

public class Main {

    public static void displayMathComp(double number1, float number2) {
        if (Math.abs(number1 - number2 ) < 0.0001){
            System.out.println("Числа равны");
        } else if (number1 > number2){
            System.out.println("Больше число " + number1);
        } else
            System.out.println("Больше число " + number2);
    }

    public static void displayMathRound(double x){
        System.out.println("Результат округления: " + Math.round(x));
    }

    public static void displayMathInt(double y){
        int z = (int)y;
        System.out.println("Число после отброса дробной части: " + z);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Введите первое число: ");
                double number1 = scanner.nextDouble();
                System.out.println("Введите второе число: ");
                float number2 = scanner.nextFloat();
                displayMathComp(number1, number2);
                break;

            case 2:
                System.out.println("Введите число: ");
                double x = scanner.nextDouble();
                displayMathRound(x);
                break;

            case 3:
                System.out.println("Введите число: ");
                double y = scanner.nextDouble();
                displayMathInt(y);
                break;
        }
    }
}
