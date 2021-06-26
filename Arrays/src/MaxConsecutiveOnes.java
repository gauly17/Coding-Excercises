
/* Given a binary array nums, return the maximum number of consecutive 1's in the array */

public class MaxConsecutiveOnes {
    int findMaxConsecutiveOnes(int nums, int numsSize){
        int count = 0;
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                count = 0;
            }
            else
            {
                count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
