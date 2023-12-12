package Assignment_1;

public class Lab {
    private String labId;
    Computer computers[] = new Computer[10];
    LabStatus status;
    Employee labAttendant;
    int computerCount=0;

    public Lab() {
        this.labId = "DefaultLab";
        this.computers = new Computer[10];
        this.status = LabStatus.OPERATIONAL;
        this.labAttendant = null;
        for (int i = 0; i < 10; i++) {
            computers[i] = new Computer("12","5",12,5,false);
        }
    }

    public Lab(String labId, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labId = labId;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer("12","5",12,5,false);
        }
    }
    public void addComputer(Computer computer) {
        if (computerCount < computers.length) {
            computers[computerCount++] = computer;
        } else {
            System.out.println("Lab is at full capacity. Cannot add more computers.");
        }
    }


    public void removeComputer(String computerNumber) {
        for (int i = 0; i < computerCount; i++) {
            if (computers[i].getLcdNumber().equals(computerNumber)) {
                for (int j = i; j < computerCount - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[computerCount - 1] = null;
                computerCount--;
                break;
            }
        }
    }


    public void changeStatus(LabStatus newStatus){
        status = newStatus;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public LabStatus getStatus() {
        return status;
    }

    public Computer getComputerByNumber(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getLcdNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder computerList = new StringBuilder();
        for (Computer computer : computers) {
            if (computer != null) {
                computerList.append(computer.toString()).append("\n");
            }
        }

        return "Lab ID: " + labId + "\n" +
                "Lab Status: " + status + "\n" +
                "Lab Attendant:\n" + labAttendant.toString() + "\n" +
                "Computers:\n" + computerList.toString();
    }
}
