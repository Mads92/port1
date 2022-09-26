public class Compartment {
    double capacity;
    double fill;
    public boolean used;

    Compartment(double capacity) {
        this.capacity = capacity;
        this.fill = 0;
        used = false;
    }

    /*
    Doesn't use for the overwrite in Tanker
    public void loadCargo(double cargoLoad){
        if ((capacity-fill > cargoLoad) && !used){
            fill += cargoLoad;
            used = true;
        }
    } */
    public void loadCargo() {
        if (!used) {
            used = true;
        }

    }
}