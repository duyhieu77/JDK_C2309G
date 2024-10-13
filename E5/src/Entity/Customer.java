package Entity;

public class Customer {
    private int ID;
    private String name;
    private char gender;
    private double discount;

    public Customer(int ID, String name, char gender, int discount) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

    public Customer() {;}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", discount %=" + discount +
                '}';
    }
}
