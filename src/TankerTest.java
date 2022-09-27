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

    @Test
    //Idunno, tommy...
    void attamptIllegalCompartmentCount() {
       IllegalArgumentException a= new IllegalArgumentException("A Tanker must have 1-10 compartments");
        try {
            Tanker t = new Tanker("bla", "bla", 20, 20, 11, 10);
        } catch (Exception e) {
            assertEquals(a.getMessage(),e.getMessage());
        }
    }
    @Test
    void attamptIllegalCompartmentCount2() {
        IllegalArgumentException a= new IllegalArgumentException("A Tanker must have 1-10 compartments");
        try {
            Tanker t = new Tanker("bla", "bla", 20, 20, 0, 10);
        } catch (Exception e) {
            assertEquals(a.getMessage(),e.getMessage());
        }
    }

    @Test
    void utilityTest(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        assertEquals(0,t.utilitylevelOfCapacity());
    }
    @Test
    void fullUtitlityTest(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        for (int i = 0; i < t.compartmentCount; i++) {
            t.loadingCargo();
        }
        assertEquals(1,t.utilitylevelOfCapacity());
    }

    @Test
    void halfTest(){
        Tanker t = new Tanker("bla","bla",20,20,10,10);
        for (int i = 0; i < 5; i++) {
            t.loadingCargo();
        }
        assertEquals(0.5,t.utilitylevelOfCapacity());
    }
}
