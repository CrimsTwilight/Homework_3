import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                int max = 0;
                int max2 = 0;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i ++) {
                    mass[i] = random.nextInt(10);
                    if (mass[i] > max) {
                        max = mass[i];
                    }
                }
                for (int i = 0; i < mass.length; i ++) {
                    if (mass[i] > max2 && mass[i] < max) {
                        max2 = mass[i];
                    }
                }
                System.out.println(Arrays.toString(mass));
                System.out.println("Максимальный элемент массива: " + max +
                        "\nВторой по величине элемент массива: " + max2);
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
