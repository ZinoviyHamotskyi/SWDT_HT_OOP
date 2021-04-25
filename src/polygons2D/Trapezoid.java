package polygons2D;

public class Trapezoid extends Tetrangle{
    public Trapezoid(){
        System.out.println("Trapezoid is created");
    }

    public double findSpaceByBases(double bigBase, double smallBase, double height){
        this.space = 0.5 * (bigBase + smallBase) * height;
        return this.space;
    }
}
