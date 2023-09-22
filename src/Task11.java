import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int[] mass = new int[n];
                int mult = 1;
                boolean check = false;
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = random.nextInt(10);
                    if (mass[i] % 3 == 0 && mass[i] != 0) {
                        mult *= mass[i];
                        check = true;
                    }
                }
                System.out.println(Arrays.toString(mass));

                if (check) {
                    System.out.println("Произведение элементов кратных 3 равно: " + mult + ".");
                } else if (false) {
                    System.out.println("В массиве нет элементов кратных 3.");
                }
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
