public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getcorner());

        var rectangel = new Rectangle();

        System.out.println(rectangel.getcorner());
        System.out.println(rectangel.getparentcorner());
    }
}
