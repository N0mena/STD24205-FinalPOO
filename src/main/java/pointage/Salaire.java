package pointage;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@Getter
public class Salaire  {
    private final int id;
    private final float initialSalaire;
    private final float promotion;
    private final LocalDate promotionDate;


}
