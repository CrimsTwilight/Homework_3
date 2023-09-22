import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = random.nextInt(10);
                }
                System.out.println(Arrays.toString(mass));

                for (int i = 0; i < mass.length; i++) {
                    if (i % 2 == 1) {
                        mass[i] = 0;
                    }
                }
                System.out.println(Arrays.toString(mass));
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
