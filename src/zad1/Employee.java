package zad1;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Employee {
    private String name;
    private String surname;
    private LocalDate dateOfEmployment;
    private final int id;

    public Employee(String name, String surname, LocalDate dateOfEmployment, int id) {

        this.name = name;
        this.surname = surname;
        this.dateOfEmployment = dateOfEmployment;
        this.id = id;

    }

    public Employee(int id) {

        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString() {

        return "ID: " + id + ", name: " + name + ", surname: " + surname + ", date of employment: " + dateOfEmployment;
    }

    public long daysOfWork() {
        return DAYS.between(dateOfEmployment, LocalDate.now());
    }



}
