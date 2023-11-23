package com.zhbhmd.avow.task;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@CrossOrigin()
@RestController()
@RequestMapping(value = "/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping()
    public Mono<Task> create(@RequestBody Task task) {
        return taskService.createTask(task);
    }
}