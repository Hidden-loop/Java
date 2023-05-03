import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class empid extends Frame implements ActionListener {
    Label fname, lname, age, ss, hss;
    TextField t1, t2, t3, t4, t5;
    Button eq;

    public empid() {

        Frame ex = new Frame();

        Label head = new Label("Details");
        head.setBounds(250, 50, 50, 20);

        fname = new Label("First Name");
        fname.setBounds(100, 80, 80, 30);
        t1 = new TextField();
        t1.setBounds(250, 80, 150, 30);

        lname = new Label("Last Name");
        lname.setBounds(100, 120, 80, 30);
        t2 = new TextField();
        t2.setBounds(250, 120, 150, 30);

        age = new Label("Age");
        age.setBounds(100, 160, 80, 30);
        t3 = new TextField();
        t3.setBounds(250, 160, 150, 30);

        ss = new Label("Secondary Score");
        ss.setBounds(100, 200, 100, 30);
        t4 = new TextField();
        t4.setBounds(250, 200, 150, 30);

        hss = new Label("Higher Secondary Score");
        hss.setBounds(100, 240, 150, 30);
        t5 = new TextField();
        t5.setBounds(250, 240, 150, 30);

        eq = new Button("SAVE");
        eq.setBounds(175, 300, 80, 30);
        eq.addActionListener(this);

        Button q = new Button("exit");
        q.setBounds(185, 335, 65, 30);
        q.addActionListener(e1 -> System.exit(0));

        ex.add(head);
        ex.add(fname);
        ex.add(lname);
        ex.add(age);
        ex.add(ss);
        ex.add(hss);

        ex.add(t1);
        ex.add(t2);
        ex.add(t3);
        ex.add(t4);
        ex.add(t5);

        ex.add(eq);
        ex.add(q);

        ex.setSize(500, 400);
        ex.setTitle("emp info");
        ex.setLayout(null);
        ex.setVisible(true);

        ex.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ex.dispose();
            }
        });
    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == eq) {
            String fnam = t1.getText();
            String name = t2.getText();
            int ag = Integer.parseInt(t3.getText());
            int smarks = Integer.parseInt(t4.getText());
            int marks = Integer.parseInt(t5.getText());
            OutputFrame outputFrame = new OutputFrame(fnam, name, ag, smarks, marks);
        }

    }

    public static void main(String[] args) {

        empid e1 = new empid();
    }
}

class OutputFrame extends Frame {
    Label nameLabel, lnameLabel, ageLabel, marksLabel, smarksLabel, nameOutput, ageOutput, marksOutput, lnameOutput, smarksOutput;

    public OutputFrame(String fnam, String name, int age, int smarks, int marks) {
        setLayout(new GridLayout(5, 2));
        nameLabel = new Label("First Name: ");
        add(nameLabel);
        nameOutput = new Label(fnam);
        add(nameOutput);

        lnameLabel = new Label("Last Name: ");
        add(lnameLabel);
        lnameOutput = new Label(name);
        add(lnameOutput);

        ageLabel = new Label("Age: ");
        add(ageLabel);
        ageOutput = new Label(Integer.toString(age));
        add(ageOutput);

        marksLabel = new Label("Marks: ");
        add(marksLabel);
        marksOutput = new Label(Integer.toString(smarks));
        add(marksOutput);

        smarksLabel = new Label("HSC Marks: ");
        add(smarksLabel);
        smarksOutput = new Label(Integer.toString(marks));
        add(smarksOutput);

        setTitle("Output Frame");
        setSize(400, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
//class em extends Frame implements ActionListener {
//
//    }
//}