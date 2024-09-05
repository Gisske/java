import java.util.Scanner;

import javax.sound.sampled.Line;

public class opp_rectangle {
    public static void main(String[] args) {
        rec_area box = new rec_area();
        System.out.println("Rectangle area calculate V 2.0");
        line li = new line();
        box.setLength(15.5);
        box.setWidth(22.75);
        System.out.println("The lenght is :" + box.displayLength());
        System.out.println("The width is :" + box.displayWidth());
        System.out.println("Answer is : " + box.processArea());
    }
}
