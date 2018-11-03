package zad1;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double baseMonthly;

    public SalariedEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double baseMonthly) throws Exception {
        super(name, surname, dateOfEmployment, id);
        if (baseMonthly >= 0) {
            this.baseMonthly = baseMonthly;
        } else {
            throw new Exception("Wynagrodzenie nie może być mniejsze od 0");
        }
    }

    public SalariedEmployee(int id) {
        super(id);
    }

    public double getBaseMonthly() {
        return baseMonthly;
    }

    public void setBaseMonthly(double baseMonthly) throws Exception {
        if (baseMonthly >= 0) {
            this.baseMonthly = baseMonthly;
        } else {
            throw new Exception("Wynagrodzenie nie może być mniejsze od 0");
        }
    }



    public double zarobekTygodniowy() {
        return baseMonthly / 4;
    }


    @Override
    public String toString() {
        return "ID: " + getId() + ", name: " + getName() + ", surname: " + getSurname() + ", date of employment: " + getDateOfEmployment() + ", base monthly: " + getBaseMonthly();
    }


}
