import java.util.Scanner;

public class JavaSumValue_Nattapon {

    public static void emty() {
        System.out.println();
    }

    public static void line() {
        for (int i = 0; i <= 50; i++) {
            System.out.print("=");
        }
    }
    public static void main(String[] args) {
        Scanner nattapon = new Scanner(System.in);

        String name = "Nattapon Sappong";
        int number = 4;
        String programName = "Basic Statistic Program";

        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println(programName);
        line();
        emty();
        System.out.print("How many samples in process?\nInput sample value: ");
        int sampleCount = nattapon.nextInt();
        line();

        int[]totalScores = new int[5];

        for (int i = 1; i <= sampleCount; i++) {
            emty();
            System.out.println("Sample number " + i);
            line();

            for (int q = 1; q <= 5; q++) {
                emty();
                int score = (q == 5) ? 4 : 5;
                totalScores[q - 1] += score;
                System.out.println("Question " + q + " score: " + score);
            }

            line();
        }
        emty();
        System.out.println("Mean value");
        line();

        for (int q = 1; q <= 5; q++) {
            emty();
            double mean = (double) totalScores[q - 1] / sampleCount;
            System.out.printf("Question %d: %.2f%n", q, mean);
        }

        line();

        nattapon.close();
    }
}
