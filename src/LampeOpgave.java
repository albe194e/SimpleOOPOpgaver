public class LampeOpgave {
    boolean lampOnOrOff;

    LampeOpgave(boolean onOrOff){
        lampOnOrOff = onOrOff;
    }
    LampeOpgave(){
        lampOnOrOff = false;
    }
    void trykPåKontakt(){
        lampOnOrOff = !lampOnOrOff;
    }
    @Override
    public String toString() {
        return "lamp On or Off: " + lampOnOrOff;
    }
}
