import javax.swing.*;
import java.awt.event.*;

public class graphic_passField implements ActionListener{
    
    JFrame pass_frame;
    JLabel lbl_userName, lbl_pass, lbl_showPass;
    JTextField txt_user;
    JPasswordField pass_field;
    JButton btn_login;

    graphic_passField() {
        pass_frame = new JFrame("Test password frame");
        lbl_userName = new JLabel("Username: ");
        lbl_pass = new JLabel("Password: ");
        txt_user = new JTextField();
        pass_field = new JPasswordField();
        btn_login = new JButton("login");
        lbl_showPass = new JLabel();

        pass_frame.setSize(400, 350);
        pass_frame.setLayout(null);
        pass_frame.setVisible(true);

        lbl_userName.setBounds(20, 50, 100, 20);
        txt_user.setBounds(150 , 50, 150, 50);
        lbl_pass.setBounds(20, 120, 100, 20);
        pass_field.setBounds(150, 120, 150, 50);
        btn_login.setBounds(150, 200, 100, 45);
        lbl_showPass.setBounds(20, 260, 350, 30);

        pass_frame.add(lbl_userName);
        pass_frame.add(txt_user);
        pass_frame.add(lbl_pass);
        pass_frame.add(pass_field);
        pass_frame.add(btn_login);
        pass_frame.add(lbl_showPass);

        btn_login.addActionListener(this);
        
        pass_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        String uName = "Earth";
        String passName = "123456";
        
        String data = txt_user.getText();
        char[] pass = pass_field.getPassword();
        String passString = new String(pass);
        
        //lbl_showPass.setText("Username: " + data + ", Password: " + passString);
        if (data.equals(uName)) {
            if (passString.equals(passName)) {
                lbl_showPass.setText("Login pass: " + uName + " " + passName);
            }
            else {
                lbl_showPass.setText("Password was wrong");
            }
        }
        else {
            lbl_showPass.setText("Username was wrong");
        }

    }
    public static void main(String[] args) {
        new graphic_passField();
    }
}