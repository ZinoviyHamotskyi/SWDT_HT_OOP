package polygons2D;

public class Isoscele extends Triangle{
    public Isoscele(){
        System.out.println("Isoscele is created");
    }

    public double findSpaceBySin(double side, double sinA){
        this.space = 0.5 * side * side * sinA;
        return this.space;
    }
}
