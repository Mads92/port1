public class Main {
    public static void main(String[] args){
            Roro r = new Roro("DK", "dk",300,400,800);
            r.loadingCargo(2,3);
        System.out.println("Unused lane: " + r.unusedLane);
        System.out.println("Cars loaded: " + r.carCount);
        System.out.println("Trucks loaded: " + r.truckCount);
        System.out.println("Capacity used: " + r.utilitylevelOfCapacity());
        r.loadingCargo(40,0);
        System.out.println("Unused lane: " + r.unusedLane);
        System.out.println("Cars loaded: " + r.carCount);
        System.out.println("Trucks loaded: " + r.truckCount);
        System.out.println("Capacity used: " + r.utilitylevelOfCapacity());
    }
}