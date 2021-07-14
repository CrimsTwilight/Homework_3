import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                boolean check = false;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i ++) {
                    mass[i] = random.nextInt(10);
                }
                for (int i = 1; i < mass.length; i ++) {
                    for (int j = 0; j < i; j++) {
                        if (mass[j] == mass[i]) {
                            check = true;
                        }
                    }
                }
                System.out.println(Arrays.toString(mass));
                if (check) {
                    System.out.println("Не все элементы массива различны.");
                } else {
                    System.out.println("Все элементы массива различны.");
                }
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
