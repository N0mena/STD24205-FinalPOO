package pointage;

import lombok.*;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Pointage {
    private final int id;
    private final float nombreDePointage;
    private final Travailleur travailleur;
    private final LocalDate date;
    private final TypeDeTravail typeDeTravail;
    private  final String description;


}
