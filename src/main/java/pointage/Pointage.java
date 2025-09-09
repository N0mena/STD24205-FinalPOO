package pointage;

import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor

public class Pointage {
    private final String mission;
    private final int id;
    private final float quotaPointage;
    private final Travailleur travailleur;
    private final Instant datePointage;
    private final TypeDeTravail typeDeTravail;
    private final String description;


    public boolean verifyQuota (){
        if( (getQuotaPointage()<= 0) || (getQuotaPointage() > 1) ){
            throw new IllegalArgumentException("Le quota du temps alloué doit être égal à 1");
        }
        return getQuotaPointage() == 1;
    }

    public boolean verifyABS(){
        if((getTypeDeTravail() != TypeDeTravail.ABS_NON_PAYEE) && (getTypeDeTravail() != TypeDeTravail.ABS_PAYEE)){
            return true;
        } return false;
    }


}
