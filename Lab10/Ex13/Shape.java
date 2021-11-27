package Lab10.Ex13;

public abstract class Shape
{
    public String getClassName() {
        String className = this.getClass().getSimpleName();
        System.out.print("Object : ");
        return className;
    }

    @Override
    public String toString()
    {
        return String.format("%s\n", getClassName());
    }

}
