package Entity;

public class Manager extends Staff {
    private double allowance;

    public Manager() {

    }

    public Manager(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double getPaid() {
        return getSalary() + allowance;
    }

    @Override
    public String toString() {
        return "Manager: { name: " + getName() +
                ", salary: " + getSalary() +
                ", allowance: " + getAllowance() +
                ", paid: " + getPaid() + " }";
    }
}