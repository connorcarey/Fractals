import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FractalPanel extends JPanel implements MouseMotionListener, MouseListener, MouseWheelListener {

    protected double xPos;
    protected double yPos;
    protected double[] reference;
    protected double xNot;
    protected double yNot;
    protected float scale;
    private Color background;

    public FractalPanel() {
        xPos = 0f;
        yPos = 0f;
        reference = new double[]{yPos, xPos};

        scale = 1f;
        background = Color.BLACK;

        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        setBackground(background);
        setPreferredSize(new Dimension(800, 800));
    }

    @Override
    public void setBackground(Color color) {
        background = color;
        super.setBackground(color);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xPos = xPos + (e.getX() - xNot) * (1 / scale);
        yPos = yPos - (e.getY() - yNot) * (1 / scale);
        xNot = e.getX();
        yNot = e.getY();
        reference = new double[]{xPos, yPos};
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
            scale = 1f;
        }
        System.out.println("Scale: "+scale);
        repaint();
    }
}
