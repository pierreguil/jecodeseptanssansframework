package com.jecodeseptanssansframework.service;

import com.jecodeseptanssansframework.model.Confession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConfessionService {

    private final List<Confession> confessions = new ArrayList<>();

    public List<Confession> findAll() {
        return confessions;
    }

    public List<Confession> findByAuthor(String author) {
        List<Confession> result = new ArrayList<>();

        for (Confession confession : confessions) {
            if (confession.getAuthor().equals(author)) {
                result.add(confession);
            }
        }

        return result;
    }

    public void addConfession(Confession confession) {
        confessions.add(confession);
    }
}