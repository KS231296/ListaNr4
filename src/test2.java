package zad2;

public class test2 {
    public static void main(String[] args) throws Exception {
        CommissionCompensationModel mod1 = new CommissionCompensationModel(2600, 0.3);
        BasePlusCommissionCompensationModel mod2 = new BasePlusCommissionCompensationModel(2980, 0.36,1499.75);
        BasePlusCommissionCompensationModel mod3 = new BasePlusCommissionCompensationModel(2600, 0.36,1499.75);

        Employee emp1 = new Employee("John", "Doe", "SSC123456", mod1);
        Employee emp2 = new Employee("Anna", "Smith", "SSC748596", mod2);

        System.out.println("Earnings of emp1: " + emp1.earnings());
        System.out.println("Earnings of emp2: " + emp2.earnings());

        emp1.setModel(mod3);

        System.out.println("Earnings of emp1: " + emp1.earnings());
        System.out.println("Earnings of emp2: " + emp2.earnings());


    }

}
