package com.albapril.controller;

import com.albapril.model.Task;

import java.util.ArrayList;

import javax.validation.Valid;

public class ToDoListViewModel {

    @Valid
    private ArrayList<Task> todoList = new ArrayList<Task>();

    public ToDoListViewModel() {}

    public ToDoListViewModel(ArrayList<Task> todoList) {
        this.todoList = todoList;
    }

    public ArrayList<Task> getTodoList() {
        return todoList;
    }

    public void setTodoList(ArrayList<Task> todoList) {
        this.todoList = todoList;
    }

}
