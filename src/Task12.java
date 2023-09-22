import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int[] mass = new int[n];
                double sum = 0;
                int count = 0;
                for (int i = 0; i < mass.length; i ++) {
                    mass[i] = random.nextInt(10);
                    if (i % 2 == 0) {
                        sum += mass[i];
                        count++;
                    }
                }
                System.out.println(Arrays.toString(mass));
                System.out.println("Среднее арифметическое элементов с нечётными номерами " +
                        "равно: " + sum / count + ".");
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}
