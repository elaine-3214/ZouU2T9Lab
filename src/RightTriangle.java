public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double aSqr = Math.pow(base,2);
        double bSqr = Math.pow(height,2);
        double cSqr = aSqr+bSqr;
        double c = Math.sqrt(cSqr);
        return c;
    }
}
