package com.example.project_4;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class Data_Service {

    private final Data_Repository data_repository;

    public Data_Service(Data_Repository data_repository) {
        this.data_repository = data_repository;
    }

    public void addData(Data_class data_class){
        if(data_repository.findById(data_class.getID()).isPresent())
            throw new IllegalStateException("Email already taken");

        data_repository.save(data_class);
    }

    public List<Data_class> getData() {
        return data_repository.findAll();
    }

    public Optional<Data_class> getThis(int id){
        return data_repository.findById(id);
    }

    @Transactional
    public void updateInventory(int code, String name) {
        Data_class data_class = data_repository.findById(code)
                .orElseThrow(() -> new IllegalStateException("Data "+code+" doesn't exist"));

        if(name!=null && name.length()>0){
            data_class.setName(name);
        }

    }

}
