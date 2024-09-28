package Controller;

import Entity.Staff;
import Entity.Gender;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StaffController {
    private static List<Staff> staffs;

    public StaffController(List<Staff> staffs) {
        StaffController.staffs = staffs;
    }

    public Optional<Staff> getHighestSalary() {
        return staffs.stream()
                .filter(staff -> staff.getGender() == Gender.FEMALE)
                .max(Comparator.comparing(Staff::getSalary));
    }

    public Staff getById(int id) {
        return staffs.stream()
                .filter(staff -> staff.getId()==(id))
                .findFirst()
                .orElse(null);
    }

    public List<Staff> getByName(String name) {
        return staffs.stream()
                .filter(staff -> staff.getName().equalsIgnoreCase(name))
                .toList();
    }
}