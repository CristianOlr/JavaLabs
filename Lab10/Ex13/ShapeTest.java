package Lab10.Ex13;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Square(5.0);
        shapes[1] = new Triangle(3, 4, 5);
        shapes[2] = new Circle(5.0);
        shapes[3] = new Sphere(5.0);
        shapes[4] = new Cube(5.0);
        shapes[5] = new Tetrahedron(5.0);

        for (Shape s : shapes) {
            if (s instanceof TwoDimensionalShape)
                System.out.printf("%s\tArea: %.2f\n\n", s.toString(), ((TwoDimensionalShape) s).calculateArea());
            else if (s instanceof ThreeDimensionalShape)
                System.out.printf("%s\tSurface Area: %.2f\n\tVolume: %.2f\n\n", s.toString(),
                        ((ThreeDimensionalShape) s).calculateArea(),
                        ((ThreeDimensionalShape) s).calculateVolume());
        }
    }
}
