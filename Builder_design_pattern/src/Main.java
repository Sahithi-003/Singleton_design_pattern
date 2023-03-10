public class Main {
    public static void main(String[] args) {
        Payslip payslip = new Payslip.PayslipBuilder().setBasic(50000).setDA(1800).build();
        System.out.print("Payslip with basic and DA details: ");
        System.out.println(payslip);
        Payslip payslip2 = new Payslip.PayslipBuilder() .setBasic(50000)
                .setHRA(15000)
                .setDA(10000)
                .setTax(5000)
                .build();
        System.out.print("Payslip with All details: ");
        System.out.println(payslip2);
    }
}
