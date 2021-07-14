import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        double[] mass1 = new double[10];
        double[] mass2 = new double[10];
        double[] mass = new double[10];
        Random random = new Random();
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = random.nextInt(10);
            mass2[i] = random.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));

        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass1[i] / mass2[i];
            if (mass[i] % 1 == 0 && mass[i] != 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(count + " - целых элементов в третьем массиве.");
    }
}
