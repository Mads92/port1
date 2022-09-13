public class Tanker extends Vessel{
    int compartmentCount;
    Tanker(String flagNation, String draft, int length, int width, int compartmentCount) {
        super(flagNation, draft, length, width);
        this.compartmentCount = compartmentCount;
        Compartment[] compartments = new Compartment[compartmentCount];
    }
}
