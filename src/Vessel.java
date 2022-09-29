public abstract class Vessel {
    String flagNation;
    String draft;
    int length;
    int width;
    double carryCapacity;
    double usedCapacity;

    int locationX;

    int locationY;

    int[] location;

    String destination;

    boolean available;


    Vessel(String flagNation, String draft, int length, int width){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        location = new int[2];
    }

    public void loadingCargo(){

    }

    public double getCapacity(){
        return carryCapacity;
    }

    public boolean checkCapacity(){
        if (carryCapacity - usedCapacity >0){
            return true;
        }
        return false;
    }

    //Could be rewritten as a String, which could then print carryCapacity + "/" + usedCapacity
    public double utilitylevelOfCapacity(){
        return carryCapacity/usedCapacity;
    }

    public String getFlagNation(){
        return flagNation;
    }

    public String getDraft() {
        return draft;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int[] getLocation() {
        return location;
    }

    public String getDestination(){
        return destination;
    }

    public boolean checkAvailablity(){

    }
}