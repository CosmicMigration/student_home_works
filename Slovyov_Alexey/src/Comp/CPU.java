public class CPU {
    private String brendCPU;
    private int sizeCPU;

    public CPU() {
    }

    public CPU(String brendCPU, int sizeCPU) {
        this.brendCPU = brendCPU;
        this.sizeCPU = sizeCPU;
    }

    public String getBrendCPU() {
        return brendCPU;
    }

    public void setBrendCPU(String brendCPU) {
        this.brendCPU = brendCPU;
    }

    public int getSizeCPU() {
        return sizeCPU;
    }

    public void setSizeCPU(int sizeCPU) {
        this.sizeCPU = sizeCPU;
    }

}
