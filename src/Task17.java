import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                System.out.print("Введите значение (целое положительное число до 9): ");
                if (scanner.hasNextInt()) {
                    int x = scanner.nextInt();
                    if (x > 0) {
                        int count = 0;
                        int[] mass = new int[n];
                        for (int i = 0; i < mass.length; i ++) {
                            mass[i] = random.nextInt(10);
                            if (mass[i] == x && mass[i] != 0) {
                                count++;
                            }
                        }
                        System.out.println(Arrays.toString(mass));
                        System.out.println("Ваше значение встречается в массиве " + count + " раз.");
                    } else if (x == 0) {
                        int count = 0;
                        int[] mass = new int[n];
                        for (int i = 0; i < mass.length; i ++) {
                            mass[i] = random.nextInt(10);
                            if (mass[i] == 0) {
                                count++;
                            }
                        }
                        System.out.println(Arrays.toString(mass));
                        System.out.println("Ваше значение встречается в массиве " + count + " раз.");
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
