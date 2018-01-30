package Robots;

public class Hand {
    private boolean isWriting;
    private int countHands;

    public Hand(boolean isWriting) {
        this.isWriting = isWriting;
    }

    public boolean isWriting() {
        return isWriting;
    }

    public void setWriting(boolean writing) {
        isWriting = writing;
    }
}
