package day30_CustomClasses.scrumTask;

import java.util.ArrayList;

public class ScrumTeam {
    public String PO, BA, SM;
    ArrayList<Tester> testerList = new ArrayList<>();
    ArrayList<Developer> developersList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }
    public void addTesters(Tester[] testers){
        for(Tester each : testers){
            testerList.add(each);
        }
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDeveloperss(Developer[] developers){
        for(Developer each : developers){
            developersList.add(each);
        }
    }

    public void removeTester(long employeeID){
        testerList.removeIf(p->p.employeeID==employeeID);
    }
    public void removeDeveloper(long employeeID){
        developersList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", Total Number of Tester =" + testerList.size() +
                ", Total Number of Developer=" + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
create a class called ScrumTeam
   Attributes:
        String PO, BA, SM;
        ArrayList<Tester> testersList = new ArrayList<>();
        ArrayList<Developer> devopsList = new ArrayList<>();
        int daysOfSprint;
       Add A constructor that can set the fileds PO, BA, and SM
     Actions:
          addTester(Tester tester): adds the given tester to the testers ArrayList
          addTesters(Tester[] testers): adds the given testers to the testers ArrayList
          addDeveloper(Developer developer): adds the given developer to the developers ArrayList
          addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
          removeTester(long employeeID): removes the given tester from the testers ArrayList
          removeDeveloper(long employeeID): removes the developer from the developers ArrayList
          toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */