import polygons2D.*;

public class Main {
    public static void main (String args[]){

        Trapezoid trapezoid = new Trapezoid();



        System.out.println(trapezoid.getClass());
        System.out.println(trapezoid.findSpaceByBases(10, 6, 5));
        System.out.println(trapezoid.getAngleNumber());

        Rhombus rhombus = new Rhombus();
        System.out.println(rhombus.getClass());
        System.out.println(rhombus.findSpaceByDiagonals(10, 8));
        System.out.println(rhombus.getAngleNumber());

        Isoscele isoscele = new Isoscele();
        System.out.println(isoscele.getClass());
        System.out.println(isoscele.findSpaceBySin(10, 1));
        System.out.println(isoscele.getAngleNumber());

    }
}
