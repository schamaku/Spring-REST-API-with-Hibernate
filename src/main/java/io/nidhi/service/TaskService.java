package io.nidhi.service;
import java.util.List;
import io.nidhi.entity.Tasks;

public interface TaskService {

    List<Tasks> findAll();

    Tasks create(Tasks task);

    Tasks update(String id, Tasks task);
}
