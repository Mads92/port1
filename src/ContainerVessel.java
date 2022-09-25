public class ContainerVessel extends Vessel{

    int containerCapacity;
    int containerUsage;
    int freeSpaces;
    ContainerVessel(String flagNation, String draft, int length, int width, int containerCapacity) {
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
}
