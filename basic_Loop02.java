import java.util.Scanner;

public class basic_Loop02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("basic Multiplication Table");
        System.out.print("Input Number: ");
        int number = scan.nextInt();
        for (int i = 0; i <= 50; i++) 
            System.out.print("#");
        System.out.println();
        for (int j = 1; j <= 12; j++) {
            System.out.println(number + " x " + j + " = " + (number*j));
        }
        for (int i = 0; i <= 50; i++) {
            System.out.print("#");
        }
        scan.close();
    }
}
