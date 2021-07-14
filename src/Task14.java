import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                int min = 10;
                boolean check = false;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i ++) {
                    mass[i] = random.nextInt(10);
                    if (mass[i] % 2 != 0 && min > mass[i]) {
                        min = mass[i];
                        check = true;
                    }
                }
                System.out.println(Arrays.toString(mass));
                if (check) {
                    System.out.println("Наименьший нечётный элемент: " + min);
                } else {
                    System.out.println("В массиве нет нечётных элементов.");
                }
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
