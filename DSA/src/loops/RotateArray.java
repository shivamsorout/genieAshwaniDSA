package loops;

public class RotateArray {
    public static void rotateArray(int nums[], int k){
        int temp[] = new int[nums.length];
        int p=0;
        for(int i=nums.length-k;i<nums.length;i++){
            temp[p] = nums[i];
            p++;
        }
        for(int i=0;i<nums.length-k;i++){
            temp[p] = nums[i];
            p++;
        }
        for(int i=0; i<temp.length; i++){
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
