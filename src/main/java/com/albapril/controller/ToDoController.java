package com.albapril.controller;

import com.albapril.model.Task;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ToDoController {

    @Autowired
    private ToDoItemRepository repository;

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<Task> todoList = (ArrayList<Task>) repository.findAll();
        model.addAttribute("saveitem", new Task());
        model.addAttribute("items", new ToDoListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute ToDoListViewModel requestItems) {
        for (Task requestItem : requestItems.getTodoList() ) {
            Task item = new Task(requestItem.getTaskTitle(), requestItem.getTaskDescription());
            item.setComplete(requestItem.isComplete());
            item.setTaskId(requestItem.getTaskId());
            repository.save(item);
        }
        return "redirect:/";
    }

    @PostMapping("/save")
    public String saveTodo(@ModelAttribute Task t) {
        repository.save(t);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteTodo(long taskId) {
        repository.delete(taskId);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Task findTodo(long taskId) {
        return repository.findOne(taskId);
    }
}
