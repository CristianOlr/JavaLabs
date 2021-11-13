package Lab8.Ex4;

public class Rectangle {
    private double length;
    private double width;
    private double perimeter, area;

    public Rectangle(double length, double width) {
        this.length = 1;
        this.width = 1;
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        perimeter = 2*(length+width);
        return perimeter;
    }

    public double calculateArea() {
        area = length*width;
        return area;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setLength(double length) {
        if ((length>0)&&(length<20))
            this.length = length;
    }

    public void setWidth(double width) {
        if ((width>0)&&(width<20))
            this.width = width;
    }
}
