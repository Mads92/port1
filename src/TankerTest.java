import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TankerTest {

    @Test
    void compartmentEmptyTest(){
        Compartment c = new Compartment(3);
        assertEquals(false,c.used);
    }

    @Test
    void allCompartmentsEmpty(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        assertEquals(true,t.hasFreeCompartment());
    }

    @Test
    void allCompartmentsFull(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        for (int i = 0; i < t.compartmentCount; i++) {
            t.compartments[i].loadCargo();

        }
        assertEquals(false,t.hasFreeCompartment());
        assertEquals(true,t.compartments[9].used);
    }

    @Test
    void someUsedCompartments(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        t.loadingCargo();
        assertEquals(true,t.compartments[0].used);
        assertEquals(false,t.compartments[1].used);
        assertEquals(true,t.hasFreeCompartment());
    }

    @Test
    void singleFreeCompartment(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        t.loadingCargo();
        t.loadingCargo();
        t.loadingCargo();
        t.loadingCargo();
        t.loadingCargo();

        t.loadingCargo();
        t.loadingCargo();
        t.loadingCargo();
        t.loadingCargo();
        assertEquals(true,t.compartments[8].used);
        assertEquals(false,t.compartments[9].used);
    }
}
