package Assignment_1;

public class University {
    Lab lab[] = new Lab[10];
    int labCount=0;
    University(Lab l[]){
        for (int i = 0; i < lab.length; i++) {
            lab[i] = new Lab("2",new Computer[10], LabStatus.OPERATIONAL,new Employee("1","ali"));
        }
    }
    public Lab getLabById(String Id) {
        for (Lab labs : lab) {
            if (lab != null && labs.getLabId().equals(Id)) {
                return labs;
            }
        }
        return null;
    }

    public void addLab(Lab labs) {
        if (labCount < lab.length) {
            lab[labCount++] = labs;
        } else {
            System.out.println("Lab is at full capacity. Cannot add more computers.");
        }
    }

    public void removeLab(String labsId) {
        for (int i = 0; i < labCount; i++) {
            if (lab[i].getLabId().equals(labsId)) {
                for (int j = i; j < labCount - 1; j++) {
                    lab[j] = lab[j + 1];
                }
                lab[labCount - 1] = null;
                labCount--;
                break;
            }
        }
    }
    public String toString() {
        StringBuilder labList = new StringBuilder();
        for (Lab lab : lab) {
            if (lab != null) {
                labList.append(lab.toString()).append("\n\n");
            }
        }

        return "University Information:\n" +
                "-----------------------\n" +
                labList.toString();
    }
}
