import java.util.Scanner;

public class basic_array02 {
    public static void main(String[] args) {
        System.out.println("Basic array 02");
        System.out.println("============================");
        int mValue[] = new int[5];
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i <= 4; i++) {
            System.out.print("Input value numbwe: " + (i + 1) + ": ");
            mValue[i] = scan.nextInt();
        }
        System.out.println("Summation: " + (mValue[0] + mValue[1] + mValue[2] + mValue[3] + mValue[4]));
        System.out.println("============================");
        scan.close();
    }
}
