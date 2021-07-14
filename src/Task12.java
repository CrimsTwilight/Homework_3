import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int mult = 1;
                int count = 0;
                int[] mass = new int[n];
                for (int i = 0; i < mass.length; i ++) {
                    mass[i] = random.nextInt(10);
                    if (i % 2 == 0) {
                        mult *= mass[i];
                        count++;
                    }
                }
                System.out.println(Arrays.toString(mass));
                System.out.println("Среднее арифметическое элементов с нечётными номерами " +
                        "равно: " + mult / count);
            } else if (n == 0) {
                int mult = 0;
                System.out.println("Среднее арифметическое элементов с нечётными номерами " +
                        "равно: " + mult);
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
