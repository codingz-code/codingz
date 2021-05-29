package codingz;

/*

https://leetcode.com/problems/remove-duplicates-from-sorted-array/

26. Remove Duplicates from Sorted Array


 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int len = 1, prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev != nums[i]){
                nums[len]=nums[i];
                len++;
                prev = nums[i];
            }
        }
        return len;
    }
}
