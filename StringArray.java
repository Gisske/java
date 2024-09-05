import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        System.out.println("Basic String Array");
        System.out.println("=========================");

        String name[] = new String[5];
        Scanner nameIn = new Scanner(System.in);
        int index = 0;

        while (index <= 4) {
            System.out.print("Input name " + (index + 1) + ": ");
            name[index] = nameIn.nextLine();
            index++;

            }
            System.out.println("=========================");
            for (index = 0; index <= 4; index++) {
                System.out.println("Name number " + (index + 1) + ": " + name[index]);
        }
        System.out.println("=========================");
        nameIn.close();
    }
}


