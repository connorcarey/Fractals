import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComplexFractalPanel extends JPanel {

    enum Fractal {
        MANDELBROT,
        BURNING_SHIP
    }

    Fractal current;

    public ComplexFractalPanel() {
        setBackground(Color.RED);
        current = Fractal.MANDELBROT;
    }

    private void getMandelbrot(int x, int y){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        for(int y = 0; y < getHeight(); y++) {
            for(int x = 0; x < getWidth(); x++){
                img.setRGB(x, y, getRandomRange(0, Integer.MAX_VALUE));
            }
        }
        g.drawImage(img, 0, 0, null);
    }

    // Helper method to get random range [inclusive, exclusive)
    private int getRandomRange(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }
}
