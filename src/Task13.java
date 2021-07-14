import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                System.out.print("Введите значение число для сравнения (целое положительное число): ");
                if (scanner.hasNextInt()) {
                    int x = scanner.nextInt();
                    if (x > 0) {
                        int sum = 0;
                        int[] mass = new int[n];
                        for (int i = 0; i < mass.length; i++) {
                            mass[i] = random.nextInt(10);
                            sum += mass[i];
                        }
                        System.out.println(Arrays.toString(mass));
                        System.out.println("Среднее арифметическое элементов массива равно: " + sum / n);

                        if (sum / n > x) {
                            System.out.println("Среднее арифметическое элементов массива больше вашего числа.");
                        } else {
                            System.out.println("Среднее арифметическое элементов массива меньше вашего числа.");
                        }
                    } else {
                        System.out.println("Вы ввели отрицательное число.");
                    }
                } else {
                    System.out.println("Вы ввели не целое положительное число.");
                }
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}