package polygons2D;

public class Rectangle extends Parallelogram{
    public Rectangle(){
        System.out.println("Rectangle is created");
    }

    public double findSpaceBySides(double sideA, double sideB){
        this.space = sideA * sideB;
        return this.space;
    }
}
