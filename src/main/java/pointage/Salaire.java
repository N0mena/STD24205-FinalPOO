package pointage;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

@SuperBuilder
@Getter
public class Salaire  {
    private final int id;
    private final float initialSalaire;
    private final List<Pointage> pointages;
    private final Travailleur travailleur;
    private final List<Promotion> promotions;
    private final Float salaireMontant;
    private final Instant dateSalaire;


    public List<Float> getPointagesTotal(Instant t){
        return pointages.stream()
                .filter( pointage -> pointage.getDatePointage().isBefore(t))
                .map(Pointage::getQuotaPointage).toList();
    }


    public Float getPromotionsTotal(Instant t){
        return promotions.stream()
                .filter(promotion -> promotion.getDatePromotion().isBefore(t))
                .map(Promotion::getPromotionMontant)
                .reduce((float)0, (prev , act) -> prev + act);

    }
    public Float getPromotionsTotal(Instant t){
        return promotions.stream()
                .filter(promotion -> promotion.getDatePromotion().isBefore(t))
                .map(Promotion::getPromotionMontant)
                .reduce((float)0, (prev , act) -> prev + act);

    }


}
