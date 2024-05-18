package org.example.behavioural.interpreter;

import java.util.Arrays;
import java.util.List;

public class User {

    public User(String username,  String... permissions) {
        this.permissions = Arrays.stream(permissions).map(String::toLowerCase).toList();
        this.username = username;
    }

    private final List<String> permissions;

    private final String username;

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUsername() {
        return username;
    }
}
