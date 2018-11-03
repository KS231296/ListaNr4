package zad2;

import zad1.BasePlusCommisionEmployee;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel model;

    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel model) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.model = model;
    }

    public void setModel(CompensationModel model) {
        this.model = model;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public CompensationModel getModel() {
        return model;
    }

    public double earnings() {
        double earnings = 0;
        if (model instanceof CommissionCompensationModel) {
            earnings = ((CommissionCompensationModel) model).earnings();
        }
        if (model instanceof BasePlusCommissionCompensationModel) {
            earnings = ((BasePlusCommissionCompensationModel) model).earnings();
        }
        return earnings;
    }
}
