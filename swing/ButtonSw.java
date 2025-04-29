package Java_Program.swing;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ButtonSw {

    static void button(){
        JFrame frame= new JFrame();
        JButton button= new JButton("Ok");
        frame.add(button);
        button.setBounds(100, 100, 100, 100);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ButtonSw.button();
    }
}
