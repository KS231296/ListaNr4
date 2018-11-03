package zad1;

import java.time.LocalDate;

public class BasePlusCommisionEmployee extends CommisionEmployee {

    private double baseWeekly;

    public BasePlusCommisionEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double sales, double comissionPercent, double baseWeekly) throws Exception {
        super(name, surname, dateOfEmployment, id, sales, comissionPercent);
        if (baseWeekly < 0) {
            throw new Exception("Wynagrodzenie mniejsza od 0");
        } else {
            this.baseWeekly = baseWeekly;
        }
    }

    public BasePlusCommisionEmployee(int id) {
        super(id);
    }

    public double getBaseWeekly() {
        return baseWeekly;
    }

    public void setBaseWeekly(double baseWeekly) throws Exception {
        if (baseWeekly < 0) {
            throw new Exception("Wynagrodzenie mniejsza od 0");
        } else {
            this.baseWeekly = baseWeekly;
        }
    }


    public double zarobekTygodniowy() {
        return baseWeekly + this.provision();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", name: " + getName() + ", surname: " + getSurname() + ", date of employment: " + getDateOfEmployment() + ", month sales: " + getSales() + ", comission percent: " + getComissionPercent() + ", weekly base: " + getBaseWeekly();
    }
}
