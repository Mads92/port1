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

    @Test
    void roro0load(){
        Roro r = new Roro("dk","Noget",35,20,32);
        r.loadingCargo();
        assertEquals(32,r.unusedLane);
    }

    @Test
    void roroExactFullLoadCar(){
        Roro r = new Roro("dk","Noget",35,20,40);
        r.loadingCargo(5,0);
        assertEquals(0,r.unusedLane);
        assertEquals(1,r.utilitylevelOfCapacity());
    }

    @Test
    void roroExactFullLoadTruck(){
        Roro r = new Roro("dk","Noget",35,20,60);
        r.loadingCargo(0,2);
        assertEquals(0,r.unusedLane);
        assertEquals(1,r.utilitylevelOfCapacity());
    }

    @Test
    void testAvailable(){
        Roro r = new Roro("dk","Noget",35,20,60);
        assertEquals(false,r.checkAvailablity("Container"));
    }

    @Test
    void getLocation(){
        Roro r = new Roro("dk","Noget",35,20,60);
        int[] test = new int[2];
        test[0] = 1;
        test[1]=2;
        assertEquals(test,r.getLocation());
    }

    @Test
    void getDestination(){
        Roro r = new Roro("dk","Noget",35,20,60);
        assertEquals("Singapore",r.getDestination());
    }
}
