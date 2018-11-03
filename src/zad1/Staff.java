package zad1;

public class Staff {
    private Employee[] personel;

    public Staff(Employee[] personel) {
        this.personel = personel;
    }

    public Staff() {
    }

    public void add(Employee newEmployee) {
        int n = personel.length;
        Employee[] personelNew = new Employee[n + 1];
        personelNew[n] = newEmployee;
        for (int i = 0; i < n; i++) {
            personelNew[i] = personel[i];
        }
        personel = new Employee[n + 1];
        personel = personelNew;
    }

    public void remove(int id) {
        int n = personel.length;
        Employee[] personelNew = new Employee[n - 1];
        for (int i = 0; i < n; i++) {
            personelNew[i] = personel[i];
            if (personel[i].getId() == id) {
                for (int j = i; j < (n - 1); j++) personelNew[j] = personel[j + 1];
                break;
            }
        }
        personel = new Employee[n + 1];
        personel = personelNew;
    }

    public Employee[] getPersonel() {
        return personel;
    }

    public void setPersonel(Employee[] personel) {
        this.personel = personel;
    }


}
