package Robots;

public class Head {
    private boolean isSpeaking;

    public Head(boolean isSpeaking) {
        this.isSpeaking = isSpeaking;
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    public void setSpeaking(boolean speaking) {
        isSpeaking = speaking;
    }
}
