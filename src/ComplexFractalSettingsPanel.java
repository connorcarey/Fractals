import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComplexFractalSettingsPanel extends JPanel implements ChangeListener {

    // Graphic panel
    private ComplexFractalPanel complexFractalPanel;

    // Settings
    private JSlider iterationSlider;
    private JSlider resolutionSlider;


    public ComplexFractalSettingsPanel(ComplexFractalPanel complexFractalPanel){
        this.complexFractalPanel = complexFractalPanel;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Create components
        iterationSlider = new JSlider(JSlider.HORIZONTAL, 0, 200, 10);
        iterationSlider.setToolTipText("Sets iterations for each pixel");
        iterationSlider.setMinorTickSpacing(10);
        iterationSlider.setMajorTickSpacing(50);
        iterationSlider.setPaintTicks(true);
        iterationSlider.setPaintLabels(true);
        iterationSlider.addChangeListener(this);

        resolutionSlider = new JSlider(JSlider.HORIZONTAL, 1, 15, 5);
        resolutionSlider.setToolTipText("Sets the resolution of the display panel");
        resolutionSlider.setMinorTickSpacing(1);
        resolutionSlider.setMajorTickSpacing(5);
        resolutionSlider.setPaintTicks(true);
        resolutionSlider.setPaintLabels(true);
        resolutionSlider.addChangeListener(this);





        // Labels
        JLabel iterationLabel = new JLabel("Iterations");
        iterationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel resolutionLabel = new JLabel("Resolution");
        resolutionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components
        add(iterationLabel);
        add(iterationSlider);
        add(resolutionLabel);
        add(resolutionSlider);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if(!source.getValueIsAdjusting()){
            if(source == resolutionSlider){
                complexFractalPanel.setResolution(source.getValue());
                complexFractalPanel.repaint();
            }
        }
    }
}
