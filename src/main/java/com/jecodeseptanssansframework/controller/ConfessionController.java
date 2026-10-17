package com.jecodeseptanssansframework.controller;

import com.jecodeseptanssansframework.model.Confession;
import com.jecodeseptanssansframework.service.ConfessionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/confessions")
public class ConfessionController {

    private final ConfessionService confessionService;

    public ConfessionController(ConfessionService confessionService) {
        this.confessionService = confessionService;
    }

    @GetMapping
    public List<Confession> getAll() {
        return confessionService.findAll();
    }

    @GetMapping("/author/{author}")
    public List<Confession> getByAuthor(@PathVariable String author) {
        return confessionService.findByAuthor(author);
    }

    @PostMapping
    public void create(@RequestBody Confession confession) {
        confessionService.addConfession(confession);
    }
}