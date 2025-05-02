package Java_Program.swing;

import javax.swing.*;

public class ComboBox {
    JFrame f;
    ComboBox(){
        f= new JFrame("JComboBox Example");
        String country[]= {"India", "Aus", "U.S.A", "England", "Newzland"};

        JComboBox<String> box= new JComboBox<>(country);
        box.setBounds(50, 50, 90, 30);

        f.add(box);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}

