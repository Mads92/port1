public class ContainerVessel extends Vessel{

    int containerCapacity;
    ContainerVessel(String flagNation, String draft, int length, int width, int containerCapacity) {
        super(flagNation, draft, length, width);
        this.containerCapacity = containerCapacity;
    }
}
