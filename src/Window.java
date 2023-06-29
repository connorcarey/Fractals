import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Window extends JFrame {

    JPanel cFractal;
    JPanel settings;

    public Window() {
        // Creating Window [Boilerplate]
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));
        setLayout(new BorderLayout());
        setResizable(true);
        setTitle("Fractals");

        // Add Fractal Panel
        cFractal = new ComplexFractalPanel();
        add(cFractal, BorderLayout.CENTER);

        // Setup and add Settings Panel
        settings = new JPanel();
        settings.setBorder(new TitledBorder("Settings"));
        settings.setPreferredSize(new Dimension(200, 600));
        settings.setLayout(new CardLayout());
        add(settings, BorderLayout.EAST);

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
