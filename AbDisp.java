import javax.swing.*;
import java.awt.*;

public class AbDisp {
    AbDisp() {

        JFrame a = new JFrame();
        a.setBounds(250, 250, 350, 300);
        a.setTitle("about us");
        a.setLayout(null);
        a.setVisible(true);

        JLabel n0, n1, n2;
        n0 = new JLabel("made by:");
        n0.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
        n0.setBounds(100, 50, 150, 20);
        a.add(n0);

        n1 = new JLabel("Shrushti Gupta");
        n1.setFont(new Font("Thomas", Font.PLAIN, 17));
        n1.setBounds(20, 150, 150, 20);
        n1.setVisible(true);
        a.add(n1);

        n2 = new JLabel("Saikrishna Agrawal");
        n2.setFont(new Font("Thomas", Font.PLAIN, 17));
        n2.setBounds(170, 150, 150, 20);
        n2.setVisible(true);
        a.add(n2);

    }

    public static void main(String[] args) {
        new AbDisp();
    }
}
