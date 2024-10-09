package iGeneric;

import Entity.Customer;

import java.util.List;

public interface Generic<T> {
    T getById(int id);
    void update(T object);
    List<T> getByName(String name);

}