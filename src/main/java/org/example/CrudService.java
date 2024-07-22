package org.example;

import java.util.List;

public interface CrudService<T, ID> {
    public T getById(ID id);
}
