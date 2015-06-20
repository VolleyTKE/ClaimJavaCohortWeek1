
import java.util.Arrays;
//sorts and integer array dsc


public class BubbleSortAge {

    public static void main(String[] args) {

        int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 56, 22};

        for (int i = 0; i < age.length - 1; i++) {
            for (int j = 1; j < age.length - i; j++) {
                if (age[j - 1] > age[j]) {
                    int temp = age[j - 1];
                    age[j - 1] = age[j];
                    age[j] = temp;
                }

            }

        }

        System.out.println("The sorted ages are: " + Arrays.toString(age));
    }
}
