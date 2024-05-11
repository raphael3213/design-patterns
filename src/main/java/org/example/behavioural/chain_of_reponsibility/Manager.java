package org.example.behavioural.chain_of_reponsibility;

public class Manager extends Employee{
    public Manager(Employee superior) {
        super("Manager", superior);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
       switch (leaveApplication.getType()) {
           case Sick -> {
                leaveApplication.setProcessedBy(this.getApproverRole());
                return true;
           }
           case PTO -> {
               if(leaveApplication.getNoOfDays() <= 5){
                   leaveApplication.setProcessedBy(this.getApproverRole());
                    return true;
               }

           }
           default -> {
               return false;
           }
       }
       return false;
    }
}
