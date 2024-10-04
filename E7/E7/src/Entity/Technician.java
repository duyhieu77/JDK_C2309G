package Entity;

public class Technician extends Staff {
    private double overtimepay;

    public Technician() {

    }

    public Technician(String name, double overtimepay, double salary) {
        super(name, salary);
        this.overtimepay = overtimepay;
    }

    public double getOvertimepay() {
        return overtimepay;
    }

    public void setOvertimepay(double overtimepay) {
        this.overtimepay = overtimepay;
    }

    @Override
    public double getPaid() {
        return getSalary() + overtimepay;
    }

    @Override
    public String toString() {
        return "Technician: { name: " + getName() +
                ", salary: " + getSalary() +
                ", overtime pay: " + getOvertimepay() +
                ", paid: " + getPaid() + " }";
    }
}