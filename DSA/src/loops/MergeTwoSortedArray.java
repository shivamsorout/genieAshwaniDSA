package loops;

public class MergeTwoSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int []mergedArr = new int[m+n];

        int left = 0;
        int right = 0;
        int index = 0;

        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                mergedArr[index] = nums1[left];
                left++;index++;
            }else{
                mergedArr[index] = nums2[right];
                right++;index++;
            }
        }
        while(left<m){
            mergedArr[index++] = nums1[left++];
        }
        while(right<n){
            mergedArr[index++] = nums2[right++];
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        int mergedarr[] = merge(new int[]{1,2,3},3, new int[]{2,5,6},3);
    }
}
