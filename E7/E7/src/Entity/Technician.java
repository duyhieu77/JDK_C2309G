package Entity;

public class Technician extends Staff {
    private double overtimepay;

    public Technician() {

    }

    public Technician(String name, double overtimepay,double salary) {
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
        return String.format("Technician: { name: %s, salary: %.2f, overtime pay: %.2f, paid: %.2f }",
                getName(), getSalary(), getOvertimepay(), getPaid());
    }
    
}
