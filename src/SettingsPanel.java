// The heart of the program

import javax.swing.*;
import javax.swing.border.StrokeBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SettingsPanel extends JPanel implements ActionListener, ItemListener {

    private JPanel displayPanel; // CardLayout Panel with graphics
    private JPanel cardPanel; // Panel with the different settings for each fractal
    private JComboBox optionsBox; // Combo box with different card options

    // Settings panels
    private ComplexFractalSettingsPanel complexFractalSettingsPanel;

    // Constants

    private static final String MANDELBROT = "Mandelbrot";
    private static final String TEST_OPTION = "Testing...";

    public SettingsPanel(JPanel displayPanel) {
        this.displayPanel = displayPanel;

        // Create the card settings panels
        complexFractalSettingsPanel = new ComplexFractalSettingsPanel(new ComplexFractalPanel());

        // Set up panel parameters
        setPreferredSize(new Dimension(200, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new TitledBorder("Settings"));

        // Set up the display panel
        displayPanel.add(MANDELBROT, new ComplexFractalPanel());

        // Set up the card panel
        cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout());
        cardPanel.add(complexFractalSettingsPanel, "COMPLEX");
        //cardPanel.setBorder(new StrokeBorder(new BasicStroke(2), Color.BLACK));

        // Set up the combo box
        String[] options = {MANDELBROT, TEST_OPTION};
        optionsBox = new JComboBox(options);

        // Add components
        add(optionsBox);
        add(cardPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
