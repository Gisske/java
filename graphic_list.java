import javax.swing.*;

public class graphic_list {
    graphic_list() {
        JFrame frm = new JFrame("Simple list java component");
        DefaultListModel<String> list1 = new DefaultListModel<>();

        list1.addElement("Item 1");
        list1.addElement("Item 2");
        list1.addElement("Item 3");
        list1.addElement("Item 4");

        JList<String> listMenu = new JList<>(list1);
        listMenu.setBounds(100,100,75,75);

        frm.setSize(300,300);
        frm.setLayout(null);
        frm.setVisible(true);

        frm.add(listMenu);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new graphic_list();
    }
}
