import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива и верхнюю границу диапазона (целое положительное число больше 3): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 3) {
                int[] mass1 = new int[n];
                int count = 0;
                for (int i = 0; i < mass1.length; i++) {
                    mass1[i] = random.nextInt(n + 1);
                    if (mass1[i] % 2 == 0 && mass1[i] != 0) {
                        count++;
                    }
                }
                System.out.println(Arrays.toString(mass1));

                int k = 0;
                if (count > 0) {
                    int[] mass2 = new int[count];
                    for (int i = 0; i < mass1.length; i++) {
                        if (mass1[i] % 2 == 0 && mass1[i] != 0) {
                            mass2[k] = mass1[i];
                            k++;
                        }
                    }
                    System.out.println(Arrays.toString(mass2));
                } else {
                    System.out.println("В массиве нет чётных чисел.");
                }
            } else {
                System.out.println("Число меньше 4.");
            }
        } else {
            System.out.println("Вы ввели не целое положительно число.");
        }
    }
}
