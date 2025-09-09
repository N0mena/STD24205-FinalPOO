package pointage;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor

public class Travailleur {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String email;
    private final long telepehone;
    private final Type type;


}
