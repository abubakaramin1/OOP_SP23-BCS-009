package Assignment_1;

public class Computer {
    private String computerStatus;
    private String lcdNumber;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;


    public String getComputerStatus() {
        return computerStatus;
    }

    public void setComputerStatus(String computerStatus) {
        this.computerStatus = computerStatus;
    }

    public String getLcdNumber() {
        return lcdNumber;
    }

    public void setLcdNumber(String lcdNumber) {
        this.lcdNumber = lcdNumber;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public Computer() {
        this.computerStatus = "Off";
        this.lcdNumber = "None";
        this.ramSize = 0;
        this.hddSize = 0;
        this.hasGPU = false;
    }

    public Computer(String computerStatus, String lcdNumber, int ramSize, int hddSize, boolean hasGPU) {
        this.computerStatus = computerStatus;
        this.lcdNumber = lcdNumber;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }


    public boolean equals(Object o) {
        Computer temp = (Computer) o;
        return lcdNumber.equals(temp.lcdNumber);
    }

    public Computer clone(){
        return new Computer(this.getComputerStatus(), this.getLcdNumber(), this.getRamSize(), this.getHddSize(), this.isHasGPU());
    }

    public String toString() {
        return "Computer Status: " + computerStatus + "\n" +
                "LCD Number: " + lcdNumber + "\n" +
                "RAM Size: " + ramSize + " GB\n" +
                "HDD Size: " + hddSize + " GB\n" +
                "Has GPU: " + hasGPU;
    }
}
