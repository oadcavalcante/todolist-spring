package com.oadcavalcante.todolist.todolist_spring.repository;

import com.oadcavalcante.todolist.todolist_spring.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
