import javax.swing.*;

public class graphic_button1 {
    public static void main(String[] args, int i) {
        JFrame frm = new JFrame("Basic Button by JAVA");
        JButton ok_btn = new JButton("OK");

        ok_btn.setBounds(50,50,100,5);
        frm.setSize(200,200);
        frm.setLayout(null);
        frm.setVisible(true);

        frm.add(ok_btn);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
