package Entity;

public abstract class Staff {
    private String name;
    private double salary;

    public Staff() {

    }

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getPaid();

    @Override
    public String toString() {
        return String.format("Staff: { name: %s, salary: %.2f }", name, salary);
    }
}
