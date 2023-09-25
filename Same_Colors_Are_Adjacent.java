// AMI DESAI - 60009210122
import java.util.Arrays;

public class Same_Colors_Are_Adjacent {

    public static void main(String[] args) {
        int[] array = {2, 0, 1};
        int length = array.length;
        int temp;

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    temp = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = temp;

                }

            }

        }

        System.out.println("Sorted Array:");

        System.out.println(Arrays.toString(array));

    }

}