package io.nidhi.repository;

import io.nidhi.entity.Tasks;

import java.util.List;

public interface TaskRepository {

    List<Tasks> findAll();

    Tasks create(Tasks task);

    Tasks update(Tasks task);
}
