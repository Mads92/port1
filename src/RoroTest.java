import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoroTest {
   //Loading test
    @Test
    void roroAttemptLoadOverCapacity(){
        Roro r = new Roro("dk","Noget",35,20,40);
        r.loadingCargo(20,30);
        assertEquals(40,r.unusedLane);
    }
    @Test
    void roroLoadTestUnusedLane(){
        Roro r = new Roro("dk","Noget",35,20,40);
        assertEquals(40,r.unusedLane);
    }
    @Test
    void roroUtitilityOfCapacityLoad(){
        Roro r = new Roro("dk","Noget",35,20,40);
        assertEquals(0,r.utilitylevelOfCapacity());
    }
    @Test
    void roroHalfCapacityCarsOnly(){
        Roro r = new Roro("dk","Noget",35,20,32);
        r.loadingCargo(2,0);
        assertEquals(0.5,r.utilitylevelOfCapacity());
    }

}
