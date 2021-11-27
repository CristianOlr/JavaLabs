package Lab10.Ex13;

public class Tetrahedron extends ThreeDimensionalShape
{
    private double edge;

    public Tetrahedron(double e)
    {
        setEdge(e);
    }

    public void setEdge(double e)
    {
        edge = e;
    }

    public double getEdge()
    {
        return edge;
    }

    public double calculateArea()
    {
        return Math.sqrt(3) * Math.pow(getEdge(), 2);
    }
    public double calculateVolume()
    {
        return  Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString()
    {
        return String.format("%s\tEdge: %.2f\n",super.toString(),getEdge());
    }


}
