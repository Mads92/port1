public class Main {
    public static void main(String[] args){
            Roro r = new Roro("DK", "dk",300,400,800);
            r.loadingCargo(2,3);
            Tanker t = new Tanker("dk","waa",40,80,10,10);
        System.out.println(t.compartments[0].used);
    }
}