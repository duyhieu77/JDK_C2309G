package Entity;

public class Staff {
    private int id;
    private String name;
    private Gender gender;
    private double salary;

    public Staff(int id, String name, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff[" +
                " id= " + id  +
                ", name= " + name +
                ", gender= " + gender +
                ", salary= " + salary +
                ']';
    }
}