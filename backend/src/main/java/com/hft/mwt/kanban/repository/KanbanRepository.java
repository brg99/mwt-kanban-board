package com.hft.mwt.kanban.repository;

import com.hft.mwt.kanban.model.Kanban;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KanbanRepository extends CrudRepository<Kanban, Long> {

    Optional<Kanban> findByTitle(String title);
}
