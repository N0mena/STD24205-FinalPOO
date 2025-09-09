package pointage;

import java.time.Instant;
import java.util.List;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@SuperBuilder
public class TotalSalaire {
    private List<Salaire> salaires;


    public Float getTotalSalaire1(Instant t) {
        return salaires.stream()
                .filter(salaire -> salaire.getDateSalaire().isBefore(t))
                .map(Salaire::getInitialSalaire)
                .reduce((float)0, (prev , act) -> prev + act);
    }

    public Float getTotalSalaire2(Instant t) {
        Float totalSalaires =
                salaires.stream()
                .filter(salaire -> salaire.getDateSalaire().isBefore(t))
                .map(Salaire::getInitialSalaire)
                .reduce((float)0, (prev , act) -> prev + act);
        return totalSalaires;
    }



    public Float getTotalRevenu() {
        Float revenu;
        if(Travailleur.getType() == Type.SALARIE){
             revenu = Salaire.getPromotionsTotal() + getTotalSalaire1();
        } else if (Travailleur.getType() == Type.PRESTATAIRE) {
             revenu = Salaire.getPromotionsTotal() + getTotalSalaire2();
        }
        return revenu;
    }

}
