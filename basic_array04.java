import java.util.Scanner;

public class basic_array04 {
    public static void main(String[] args) {
        System.out.println("Basic array 03");
        System.out.println("============================");

        Scanner input = new Scanner(System.in);
        double score[][] = new double[4][5];
        double sumValue[] = new double[4];
        int index = 0;

        while (index <= 3) {
            System.out.println("Input student's score number " + (index + 1));
            System.out.println("==========================");
            System.out.println("Input practice score: ");
            score[index][0] = input.nextDouble();
            System.out.println("Input works score: ");
            score[index][1] = input.nextDouble();
            System.out.println("Input Mid-Trem score: ");
            score[index][2] = input.nextDouble();
            System.out.println("Input Fainal-Trem score: ");
            score[index][3] = input.nextDouble();
            System.out.println("Input Attitute score: ");
            score[index][4] = input.nextDouble();
            System.out.println("==========================");
            index++;
        }

        for (index = 0; index <= 3; index++) {
            sumValue[index] = 0;
            for (int j = 0; j <+ 4; j++) {
                sumValue[index] = sumValue[index] = score[index][j];
            }
        }

        for (index = 0; index <=3; index++) {
            System.out.println("Sum score student number: " + sumValue[index]);
        }
    }
}
