public class PayslipBuilder {
    private double basic;
    private double hra;
    private double da;
    private double tax;

    public PayslipBuilder() {
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
        return new Payslip(basic, hra, da, tax);
    }
}
