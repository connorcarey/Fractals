import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Window extends JFrame {

    private JPanel displayPanel;
    private JPanel settingsPanel;

    public Window() {
        // Creating Window [Boilerplate]
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));
        setLayout(new BorderLayout());
        setResizable(true);
        setTitle("Fractals");

        // Set up the display card panel
        displayPanel = new JPanel();
        displayPanel.setPreferredSize(new Dimension(600, 600));
        displayPanel.setLayout(new CardLayout());

        // Set up the settings panel
        settingsPanel = new SettingsPanel(displayPanel);

        // Add components then set the frame to be visible.
        add(displayPanel, BorderLayout.CENTER);
        add(settingsPanel, BorderLayout.EAST);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
