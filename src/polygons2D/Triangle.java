package polygons2D;

public class Triangle extends Polygon{
    public Triangle(){
        this.angleNumber = 3;
        System.out.println("Tetrangle is created");
    }

    public double findSpaceByHeight(double side, double height){
        this.space = side*height;
        return this.space;
    }
}
