package zad1;

import java.time.LocalDate;

public class CommisionEmployee extends Employee {
    private double comissionPercent;
    private double sales;

    public CommisionEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double sales, double comissionPercent) throws Exception {
        super(name, surname, dateOfEmployment, id);
        if (sales < 0) {
            throw new Exception("Sprzedaż mniejsza od 0");
        } else {
            this.sales = sales;
        }
        if (comissionPercent > 0 && comissionPercent < 1) {
            this.comissionPercent = comissionPercent;
        } else {
            throw new Exception("Nieprawidłowy procent");
        }

    }

    public CommisionEmployee(int id) {
        super(id);
    }

    public double getComissionPercent() {
        return comissionPercent;
    }

    public void setComissionPercent(double comissionPercent) throws Exception {
        if (comissionPercent > 0 && comissionPercent < 1) {
            this.comissionPercent = comissionPercent;
        } else {
            throw new Exception("Nieprawidłowy procent");
        }
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) throws Exception {
        if (sales < 0) {
            throw new Exception("Sprzedaż mniejsza od 0");
        } else {
            this.sales = sales;
        }
    }

    public double provision() {
        return  sales*comissionPercent;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + ", name: " + getName() + ", surname: " + getSurname() + ", date of employment: " + getDateOfEmployment() + ", month sales: " + getSales() + ", comission percent: " + getComissionPercent();
    }


}
