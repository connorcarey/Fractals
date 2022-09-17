import java.awt.*;

public class SierpinskiTriangle extends FractalPanel{

    // crabby patty formula: g.drawRect((int) ((xPos - (startLeft)) * scale + width / 2f), (int) ((-yPos - (startTop)) * scale + height / 2f), (int) ((width) * scale), (int) ((height) * scale));
    // will replace with FractalPoint Code ^_^

    public SierpinskiTriangle(){
        super();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawPolygon(new int[]{(int)((xPos+50)*scale+width/2f),
                        (int)((xPos)*scale+width/2f),
                        (int)((xPos-50)*scale+width/2f)},
                new int[]{(int)((-yPos+50)*scale+height/2f),
                        (int)((-yPos-50)*scale+height/2f),
                        (int)((-yPos+50)*scale+height/2f)}, 3);
        drawSierpinski(g, iterations, -50, 50, 100, 100);
    }



    private void drawSierpinski(Graphics g, int iterations, double x, double y, double width, double height) {
        if(iterations <= 0){
            return;
        }

        int[] xPoints = {(int) ((xPos - x - width / 4f) * scale + this.width / 2f),
                (int) ((xPos - x - width / 2f) * scale + this.width / 2f),
                (int) ((xPos - x - width / 4f - width / 2f) * scale + this.width / 2f)};

        int[] yPoints = {(int) ((-yPos - y + height / 2f) * scale + this.height / 2f),
                (int) ((-yPos - y + height) * scale + this.height / 2f),
                (int) ((-yPos - y + height / 2f) * scale + this.height / 2f)};

        if(xPoints[0]-xPoints[1] == 0){
            return;
        }

        g.drawPolygon(xPoints, yPoints, 3);

        drawSierpinski(g, iterations-1, x, y-height/2, width/2, height/2);
        drawSierpinski(g, iterations-1, x + width/4, y, width/2, height/2);
        drawSierpinski(g, iterations-1, x+width/2, y-height/2, width/2, height/2);
    }
}
