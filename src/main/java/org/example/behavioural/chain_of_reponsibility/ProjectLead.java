package org.example.behavioural.chain_of_reponsibility;

import java.time.LocalDate;

public class ProjectLead extends Employee{
    public ProjectLead( Employee superior) {
        super("Project Lead", superior);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if(leaveApplication.getType() == LeaveApplication.Type.Sick && leaveApplication.getNoOfDays() >= 2){
            leaveApplication.setProcessedBy(this.getApproverRole());
            return true;
        }
        return false;
    }
}
