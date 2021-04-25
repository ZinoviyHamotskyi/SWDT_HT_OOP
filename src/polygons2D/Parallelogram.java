package polygons2D;

public class Parallelogram extends Tetrangle{
    public Parallelogram(){
        System.out.println("Parrallelogram is created");
    }

    public double findSpaceBySin(double sideA, double sideB, double sinA){
        this.space = 0.5 * sideA * sideB * sinA;
        return this.space;
    }
}
