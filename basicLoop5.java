import java.util.Scanner;

public class basicLoop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Multiplication Table V. 30");
        System.out.println("==========================");

        int mValue, index, run, reProgram = 0;
        
        do {
            System.out.print("Input number of multiplication table: ");
            mValue = scan.nextInt();
            index = mValue;
            while (index >= 2) {
                System.out.println("===Number " + index + " multiplication table===");
                for (run = 2; run <= 12; run++) {
                    System.out.println(index + " x " + run + " = " + (index * run));
                }
                index--;
            }
            System.out.println("=======================");
            System.out.println("Do you want to try program");
            System.out.println("1. Try again");
            System.out.println("0. Exit program");
            System.out.println("[1]/[0]");
            reProgram = scan.nextInt();

        } while (reProgram == 1);
        
    }
}
