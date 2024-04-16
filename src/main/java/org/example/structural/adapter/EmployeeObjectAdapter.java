package org.example.structural.adapter;

public class EmployeeObjectAdapter implements Customer {
    private final Employee e;

    public EmployeeObjectAdapter(Employee e) {

        this.e = e;
    }

    @Override
    public String getName() {
        return e.getFullName();
    }

    @Override
    public String getDesignation() {
        return e.getJobTitle();
    }

    @Override
    public String getAddress() {
        return e.getOfficeLocation();
    }
}
