package codingz;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * <p>
 * 53. Maximum Subarray
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest
 * sum and return its sum.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 * <p>
 * <p>
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer
 * approach, which is more subtle.
 * <p>
 * https://www.youtube.com/watch?v=k5rL_5uTMy8
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray obj = new MaximumSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(obj.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
