import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = random.nextInt(16);
            mass2[i] = random.nextInt(16);
            sum1 += mass1[i];
            sum2 += mass2[i];
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));

        double average1 = sum1 / mass1.length;
        double average2 = sum2 / mass2.length;
        if (average1 > average2) {
            System.out.println("Среднее арифметическое элементов первого массива больше " +
                    "среднего арифметического элементов второго массива.");
            System.out.println(average1 + " > " + average2);
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое элементов второго массива больше " +
                    "среднего арифметического элементов первого массива.");
            System.out.println(average1 + " < " + average2);
        } else {
            System.out.println("Среднее арифметическое элементов массивов равны.");
            System.out.println(average1 + " = " + average2);
        }
    }
}
