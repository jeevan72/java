import java.awt.event.*;
import javax.swing.*;
public class p10{
    public static void main(String[] args) {
        JFrame f = new JFrame("Lab 10");
        JButton b = new JButton("Click me");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Clicked!");
            }
        });
        f.setLayout(new java.awt.FlowLayout());
        f.add(b);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}