//Object Class
public class Employe {
    String name;
    double salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employe (String NamaEmployee, double GajiEmployee) {
        name = NamaEmployee;
        salary = GajiEmployee; 
    }

    public void print () {
        System.out.println("Nama: "+ name);
        System.out.println("Gaji: "+ salary);
    }
}
