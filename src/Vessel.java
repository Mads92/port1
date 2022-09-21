public abstract class Vessel {
    String flagNation;
    String draft;
    int length;
    int width;
    double carryCapacity;
    double usedCapacity;


    Vessel(String flagNation, String draft, int length, int width){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
    }

    public void loadingCargo(){

    }

    public double getCapacity(){
        return carryCapacity;
    }

    public boolean checkCapacity(){
        return false;

    }

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
}
