package org.example.behavioural.chain_of_reponsibility;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee higherEmployee = createChain();
        LeaveApplication application = new LeaveApplication(LeaveApplication.Type.Sick, LeaveApplication.Status.Pending , LocalDate.now(), 2, null);
        higherEmployee.processLeaveApplication(application);

        System.out.println(application.getProcessedBy());

    }

    public static Employee createChain(){
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }
}
