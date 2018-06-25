package io.nidhi.repository;

import io.nidhi.entity.Tasks;
import jdk.nashorn.internal.runtime.arrays.TypedArrayData;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Repository
public class TaskRepositoryImpl implements TaskRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Tasks> findAll() {

        TypedQuery<Tasks> query = entityManager.createNamedQuery("Tasks.findAll", Tasks.class);
        return query.getResultList();
    }


    public Tasks create(Tasks task) {

        entityManager.persist(task);
        return task;
    }

    public Tasks update(Tasks task) {

        return entityManager.merge(task);
    }
}
