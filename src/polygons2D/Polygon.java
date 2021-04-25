package polygons2D;

public class Polygon {
    protected double space;
    protected int angleNumber;

    public Polygon(){
        System.out.println("Polygon is created");
    }

    public int getAngleNumber() {
        return angleNumber;
    }

    public double getSpace() {
        return space;
    }
}
