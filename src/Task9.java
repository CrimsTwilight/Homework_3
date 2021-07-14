import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int count = 0;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = random.nextInt(16);
                    count++;
                }
                System.out.println(Arrays.toString(mass));

                int sum1 = 0, sum2 = 0;
                if (count % 2 == 0) {
                    for (int i = 0; i < mass.length / 2; i++) {
                        sum1 += mass[i];
                    }
                    for (int i = mass.length - 1; i >= mass.length / 2; i--) {
                        sum2 += mass[i];
                    }
                } else {
                    for (int i = 0; i < mass.length / 2; i++) {
                        sum1 += mass[i];
                    }
                    for (int i = mass.length - 1; i > mass.length / 2; i--) {
                        sum2 += mass[i];
                    }
                }
                if (sum1 > sum2) {
                    System.out.println("Сумма левой половины массива больше.");
                } else if (sum1 < sum2) {
                    System.out.println("Сумма правой половины массива больше.");
                } else {
                    System.out.println("Суммы левой и правой половин массива равны.");
                }
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
