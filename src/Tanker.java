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
    
    public double usedCompartments(){
        int used = 0;
        int unused = compartmentCount;
        for (int i = 0; i < compartmentCount; i++) {
            if (compartments[i].used){
                used++;
            }
        } unused = compartmentCount- used;
        return used;
    }

    //Casting compartmentCount might not be the best practise?
    public double utilitylevelOfCapacity(){
        return (usedCompartments()/ ((double) compartmentCount));
    }
}
