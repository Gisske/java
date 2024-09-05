import java.util.Scanner;

public class grade_calculate_V4 {
    
    public static void line() {
        for(int line = 1; line <= 50; line++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        line();
        System.out.println();
        System.out.println("Grade calculate program V. 4.0");
        line();

        int index = 0, reMenu = 0, stdValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.println();

        do {
            System.out.println("How many student in process?");
            System.out.print("input: ");
            stdValue = input.nextInt();
            double score[][] = new double[stdValue][5];

            while (index <= (stdValue - 1)) {
                System.out.println("Student's score number " + (index + 1));
                line();
                System.out.println();
                System.out.print("Input practices score: ");
                score[index][0] = input.nextDouble();
                System.out.print("Input works score: ");
                score[index][1] = input.nextDouble();
                System.out.print("Input Mid-Term score: ");
                score[index][2] = input.nextDouble();
                System.out.print("Input Final-Term score: ");
                score[index][3] = input.nextDouble();
                System.out.print("Input Attitude score: ");
                score[index][4] = input.nextDouble();
                index++;
                line();
                System.out.println();
            }

            double sumValue[] = new double[stdValue];
            for(index = 0; index <= (stdValue - 1); index++) {
                sumValue[index] = 0;
                for(int l_sum = 0; l_sum <= 4; l_sum++) {
                    sumValue[index] = sumValue[index] + score[index][l_sum];
                }
            }

            System.out.println("Summation score in class");
            line();
            System.out.println();

            for(index = 0; index <= (stdValue - 1); index++) {
                System.out.println("Student number " + (index + 1) + ": " + sumValue[index]);
            }
            index = 0;
            line();
            System.out.println();
            System.out.println("Do you want to try again?");
            System.out.println("[1] Try again");
            System.out.println("[0] Exit program");
            System.out.print("Input your choice: ");
            reMenu = input.nextInt();        
        } while (reMenu == 1);

        line();
        System.out.println();
        System.out.println("End program");
        input.close();
    }
}