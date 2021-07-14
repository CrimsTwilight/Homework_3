import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 0) {
                    int mult = 1;
                    boolean check = false;
                        int[] mass = new int[n];
                        for (int i = 0; i < mass.length; i++) {
                            mass[i] = random.nextInt(10);
                            if (mass[i] % 3 == 0 && mass[i] != 0) {
                                mult *= mass[i];
                                check = true;
                            }
                        }
                        System.out.println(Arrays.toString(mass));

                    if (check) {
                        System.out.println("Произведение элементов кратных 3 равно: " + mult);
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
