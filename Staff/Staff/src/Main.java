import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import Entity.Staff;
import Entity.Gender;

public class Main {
    public static void main(String[] args) {
        List<Staff> staffs = new ArrayList<>();

        staffs.add(new Staff(1, "NiCo", Gender.FEMALE, 2000));
        staffs.add(new Staff(2, "Sam", Gender.MALE, 3000));
        staffs.add(new Staff(3, "AKo", Gender.FEMALE, 6000));
        staffs.add(new Staff(4, "Guts", Gender.MALE, 9000));

        Staff HighestFemaleSalary = staffs.stream()
                .filter(staff -> staff.getGender() == Gender.FEMALE)
                .max(Comparator.comparing(Staff::getSalary))
                .orElse(null);
        System.out.println("Highest Salary Female Staff: " + HighestFemaleSalary);

        int searchId = 1;
        Staff staffById = staffs.stream()
                .filter(staff -> staff.getId() == searchId)
                .findFirst()
                .orElse(null);
        System.out.println("\nStaff with ID " + searchId + ": " + staffById);

        String searchName = "A";
        List<Staff> staffByName = staffs.stream()
                .filter(staff -> staff.getName().contains(searchName))
                .toList();

        System.out.println("Staff with  " + searchName );
        staffByName.forEach(System.out::println);
    }
}