package loops;

import java.util.Stack;


//Find leaders and print them in the same order as they are:
public class LeadersInArray {
    public static void leadersinArray(int [] arr){
        int maxFromRight = arr[arr.length-1];
        Stack<Integer> stack = new Stack<>();
        stack.push(maxFromRight);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxFromRight){
                maxFromRight = arr[i];
                stack.push(maxFromRight);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        leadersinArray(new int[]{16,17,4,3,5,2});
    }
}
