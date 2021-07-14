import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        int[] mass = new int[15];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
            if (mass[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("В массиве " + count + " чётных чисел.");
    }
}
