package org.example.structural.adapter;

public class Employee {

    private String fullName;

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    private String jobTitle;
    private String officeLocation;

    protected String getFullName(){
        return this.fullName;
    }

    protected String getJobTitle(){
        return this.jobTitle;
    }

    protected String getOfficeLocation(){
        return this.officeLocation;

    }
}
