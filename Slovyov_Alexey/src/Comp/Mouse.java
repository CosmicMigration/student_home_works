public class Mouse {
    private String brendM;
    private boolean wireless;

    public Mouse() {
    }

    public Mouse(String brendM, boolean wireless) {
        this.brendM = brendM;
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        if(this.getBrendM()=="Logitech")
            this.wireless = false;
    }

    public String getBrendM() {
        return brendM;
    }

    public void setBrendM(String brendM) {
        this.brendM = brendM;
    }


}
