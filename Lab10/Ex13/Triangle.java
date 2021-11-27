package Lab10.Ex13;

public class Triangle extends TwoDimensionalShape
{

    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3)
    {
        setEdge1(edge1);
        setEdge2(edge2);
        setEdge3(edge3);
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public double getEdge1() {
        return edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    @Override
    public double calculateArea()
    {
        double semiSum = (getEdge1()+getEdge2()+getEdge3())/2;
        return (Math.sqrt(semiSum*(semiSum-getEdge1())*(semiSum-getEdge2())*(semiSum-getEdge3())));
    }

    @Override
    public String toString()
    {
        return String.format("%s\tEdge1: %.2f\n\tEdge2: %.2f\n\tEdge3: %.2f\n",super.toString(),getEdge1(),getEdge2(),getEdge3());
    }

}
