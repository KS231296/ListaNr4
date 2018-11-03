package zad1;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double baseHourly;
    private int hoursOfWeek;

    public HourlyEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double baseHourly, int hoursOfWeek) throws Exception {
        super(name, surname, dateOfEmployment, id);
        if (baseHourly > 0) {
            this.baseHourly = baseHourly;
        } else {
            throw new Exception("Stawka godzinowa musi być większa od 0");
        }
        if (hoursOfWeek <= 168 && hoursOfWeek > 0) {
            this.hoursOfWeek = hoursOfWeek;
        } else {
            throw new Exception("Liczba godzin w tygodniu musi być w przedziale (0,168]");
        }
    }

    public HourlyEmployee(int id) {
        super(id);
    }

    public double getBaseHourly() {
        return baseHourly;
    }

    public void setBaseHourly(double baseHourly) throws Exception {
        if (baseHourly > 0) {
            this.baseHourly = baseHourly;
        } else {
            throw new Exception("Stawka godzinowa musi być większa od 0");
        }
    }

    public int getHoursOfWeek() {
        return hoursOfWeek;
    }

    public void setHoursOfWeek(int hoursOfWeek) throws Exception {
        if (hoursOfWeek <= 168 && hoursOfWeek > 0) {
            this.hoursOfWeek = hoursOfWeek;
        } else {
            throw new Exception("Liczba godzin w tygodniu musi być w przedziale (0,168]");
        }
    }

    public double zarobekTygodniowy() {
        double baseHourlyWeek = baseHourly;
        if (hoursOfWeek > 40) {
            baseHourlyWeek = 1.1 * baseHourly;
        }
        return baseHourlyWeek * hoursOfWeek;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", name: " + getName() + ", surname: " + getSurname() + ", date of employment: " + getDateOfEmployment() + ", base hourly: " + getBaseHourly() + ", worked hours in week: " + getHoursOfWeek();
    }


}
