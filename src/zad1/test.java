package zad1;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.of(2011, 10, 22);
        Employee pracownik1 = new Employee("Anna", "Nowak", date, 999);
        date = LocalDate.of(2018, 10, 21);
        HourlyEmployee pracownik2 = new HourlyEmployee("Jan", "Kowalski", date, 888, 12.90, 37);
        date = LocalDate.of(2000, 11, 13);
        SalariedEmployee pracownik3 = new SalariedEmployee("Katarzyna", "Kowal", date, 786, 1300.00);
        date = LocalDate.of(2011, 2, 13);
        CommisionEmployee pracownik4 = new CommisionEmployee("Janina", "Kubeczek", date, 763, 3800, 0.4);
        date = LocalDate.of(2015, 5, 8);
        BasePlusCommisionEmployee pracownik5 = new BasePlusCommisionEmployee("Adam", "Nowicki", date, 453, 4300, 0.4, 260.56);

        Employee[] pracownicy = new Employee[2];
        pracownicy[0] = pracownik1;
        pracownicy[1] = pracownik2;
        Staff lista = new Staff(pracownicy);
        lista.add(pracownik3);
        lista.add(pracownik4);
        lista.add(pracownik5);

        souting(lista);

        int r = 786;
        System.out.println("REMOVE " + r);
        lista.remove(r);


        souting(lista);

    }

    private static void souting(Staff lista) {
        for (Employee x : lista.getPersonel()) {
            System.out.println(x);
            System.out.println("Staż pracy: " + x.daysOfWork() + " dni");

            if (x instanceof SalariedEmployee) {
                System.out.println("Zarobek tygodniowy: " + ((SalariedEmployee) x).zarobekTygodniowy());
            }
            if (x instanceof HourlyEmployee) {
                System.out.println("Zarobek tygodniowy: " + ((HourlyEmployee) x).zarobekTygodniowy());
            }
            if (x instanceof BasePlusCommisionEmployee) {
                System.out.println("Zarobek tygodniowy: " + ((BasePlusCommisionEmployee) x).zarobekTygodniowy());
            }
        }
    }
}
