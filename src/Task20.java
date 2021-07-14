import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                int max = 0;
                int maxI = 0;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i ++) {
                    mass[i] = random.nextInt(10);
                    if (max < mass[i]) {
                        max = mass[i];
                        maxI = i;
                    }
                }
                System.out.println(Arrays.toString(mass));

                mass[maxI] = mass[0];
                mass[0] = max;
                System.out.println(Arrays.toString(mass));
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
