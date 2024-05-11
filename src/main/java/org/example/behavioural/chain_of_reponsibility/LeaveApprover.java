package org.example.behavioural.chain_of_reponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
