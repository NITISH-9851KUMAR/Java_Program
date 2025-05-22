package Java_Program.swing;

import javax.swing.*;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // 1. Show a message dialog
        JOptionPane.showMessageDialog(null, "This is a message dialog", "Message", JOptionPane.INFORMATION_MESSAGE);

        // 2. Show an input dialog
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        System.out.println("You entered: " + name);

        // 3. Show a confirm dialog
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose YES");
        } else {
            JOptionPane.showMessageDialog(null, "You chose NO");
        }

        // 4. Show an option dialog with custom options
        String[] options = {"Java", "C++", "Python"};
        int selected = JOptionPane.showOptionDialog(
                null,
                "Choose your favorite language",
                "Language Poll",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        JOptionPane.showMessageDialog(null, "You selected: " + options[selected]);
    }
}

