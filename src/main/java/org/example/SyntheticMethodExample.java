package org.example;

public class SyntheticMethodExample implements CrudService<PropertyDetails, Long> {

    @Override
    public PropertyDetails getById(Long id) {
        id++;
        return new PropertyDetails();
    }

}