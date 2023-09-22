import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                System.out.print("Введите число для сравнения: ");
                if (scanner.hasNextInt()) {
                    int x = scanner.nextInt();
                    int[] mass = new int[n];
                    double sum = 0;
                    for (int i = 0; i < mass.length; i++) {
                        mass[i] = random.nextInt(10);
                        sum += mass[i];
                    }
                    System.out.println(Arrays.toString(mass));

                    double average = sum / mass.length;
                    System.out.println("Среднее арифметическое элементов массива равно: " + average + ".");
                    if (average > x) {
                        System.out.println("Среднее арифметическое элементов массива больше вашего числа.");
                        System.out.println(average + " > " + x);
                    } else if (average < x) {
                        System.out.println("Среднее арифметическое элементов массива меньше вашего числа.");
                        System.out.println(average + " < " + x);
                    } else {
                        System.out.println("Среднее арифметическое элементов массива и ваше число равны.");
                        System.out.println(average + " = " + x);
                    }
                } else {
                    System.out.println("Вы ввели не целое число.");
                }
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}