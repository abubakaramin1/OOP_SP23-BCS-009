package Assignment_1;

public class Main {
    public static void main(String[] args) {


        Computer c1 = new Computer("Abu Bakar" , "8989" , 8 , 5 , true);
        Computer c2 = new Computer("Ahmed" , "9090" , 64 , 67 , false);
        Computer c3 = c1.clone();


        Computer[] c4 = new Computer[5] ;
        c4[0] = c2;
        c4[1] = c1;
        c4[2] = c3;
        Computer c5 = new Computer("Bilal" , "4545" , 32,89,true);
        Employee e1 = new Employee("Killer444" ,"John");

        Lab l1 = new Lab("90", c4, LabStatus.OPERATIONAL,e1 );
        Lab l3 = new Lab("55" , c4, LabStatus.FAULTY_MULTIMEDIA, e1);
        l1.addComputer(c5);
        l1.addComputer(c1);
        System.out.println(l1);
        l1.removeComputer("4545");
        System.out.println("\nAfter removal of computer \n" +l1);
        l1.changeStatus(LabStatus.FAULTY_MULTIMEDIA);
        System.out.println("\n After change of status \n Lab Status : " +l1.getStatus());
        Lab[] l2 = new Lab[3];
        l2[0] = l1;
        University u1 = new University(l2);
        u1.addLab(l3);
        System.out.println(u1);

    }
}
