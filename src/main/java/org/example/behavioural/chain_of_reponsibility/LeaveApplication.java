package org.example.behavioural.chain_of_reponsibility;

import java.time.LocalDate;

public class LeaveApplication {

    public enum Type {
        Sick, PTO , LOP
    }
    public enum Status {
        Pending, Approved, Rejected
    }

    private Type type;
    private Status status;
    private LocalDate from;
    private Integer noOfDays;
    private String processedBy;

    public LeaveApplication(Type type, Status status, LocalDate from, Integer noOfDays, String processedBy) {
        this.type = type;
        this.status = status;
        this.from = from;
        this.noOfDays = noOfDays;
        this.processedBy = processedBy;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }


}
