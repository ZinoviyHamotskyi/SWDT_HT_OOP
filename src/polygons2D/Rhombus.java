package polygons2D;

public class Rhombus extends Parallelogram{
    public Rhombus(){
        System.out.println("Rhombus is created");
    }

    public double findSpaceByDiagonals(double bigDiagonal, double smallDiagonal){
        this.space = 0.5 * bigDiagonal * smallDiagonal;
        return this.space;
    }
}
