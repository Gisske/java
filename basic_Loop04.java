import java.util.Scanner;

public class basic_Loop04 {
    public static void main(String[] args) {
        System.out.println("Basic mean value");
        System.out.println("================");
        double mValue = 0, sumValue = 0, meanValue = 0;
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.print("Input Number in process: ");
        mValue = scan.nextDouble();

        while (i <= mValue) {
            System.out.print("Input " + i + ": ");
            sumValue = scan.nextDouble();
            meanValue = meanValue + sumValue;
            i++;
        }
        meanValue = meanValue / mValue;
        System.out.println("Mean Value: " + meanValue);
        System.out.println("=======================");
        scan.close();
    }
}
