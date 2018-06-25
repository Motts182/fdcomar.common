package com.entitys.comercios_entitys.controllers;

import com.entitys.comercios_entitys.models.TB_REQ_ADRESS;
import com.entitys.comercios_entitys.repositories.TB_REQ_ADRESS_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tb_req_adress")
public class tb_req_adress_Controller {
    @Autowired
    private TB_REQ_ADRESS_repository tb_req_adress_repository;


    @GetMapping
    public List<TB_REQ_ADRESS> list(){
        return tb_req_adress_repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody TB_REQ_ADRESS adress){
        tb_req_adress_repository.save(adress);
    }

    @GetMapping("/{id}")
    public  TB_REQ_ADRESS get(@PathVariable("id") long id){
        return  tb_req_adress_repository.getOne(id);
    }
}
