package Lab10.Ex13;

public class Circle extends TwoDimensionalShape
{
    private double radius;

    public Circle(double r)
    {
        setRadius(r);
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public double calculateArea()
    {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public String toString()
    {
        return String.format("%s\tRadius: %.2f\n",super.toString(),getRadius());
    }

}
