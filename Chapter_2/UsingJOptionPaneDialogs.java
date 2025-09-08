package Chapter_2;

import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name;
        int confirm;

        do {
            name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) { 
                JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
                System.exit(0);
            }

            confirm = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

        } while (confirm != JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Your name is: " + name);
        System.exit(0);
    }
}
