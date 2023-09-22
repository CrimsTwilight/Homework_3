import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[4];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(mass));

        boolean check = false;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

