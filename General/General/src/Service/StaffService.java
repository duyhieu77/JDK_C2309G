package Service;

import Entity.Staff;
import IGeneric.IGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StaffService implements IGeneric<Staff> {
    private final List<Staff> staffs = new ArrayList<>();

    public StaffService(List<Staff> staffs) {
        this.staffs.addAll(staffs);
    }

    @Override
    public Staff getById(int id) {
        Optional<Staff> staff = staffs.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        return staff.orElse(null);
    }

    @Override
    public Staff getByCode(String code) {
        Optional<Staff> staff = staffs.stream()
                .filter(s -> s.getCode().equalsIgnoreCase(code))
                .findFirst();
        return staff.orElse(null);
    }

    @Override
    public List<Staff> getByName(String keyword) {
        return staffs.stream()
                .filter(s -> s.getName().equalsIgnoreCase(keyword))
                .toList();
    }

}
