import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class painter extends JFrame {
    int x = -10, y = -10;

    public painter() {

        super("Simple Program");

        getContentPane().add(
                new Label("Drag the mouse to draw"), BorderLayout.SOUTH);


        addMouseMotionListener(

                new MouseMotionAdapter() {
                    // store drag coordinates and repaint
                    public void mouseDragged(MouseEvent event) {
                        x = event.getX();
                        y = event.getY();
                        repaint();
                    }
                }

        );

        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 4, 4);
    }

    public static void main(String args[]) {
        painter application = new painter();
        application.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent event) {
                        System.exit(0);
                    }
                }
        );
    }
}