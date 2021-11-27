package Lab10.Ex13;

public class Square extends TwoDimensionalShape
{
    private double length;

    public Square(double l)
    {
        setLength(l);
    }

    public void setLength(double l)
    {
        length = l;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public double calculateArea()
    {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString()
    {
        return String.format("%s\tLength: %.2f\n",super.toString(),getLength());
    }
}
