package io.nidhi.controller;

import io.nidhi.entity.Tasks;
import io.nidhi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@ResponseBody
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    TaskService service;
    @RequestMapping(method = RequestMethod.GET)
    public List<Tasks> findAll(){
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value="/{id}")
    public Tasks create(@RequestBody Tasks task){
        return service.create(task);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public Tasks update(@PathVariable("id") String title, @RequestBody Tasks task){
        return service.update(title, task);
    }
}
