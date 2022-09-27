public class Tanker extends Vessel{
    int compartmentCount;
    Compartment[] compartments;
    Tanker(String flagNation, String draft, int length, int width, int compartmentCount, double compartmentCapacity) {
        super(flagNation, draft, length, width); // PROBABLY ICKY
        if (compartmentCount > 0 && compartmentCount <=10){
            this.compartmentCount = compartmentCount;
            compartments= new Compartment[compartmentCount];
            for (int i = 0; i < compartments.length; i++) {
                Compartment c = new Compartment(compartmentCapacity);
                compartments[i] = c;
            }
        }
        else{
            throw new IllegalArgumentException("A Tanker must have 1-10 compartments");
        }
    }

    @Override
    public void loadingCargo() {
        int i = 0;
        if (hasFreeCompartment()){
            while (compartments[i].used){
                i++;
            }
            compartments[i].loadCargo();
        }
    }

    public boolean hasFreeCompartment(){
        boolean innerCheck = false;
        for (int i = 0; i < compartments.length; i++) {
            if (!compartments[i].used){
                innerCheck = true;
            }
        }
        return innerCheck;
    }
}
