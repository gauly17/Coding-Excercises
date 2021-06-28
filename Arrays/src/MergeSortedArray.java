
/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers
*  m and n, representing the number of elements in nums1 and nums2 respectively.
*
*  Merge nums1 and nums2 into a single array sorted in non-decreasing order */

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}

