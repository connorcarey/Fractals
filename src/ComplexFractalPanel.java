import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class ComplexFractalPanel extends JPanel implements MouseListener, MouseMotionListener {


    enum Fractal {
        MANDELBROT,
        BURNING_SHIP
    }

    // Placeholder
    private Fractal current;

    // Display settings
    private int resolutionModifier;

    // Camera
    private double xPos;
    private double yPos;
    private double zoom;

    public ComplexFractalPanel() {
        current = Fractal.MANDELBROT;
        resolutionModifier = 10;
    }

    private void getMandelbrot(int x, int y){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        int rm = resolutionModifier;
        for(int y = 0; y <= getHeight() - rm; y += rm){
            for(int x = 0; x <= getWidth() - rm; x += rm){
                int col = getRandomRange(0, Integer.MAX_VALUE);
                for(int i = 0; i < rm; i++){
                    for(int j = 0; j < rm; j++){
                        img.setRGB(x+j, y+i, col);
                    }
                }
            }
        }
        g.drawImage(img, 0, 0, null);
    }

    public void setResolution(int resolution){
        resolutionModifier = resolution;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    // Helper method to get random range [inclusive, exclusive)
    private int getRandomRange(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }
}
