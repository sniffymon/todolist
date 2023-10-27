package com.inkrment.todolist.controller;

import com.inkrment.todolist.dto.AddRequestDTO;
import com.inkrment.todolist.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //Annotation - shortcut for spring boot to do something
public class TodoController {

    @Autowired private ITodoService todoService;

    @GetMapping("/get-all")
    public List<String> getAll(){
        return todoService.getAll();
    }

    @PostMapping("/add-todo")
    public List<String> addTodo(@RequestBody AddRequestDTO item){
        return todoService.addTodo(item);
    }




// requestParam method
//    public List<String> addTodo(@RequestParam(name ="listElement") String item ){
//        stringList.add(item);
//        return getAll();
//    }

    //    <access modifier> <return type> (output) <method name[argument](input)>
    // arguement = type | name
}