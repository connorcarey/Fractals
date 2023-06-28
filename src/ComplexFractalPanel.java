import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComplexFractalPanel extends JPanel {

    public ComplexFractalPanel() {
        setBackground(Color.RED);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        for(int y = 0; y < getHeight(); y++) {
            for(int x = 0; x < getWidth(); x++){
                img.setRGB(x, y, 1);
            }
        }
        g.drawImage(img, 0, 0, null);
    }
}
