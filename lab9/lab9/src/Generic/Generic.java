package Generic;

import java.util.List;

public interface Generic <T>{
    public T getById(int id);
    public List<T> getByName(String keyword);

}