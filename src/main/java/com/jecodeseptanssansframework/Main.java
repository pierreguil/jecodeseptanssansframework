package com.jecodeseptanssansframework;
import com.jecodeseptanssansframework.model.Confession;
import com.jecodeseptanssansframework.service.ConfessionService;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Confession confession1 = new Confession("Le bug du vendredi", "J'ai supprimé une ligne", "Pierre");
        Confession confession2 = new Confession("Le CSS maudit", "J'ai mis !important partout", "Paul");
        Confession confession3 = new Confession("Ça marche sur ma machine", "J'ai pas commit", "Julie");
        Confession newConfession = new Confession(
                "Le commit oublié",
                "J'ai oublié de pousser mon code vendredi",
                "Paul"
        );

        ConfessionService confessionService = new ConfessionService();
        confessionService.addConfession(confession1);
        confessionService.addConfession(confession2);
        confessionService.addConfession(confession3);
        confessionService.addConfession(newConfession);
        List<Confession> results = confessionService.findByAuthor("Paul");
        if(results.isEmpty()){
            System.out.println("Aucune confession trouvée pour cet auteur.");
        }
        else{
            for(Confession result : results){
                System.out.println(result.getTitle());
            }
        }






    }

}
