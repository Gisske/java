import java.util.Scanner;

public class basic_Loop03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("basic Multiplication Table");
        System.out.print("Input Number: ");
        int number = scan.nextInt();
        for (int i = 0; i <= 50; i++) 
            System.out.print("#");
        System.out.println();
        int j = 1;
        while (j <= 12) {
            System.out.println(number + " x " + j + " = " + (number*j));
            j++;
        }
        for (int i = 0; i <= 50; i++) {
            System.out.print("#");
        }
        scan.close();
    }
}
