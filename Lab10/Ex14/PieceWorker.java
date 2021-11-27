package Lab10.Ex14;

public class PieceWorker extends Employee{

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber, double wage, int pieces)
    {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setPieces(pieces);
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");
        this.wage = wage;
    }

    public void setPieces(int pieces) {
        if (pieces < 0)
            throw new IllegalArgumentException(
                    "Number of pieces must be >= 0");
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings()
    {
        return getPieces()*getWage();
    }

    @Override
    public String toString()
    {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %d,",
                super.toString(), "hourly wage", getWage(),
                "pieces produced", getPieces());
    }
}
