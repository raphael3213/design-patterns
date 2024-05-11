package org.example.behavioural.chain_of_reponsibility;

import java.time.LocalDate;

public abstract class Employee implements LeaveApprover {

    private final Employee superior;
    private final String role;

    public Employee(String role, Employee superior){
        this.role = role;
        this.superior = superior;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if(!processRequest(application) && superior != null){

            superior.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication leaveApplication);

    @Override
    public String getApproverRole() {
        return role;
    }
}
