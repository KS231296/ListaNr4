package zad2;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
    private double baseSalary;


    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) throws Exception {
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}
