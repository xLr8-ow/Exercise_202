
public class Sender {
    private String sendername;
    private double frequenz;
    private boolean isAM;

    public Sender(String sendername, double frequenz, boolean isAM) {
        this.sendername = sendername;
        this.frequenz = frequenz;
        this.isAM = isAM;
    }

    public String getSendername() {
        return sendername;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public boolean isIsAM() {
        return isAM;
    }
    
    
}
