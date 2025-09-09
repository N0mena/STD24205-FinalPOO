package pointage;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static java.lang.Float.parseFloat;
import static org.junit.jupiter.api.Assertions.*;

class PointageTest {
     private  Pointage pointage1;

     void setUp(){
         var salaire1 = new Salaire()
     }
    @Test
    public void testVerifyQuota() {
        var pointage1 = new Pointage("Enseigner", 1,1.4);
        var pointage2 = new Pointage("Surveiller",2,1);

        assertEquals("Le quota du temps alloué doit être égal à 1", pointage1.verifyQuota());
        assertEquals(true,pointage2.verifyQuota());

    }

    public  Float tesGetTotalRevenu(Instant t)
    {
         var revenu1 = TotalSalaire.getTotalRevenu(parseFloat("2025-02-01T08:00:00Z"));

    }


}