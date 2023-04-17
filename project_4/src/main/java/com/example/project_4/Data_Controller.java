package com.example.project_4;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/project_4")
public class Data_Controller {

    public final Data_Service data_service;

    public Data_Controller(Data_Service data_service) {
        this.data_service = data_service;
    }


    @PutMapping(path = "{code}/{name}")
    public void updateInventory(@PathVariable("code") int code,
                                @PathVariable("name") String name){
        data_service.updateInventory(code,name);
    }

    @PostMapping(path = "{name}")
    public void createInventory(@PathVariable("name") String name){
        Data_class data_class = new Data_class(name);
        data_service.addData(data_class);
    }

    @GetMapping
    public List<Data_class> getInventory(){
        return data_service.getData();
    }

    @GetMapping(path = "{code}")
    public Optional<Data_class> getcur(@PathVariable("code") int code) {
        return data_service.getThis(code);
    }

}
