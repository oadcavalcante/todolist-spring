package com.oadcavalcante.todolist.todolist_spring;

import java.util.ArrayList;
import java.util.List;

import com.oadcavalcante.todolist.todolist_spring.entity.Todo;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {
            add(new Todo(9995L, "@oadcavalcante", "Curtir", false, 1));
            add(new Todo(9996L, "@oadcavalcante", "Comentar", false, 1));
            add(new Todo(9997L, "@oadcavalcante", "Compartilhar", false, 1));
            add(new Todo(9998L, "@oadcavalcante", "Se Inscrever", false, 1));
            add(new Todo(9999L, "@oadcavalcante", "Ativar as Notificações", false, 1));
        }
    };

    public static final Todo TODO = TODOS.get(0);
}