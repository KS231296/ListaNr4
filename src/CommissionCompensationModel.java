package zad2;

public class CommissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) throws  Exception{
        this.grossSales = grossSales;
        if(commissionRate < 1.0 && commissionRate > 0) {
            this.commissionRate = commissionRate;
        }
        else {
            throw new Exception("unexpected commision rate");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) throws Exception {
        if(commissionRate < 1.0 && commissionRate > 0) {
            this.commissionRate = commissionRate;
        }
        else {
            throw new Exception("unexpected commision rate");
        }
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}
