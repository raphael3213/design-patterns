package org.example.behavioural.chain_of_reponsibility;

public class Director extends Employee{
    public Director(Employee superior) {
        super("Director", superior);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if(leaveApplication.getType() == LeaveApplication.Type.PTO){
            leaveApplication.setProcessedBy(this.getApproverRole());
            return true;
        }
       return false;
    }
}
