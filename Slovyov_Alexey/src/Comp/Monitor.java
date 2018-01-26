public class Monitor {
    private int sizeM;
    private String brend;

    public Monitor() {
    }

    public Monitor(int sizeM, String brend) {
        this.sizeM = sizeM;
        this.brend = brend;
    }

    public int getSizeM() {
        return sizeM;
    }

    public void setSizeM(int sizeM) {
        this.sizeM = sizeM;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }
}
