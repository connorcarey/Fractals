public class FractalPoint {

    private double xPos;
    private double yPos;
    private double xOrig;
    private double yOrig;
    private double width;
    private double height;
    float scale;
    public FractalPoint(double[] coords, double[] reference, double width, double height, float scale){
        setPoint(coords, reference, width, height, scale);
    }

    public void setPoint(double [] coords, double[] reference, double width, double height, float scale){
        setCoords(coords);
        setReference(reference);
        setHeight(height);
        setWidth(width);
        setScale(scale);
    }

    public void setXPoint(double x){
        xPos = x;
    }

    public double getXPoint(){
        return xPos;
    }

    public void setYPoint(double y){
        yPos = y;
    }

    public double getYPoint(){
        return yPos;
    }

    public void setCoords(double[] coords){
        setXPoint(coords[0]);
        setYPoint(coords[1]);
    }

    public void setXOrig(double x){
        xOrig = x;
    }

    public double getXOrig(){
        return xOrig;
    }

    public void setYOrig(double y){
        yOrig = y;
    }

    public double getYOrig(){
        return yOrig;
    }

    public void setReference(double[] reference){
        setXOrig(reference[0]);
        setYOrig(reference[1]);
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setScale(float scale){
        this.scale = scale;
    }

    public float getScale(){
        return scale;
    }

    public int[] calculatePoint(){
        int[] ary = new int[2];
        ary[0] = (int)calculateX();
        ary[1] = (int)calculateY();
        return ary;
    }

    public double calculateX(){
        return (xOrig - xPos) * scale + width/2;
    }

    public double calculateY(){
        return (-yOrig - yPos) * scale + height/2;
    }

    @Override
    public String toString(){
        return "XPos: "+xPos+", YPos: "+yPos;
    }
}
