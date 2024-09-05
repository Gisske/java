import java.util.Scanner;

public class basic_evalutionFarm {

    public static void line () {
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static  boolean chk_score(double chk) {
        boolean chk_value = true;
        if(chk > 5){
            chk_value = true;
            System.out.println("The score morethan 5 point");
            System.out.println("Try input value again");
        }
        else if (chk < 1) {
            chk_value = true;
            System.out.println("The score not lessthan 1 point");
            System.out.println("Try input value again");
        }
        else {
            chk_value = false;
    }

    return chk_value;
}
    
 public static void main(String[] args) {
    System.out.println("Basic evaluaton program v.3");
    line();
    int sample = 0;
    Scanner input = new Scanner(System.in);
    String[] question = new String[5];
    int rerun = 0;
    question[0] = "the product is easy to use? : ";
    question[1] = "the product is safe to use? : ";
    question[2] = "the product is accurate according to the specified conditons? : ";
    question[3] = "the product can be ordered via the internet : ";
    question[4] = "the product assembly of the workpice is meticulous : ";

    do {
    System.out.println("How many sample is process");
    System.out.print("Input sample: ");
    sample = input.nextInt();
    double[] sumQusetion = new double[5];
    int chk_qut = 0;
    double[] sum_value = new double[sample];
    double[][] score = new double[sample][5];
    boolean chk5 = true;

    System.out.println("Enter a score of 1-5 according to satisfaction");
    line();
    for(int index = 0; index <= (sample - 1); index++) {
        System.out.println("Sample number" + (index + 1));
        line();
        sumQusetion[chk_qut] = 0;
        do {
            System.out.println(question[1]);
            score[index][1] = input.nextDouble();
            chk5 = chk_score(score[index][1]);
            line();
        } while (chk5 == true);
        do {
            System.out.println(question[2]);
            score[index][2] = input.nextDouble();
            chk5 = chk_score(score[index][2]);
            line();
        } while (chk5 == true);
        do {
            System.out.println(question[3]);
            score[index][3] = input.nextDouble();
            chk5 = chk_score(score[index][3]);
            line();
        } while (chk5 == true);
        do {
            System.out.println(question[4]);
            score[index][4] = input.nextDouble();
            chk5 = chk_score(score[index][4]);
            line();
        } while (chk5 == true);

        for (int i = 0; i < score.length; i++) {
            sumQusetion[chk_qut] = sumQusetion[chk_qut] + score[index][i];
        }

        System.out.println("show sumation scores");
        line();
        for (int shw_index = 0; shw_index <= 4 ; shw_index++) {
            System.err.println(question[shw_index] + ": " + sum_value[shw_index]);
        }
        line();
    }

    System.out.println("Do you want to run program again?");
    System.out.println("[1] Rerun program");
    System.out.println("[0] Exit program");
    System.out.println("Input your choice");
    rerun = input.nextInt();

    } while (rerun == 1);

    line();
    System.out.println("Thanks");
    input.close();
 }   
}