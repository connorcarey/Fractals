// The heart of the program

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SettingsPanel extends JPanel implements ItemListener {

    private JPanel displayPanel; // CardLayout Panel with graphics
    private JPanel cardPanel; // Panel with the different settings for each fractal

    // Settings panels
    private ComplexFractalSettingsPanel complexFractalSettingsPanel; // Card with the complex fractal settings

    // Constants

    private static final String COMPLEX_FRACTAL = "Complex Fractals";
    private static final String TEST_OPTION = "Testing...";

    public SettingsPanel(JPanel displayPanel) {
        this.displayPanel = displayPanel;

        // Set up panel parameters
        setPreferredSize(new Dimension(200, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new TitledBorder("Settings"));

        // Set up the display panel
        displayPanel.add(new ComplexFractalPanel(), COMPLEX_FRACTAL);

        // Create the card settings panels & Test panels
        complexFractalSettingsPanel = new ComplexFractalSettingsPanel(new ComplexFractalPanel());

        JPanel testPanel = new JPanel();
        testPanel.setPreferredSize(new Dimension(600, 600));
        testPanel.setBackground(Color.RED);

        // Set up the card panel
        cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout());
        cardPanel.setBorder(new TitledBorder(""));

        // Set up the combo box
        String[] options = {COMPLEX_FRACTAL, TEST_OPTION};
        JComboBox optionsBox = new JComboBox(options);
        optionsBox.setFocusable(false);
        optionsBox.addItemListener(this);

        // Add components
        cardPanel.add(complexFractalSettingsPanel, COMPLEX_FRACTAL);
        cardPanel.add(testPanel, TEST_OPTION);

        add(optionsBox);
        add(cardPanel);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel, (String)e.getItem());
        revalidate();
    }
}
