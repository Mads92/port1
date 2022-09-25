import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ContainerTest {
    @Test
    void containerLoadTest(){
        ContainerVessel c = new ContainerVessel("Dk", "Hvad",10,20,15);
        c.loadingCargo(10);
        assertEquals(5,c.freeSpaces);
    }

    @Test
    void loadMaxContainers(){
        ContainerVessel c = new ContainerVessel("Dk", "Hvad",10,20,15);
        c.loadingCargo(15);
        assertEquals(0,c.freeSpaces);
        assertEquals(15,c.containerUsage);
    }

    @Test
    void loadBeyondMax(){
        ContainerVessel c = new ContainerVessel("Dk", "Hvad",10,20,15);
        c.loadingCargo(20);
        assertEquals(15,c.freeSpaces);
    }
}
