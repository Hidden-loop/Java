import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tproject extends JFrame {
    JButton b, b1, dot, ac, bs, pm;
    JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    TextField t1;
    JLabel l1, l2, l3;
    JTextField t2, t3, t4;
    JComboBox tc1;

    tproject() {
        getContentPane().setBackground(Color.white);

        setTitle("Temperature converter");
        setBackground(Color.white);
        setBounds(50, 80, 700, 500);

        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        JLabel head = new JLabel("Temperature Converter");
        head.setFont(new Font("Times New Roman", Font.BOLD, 20));
        head.setBounds(190, 20, 250, 50);
        add(head);

        t1 = new TextField(" ");
        t1.setBounds(190, 100, 200, 30);
        add(t1);

        String arr1[] = {"Celsius", "Fahrenheit", "Kelvin"};
        tc1 = new JComboBox(arr1);
        tc1.setBounds(230, 150, 100, 20);
        add(tc1);

        b1 = new JButton("i");
        b1.setBounds(450, 95, 40, 40);
        b1.addActionListener(new Handler());
        add(b1);

        b = new JButton("convert");
        b.setBounds(230, 185, 100, 40);
        b.addActionListener(new Handler());
        add(b);

        l1 = new JLabel("Farenheit");
        l1.setBounds(300, 250, 200, 30);
        add(l1);

        t2 = new JTextField();
        t2.setBounds(100, 250, 100, 30);
        t2.setEditable(false);
        t2.setVisible(true);

        add(t2);

        l2 = new JLabel("Celcius");
        l2.setBounds(300, 290, 200, 30);
        add(l2);

        t3 = new JTextField();
        t3.setBounds(100, 290, 100, 30);
        t3.setEditable(false);
        t3.setVisible(true);
        add(t3);

        l3 = new JLabel("Kelvin");
        l3.setBounds(300, 330, 200, 30);
        add(l3);

        t4 = new JTextField();
        t4.setBounds(100, 330, 100, 30);
        t4.setEditable(false);
        t4.setVisible(true);
        add(t4);

        dot = new JButton(".");
        pm = new JButton("±");
        bs = new JButton("<--");
        ac = new JButton("AC");
        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");

        ac.setBounds(538, 200, 50, 100);
        pm.setBounds(538, 350, 50, 50);
        bs.setBounds(538, 300, 50, 50);
        dot.setBounds(488, 350, 50, 50);
        n0.setBounds(388, 350, 100, 50);
        n1.setBounds(388, 200, 50, 50);
        n2.setBounds(438, 200, 50, 50);
        n3.setBounds(488, 200, 50, 50);
        n4.setBounds(388, 250, 50, 50);
        n5.setBounds(438, 250, 50, 50);
        n6.setBounds(488, 250, 50, 50);
        n7.setBounds(388, 300, 50, 50);
        n8.setBounds(438, 300, 50, 50);
        n9.setBounds(488, 300, 50, 50);

        ac.addActionListener(new Handler());
        pm.addActionListener(new Handler());
        bs.addActionListener(new Handler());
        dot.addActionListener(new Handler());
        n0.addActionListener(new Handler());
        n1.addActionListener(new Handler());
        n2.addActionListener(new Handler());
        n3.addActionListener(new Handler());
        n4.addActionListener(new Handler());
        n5.addActionListener(new Handler());
        n6.addActionListener(new Handler());
        n7.addActionListener(new Handler());
        n8.addActionListener(new Handler());
        n9.addActionListener(new Handler());

        add(ac);
        add(dot);
        add(pm);
        add(bs);
        add(n0);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);


    }


    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x;
            x = (String) tc1.getSelectedItem();

            if (e.getSource() == b1) {
                new AbDisp();
            }

            if (e.getSource() == n0)
                t1.setText(t1.getText() + "0");
            if (e.getSource() == n1)
                t1.setText(t1.getText() + "1");
            if (e.getSource() == n2)
                t1.setText(t1.getText() + "2");
            if (e.getSource() == n3)
                t1.setText(t1.getText() + "3");
            if (e.getSource() == n4)
                t1.setText(t1.getText() + "4");
            if (e.getSource() == n5)
                t1.setText(t1.getText() + "5");
            if (e.getSource() == n6)
                t1.setText(t1.getText() + "6");
            if (e.getSource() == n7)
                t1.setText(t1.getText() + "7");
            if (e.getSource() == n8)
                t1.setText(t1.getText() + "8");
            if (e.getSource() == n9)
                t1.setText(t1.getText() + "9");
            if (e.getSource() == dot)
                t1.setText(t1.getText() + ".");
            if (e.getSource() == ac) {
                t1.setText("");
                t2.setText("");
            }
            if (e.getSource() == pm) {
                String spm;
                spm = t1.getText();
                if (spm.length() == 0)
                    t1.setText("-");
                else if (spm.charAt(0) != '-')
                    t1.setText("-" + t1.getText());
                else
                    t1.setText(spm.substring(1));
            }
            if (e.getSource() == bs) {
                int n;
                String bsp;
                bsp = t1.getText();
                n = bsp.length();
                t1.setText(bsp.substring(0, n - 1));
            }
            if (e.getSource() == b) {
                // Both are same.......................
                if (x == "Celsius") {
                    t3.setText("" + t1.getText());

                    String s = t1.getText();
                    float c = Float.parseFloat(s);
                    float f = (float) ((c * 9 / 5) + 32);
                    t2.setText("" + f);


                    float k = (float) (c + 273.15);
                    t4.setText("" + k);

                } else if (x == "Fahrenheit") {
                    t2.setText("" + t1.getText());

                    String s = t1.getText();
                    float f = Float.parseFloat(s);
                    float c = (float) ((f - 32) * 5 / 9);
                    t3.setText("" + c);

                    float k = (float) (c + 273.15);
                    t4.setText("" + k);

                } else if (x == "Kelvin") {
                    t4.setText("" + t1.getText());

                    String s = t1.getText();
                    float k = Float.parseFloat(s);
                    float c = (float) (k - 273.15);
                    t3.setText("" + c);

                    float f = (float) (c * 9 / 5 + 32);
                    t2.setText("" + f);
                }

            }
        }
    }

    public static void main(String[] args) {
        tproject p1 = new tproject();
        p1.setLayout(null);
        p1.setVisible(true);
    }
}