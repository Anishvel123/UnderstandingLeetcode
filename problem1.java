import java.util.*;

class problem1 {
    public static void main(String[] args) {
        nums = [-2,1,-3,4,-1,2,1,-5,4];
        System.out.println(maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
