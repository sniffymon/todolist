package com.inkrment.todolist.service.impl;

import com.inkrment.todolist.dto.AddRequestDTO;
import com.inkrment.todolist.service.ITodoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements ITodoService {

    List<String> stringListObj = new ArrayList<>();

    @Override
    public List<String> getAll() {
        if(stringListObj.isEmpty()){
            stringListObj.add("List is Empty.");
        }
        return stringListObj;
    }

    @Override
    public List<String> addTodo(AddRequestDTO item) {
        // 12:00:01 -> Buy a dog
        item.setListElement("Gary: " + item.getListElement()); // 12:00:02 -> Buy a dog
        // Synchronous vs Asynchronous
        // 12:00:03 -> "Gary: Buy a dog"

        stringListObj.add(item.getListElement2());

        stringListObj.add(item.getListElement2());
        return getAll();
    }
}
