public class Payslip {
    private final double basic;
    private final double hra;
    private final double da;
    private final double tax;

    private Payslip(double basic, double hra, double da, double tax) {
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
    public static class PayslipBuilder {
        private double basic;
        private double hra;
        private double da;
        private double tax;
        private Payslip payslip;

        public PayslipBuilder() {
            payslip = new Payslip(this.basic,this.hra,this.da,this.tax);
        }

        public PayslipBuilder setBasic(double basic) {
            this.basic = basic;
            return this;
        }

        public PayslipBuilder setHRA(double hra) {
            this.hra = hra;
            return this;
        }

        public PayslipBuilder setDA(double da) {
            this.da = da;
            return this;
        }

        public PayslipBuilder setTax(double tax) {
            this.tax = tax;
            return this;
        }

        public Payslip build() {
            return payslip;
        }
    }
}
