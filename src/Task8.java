import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] mass1 = new double[10];
        double[] mass2 = new double[10];
        double[] mass3 = new double[10];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = random.nextInt(10) + 1;
            mass2[i] = random.nextInt(10) + 1;
            mass3[i] = mass1[i] / mass2[i];
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        System.out.println(Arrays.toString(mass3));

        int count = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println("Целых элементов в третьем массиве: " + count + ".");
    }
}
