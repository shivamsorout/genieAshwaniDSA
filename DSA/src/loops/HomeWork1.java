package loops;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println(366%10);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
            default:
                System.out.println("please Enter Correct value either 1 or 2");
        }
    }
}
