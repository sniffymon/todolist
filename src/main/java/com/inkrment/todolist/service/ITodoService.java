package com.inkrment.todolist.service;

import com.inkrment.todolist.dto.AddRequestDTO;

import java.util.List;

public interface ITodoService {
    List<String> getAll();

    List<String> addTodo(AddRequestDTO item);
}
