// The heart of the program

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SettingsPanel extends JPanel implements ActionListener, ItemListener {

    private JPanel displayPanel; // CardLayout Panel with graphics
    private JPanel cardPanel; // Panel with the different settings for each fractal

    // Constants

    private static final String MANDELBROT = "Mandelbrot";
    private static final String TEST_OPTION = "Testing...";

    public SettingsPanel(JPanel displayPanel){
        this.displayPanel = displayPanel;
        setPreferredSize(new Dimension(200, 600));
        setLayout(new FlowLayout());
        setBorder(new TitledBorder("Settings"));

        cardPanel = new JPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
