public class Roro extends Vessel{
    //The RoRo vessels has a total amount of lane meters and can carry
    //cars and trucks, each car is 8 meter long and each truck is 30 meters
    double laneMeters;
    double unusedLane;
    int carCount;
    int truckCount;
    double loadLength;
    double usedLane;
    Roro(String flagNation, String draft, int length, int width, double laneMeters) {
        super(flagNation, draft, length, width);
        this.laneMeters = laneMeters;
        this.unusedLane = laneMeters;
        this.carCount =0;
        this.truckCount =0;
        super.carryCapacity = laneMeters;
        super.usedCapacity = unusedLane;

    }

    @Override
    public boolean checkCapacity( ) {
        if(loadLength <= unusedLane){
            return true;
        }
        return false;
    }
//POTENTIAL ISSUE, since the global variables aren't reset
    public void loadingCargo(int cars, int trucks) {

        double carLenghts = cars * 8.0;
        double truckLenghts = trucks * 30.0;
        loadLength= carLenghts+truckLenghts;
        if(checkCapacity()){
            unusedLane= laneMeters - loadLength;
            usedLane = usedLane +loadLength;
            carCount +=cars;
            truckCount += trucks;
        }
        else {
            System.out.println("Too long");}
    }

    @Override
    public double utilitylevelOfCapacity() {
        return usedLane/laneMeters;
    }
}
