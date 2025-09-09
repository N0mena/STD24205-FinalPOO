package pointage;

import lombok.*;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class Promotion {
    private final int id;
    private final Travailleur travailleur;
    private final Float promotionMontant;
    private final String promotion;
    private final Instant datePromotion;
    private final String description;
}
