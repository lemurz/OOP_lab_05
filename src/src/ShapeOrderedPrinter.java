import java.util.ArrayList;
import java.util.List;

public class ShapeOrderedPrinter {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        ShapeFactory factory = new ShapeFactory();

        shapes.add(factory.createNewShape("Circle",0,0,3.14));
        shapes.add(factory.createNewShape("Square",1,1,5));
        shapes.add(factory.createNewShape("Rectangle",2,2,5,6));

        OrderedPrinter printer = new OrderedPrinter(shapes);
        printer.sortShapes();
        printer.displayShapes();
    }
}