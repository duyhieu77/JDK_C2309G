package Generic;

import java.util.List;

public interface Generic<T> {
    void add(T entity);
    T getById(int id);
    List<T> getAll();
    void update(T entity);
}


