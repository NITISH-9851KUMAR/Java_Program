package Java_Program.swing;

import javax.swing.*;

public class Spinner {
    public static void main(String[] args) {
        JFrame f= new JFrame("Spinner Example");
        SpinnerModel value=
                new SpinnerNumberModel(0, //Initial Value
                        0, //minimum value
                        10, //maximum value
                        1 // step
                );
        JSpinner spinner= new JSpinner(value);
        spinner.setBounds(100, 100, 80, 50);
        f.add(spinner);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
