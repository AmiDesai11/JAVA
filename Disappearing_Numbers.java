// Ami Desai - 60009210122
import java.util.ArrayList;
import java.util.Arrays;

public class Java_Problem_1 {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        int length = array.length;
        Arrays.sort(array);
        boolean[] seen = new boolean[length + 1];
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num >= 1 && num <= length) {
                seen[num] = true;

            }
        }

        System.out.println("Missing numbers from 1 to " + length + ":");
        for (int i = 1; i <= length; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

}