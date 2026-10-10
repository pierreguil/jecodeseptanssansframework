package com.jecodeseptanssansframework.service;
import java.util.List;
import com.jecodeseptanssansframework.model.Confession;
import java.util.ArrayList;


public class ConfessionService {



    private List<Confession> confessions = new ArrayList<>();

    public List<Confession> findByAuthor(String author) {
        List<Confession> result = new ArrayList<>();
        for (Confession confession : this.confessions){
            if(confession.getAuthor().equals(author)){
                result.add(confession);
            }
        }
        return result;
    }

    public void addConfession(Confession confession) {
        this.confessions.add(confession);
    }

}
