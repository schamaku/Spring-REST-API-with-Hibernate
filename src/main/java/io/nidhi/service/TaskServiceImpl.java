package io.nidhi.service;

import io.nidhi.entity.Tasks;
import io.nidhi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository repository;

    @Transactional
    public List<Tasks> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Tasks create(Tasks task) {
        return repository.create(task);
    }

    @Transactional
    public Tasks update(String id, Tasks task) {
        return repository.update(task);
    }
}
