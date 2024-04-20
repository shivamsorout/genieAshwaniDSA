package loops;

public class HomeWork {
    public static void main(String[] args) {
        int q=12;
        int p=4;
        int w = q++ + p++ + p++ + p++ + ++p + q++ + ++q;
        //12 + 4 + 5 + 6 + 8 + 13 + 15
        //64
        System.out.println(w + " , " );
        System.out.println(12 + 4 + 5 + 6 + 8 + 13 + 15);
    }
}
