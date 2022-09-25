public class ContainerVessel extends Vessel{

    double containerCapacity;
    double containerUsage;
    double freeSpaces;
    ContainerVessel(String flagNation, String draft, int length, int width, double containerCapacity) {
        super(flagNation, draft, length, width);
        this.containerCapacity = containerCapacity;
        containerUsage = 0;
        freeSpaces = containerCapacity;
    }
    public boolean checkForSpace(){
        if (containerCapacity - containerUsage > 0){
            return true;
        }
        return false;
    }
    public void loadingCargo(int c){
        if (checkForSpace() && freeSpaces >= c){
             containerUsage += c;
             freeSpaces -= c;
        }
    }

    public double utilitylevelOfCapacity(){
        return containerUsage/containerCapacity;
    }
}
