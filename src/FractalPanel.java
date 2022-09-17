import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FractalPanel extends JPanel implements MouseMotionListener, MouseListener, MouseWheelListener {

    double xPos;
    double yPos;
    double xNot;
    double yNot;
    int height;
    int width;
    int iterations;
    double scale;
    Color[][] pixels;
    Color background;

    public FractalPanel() {
        xPos = 0f;
        yPos = 0f;
        width = 800;
        height = 800;
        iterations = 50;

        pixels = new Color[width][height];
        scale = 1.0;
        background = Color.BLACK;

        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        setBackground(background);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void setBackground(Color color) {
        background = color;
        super.setBackground(color);
    }

    @Override
    public void setPreferredSize(Dimension preferredSize) {
        width = (int) preferredSize.getWidth();
        height = (int) preferredSize.getHeight();
        super.setPreferredSize(preferredSize);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xPos = xPos + (e.getX() - xNot) * (1 / scale);
        yPos = yPos - (e.getY() - yNot) * (1 / scale);
        xNot = e.getX();
        yNot = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xNot = e.getX();
        yNot = e.getY();
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
    public void mouseWheelMoved(MouseWheelEvent e) {
        scale *= e.getWheelRotation() > 0 ? 0.9 : 1.1;
        if (scale <= 1.0) {
            scale = 1.0;
        }
        System.out.println(scale);
        repaint();
    }
}
