import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int[] mass = new int[n];
                boolean check = false;
                System.out.print("Введите максимально возможное значение массива (целое положительное число): ");
                if (scanner.hasNextInt()) {
                    int x = scanner.nextInt();
                    if (x >= 0) {
                        int min = x;
                        for (int i = 0; i < mass.length; i++) {
                            mass[i] = random.nextInt(x + 1);
                            if (mass[i] % 2 == 1 && min >= mass[i]) {
                                min = mass[i];
                                check = true;
                            }
                        }
                        System.out.println(Arrays.toString(mass));

                        if (check) {
                            System.out.println("Наименьший нечётный элемент: " + min + ".");
                        } else {
                            System.out.println("В массиве нет нечётных элементов.");
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
