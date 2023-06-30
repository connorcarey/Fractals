import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComplexFractalSettingsPanel extends JPanel implements ActionListener, ChangeListener {

    // Graphic panel
    private ComplexFractalPanel complexFractalPanel;

    // Settings
    private JSlider iterationSlider;


    public ComplexFractalSettingsPanel(ComplexFractalPanel complexFractalPanel){
        this.complexFractalPanel = complexFractalPanel;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Instantiation
        iterationSlider = new JSlider(JSlider.HORIZONTAL, 0, 200, 10);
        iterationSlider.setToolTipText("Sets iterations for each pixel");
        iterationSlider.setMinorTickSpacing(10);
        iterationSlider.setMajorTickSpacing(50);
        iterationSlider.setPaintTicks(true);
        iterationSlider.setPaintLabels(true);
        iterationSlider.addChangeListener(this);

        // Labels
        JLabel iterationLabel = new JLabel("Iterations");
        iterationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components
        add(iterationLabel);
        add(iterationSlider);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
