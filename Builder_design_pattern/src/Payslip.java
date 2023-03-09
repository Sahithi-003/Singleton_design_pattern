public class Payslip {
    private final double basic;
    private final double hra;
    private final double da;
    private final double tax;

    public Payslip(double basic, double hra, double da, double tax) {
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.tax = tax;
    }

    public double getBasic() {
        return basic;
    }

    public double getHRA() {
        return hra;
    }

    public double getDA() {
        return da;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "basic=" + basic +
                ", hra=" + hra +
                ", da=" + da +
                ", tax=" + tax +
                '}';
    }
}
