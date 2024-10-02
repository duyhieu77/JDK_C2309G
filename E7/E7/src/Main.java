import Entity.Manager;
import Entity.Staff;
import Entity.Technician;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Manager("Akiva", 75000, 3000));
        staffList.add(new Technician("Zul", 57000, 1000));
        staffList.add(new Technician("Zes", 66000, 4000));

        String searchName = "Akiva";

        staffList.stream()
                .filter(staff -> staff.getName().equalsIgnoreCase(searchName))
                .forEach(System.out::println);
    }
}