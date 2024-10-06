package IGeneric;

import java.util.List;

public interface IGeneric <T>{
    public T getById(int id);
    public T getByCode(String code);
    public List<T> getByName(String keyword);

}