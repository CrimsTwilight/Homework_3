import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(mass));

        int max = mass[0];
        int maxI = 0;
        for (int i = 1; i < mass.length; i++) {
            if (max <= mass[i]) {
                max = mass[i];
                maxI = i;
            }
        }
        System.out.println("Максимальный элемент в массиве: " + max + ".\n" +
                "Индекс его последнего вхождения в массив: " + maxI + ".");
    }
}
