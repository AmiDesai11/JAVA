// Ami Desai - 60009210122
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangles {
    public static List<int[]> findTriangles(int[] nums) {
        Arrays.sort(nums);
        List<int[]> triangles = new ArrayList<>();
 
        for (int i = 2; i < nums.length; i++) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    triangles.add(new int[]{nums[left], nums[right], nums[i]});
                    right--;
                } else {
                    left++;
                }
            }
        }
        return triangles;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,4};
        List<int[]> triangles = findTriangles(nums);
        int length = triangles.size();
        System.out.println("Triangles found: " +  length);
        for (int[] triangle : triangles) {
            System.out.println(Arrays.toString(triangle));
        }
    }
}