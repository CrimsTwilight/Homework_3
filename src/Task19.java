import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                int min = 10;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = random.nextInt(10);
                    if (i % 2 == 0 && min > mass[i]) {
                        min = mass[i];
                    }
                }
                System.out.println(Arrays.toString(mass));
                System.out.println("Наименьший элемент среди элементов с чётными индексами: " + min);
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
