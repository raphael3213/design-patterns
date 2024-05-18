package org.example.behavioural.interpreter;

public class Report {

    private final String name;
    private final String permission;
    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
