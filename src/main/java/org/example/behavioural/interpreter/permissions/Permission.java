package org.example.behavioural.interpreter.permissions;


import org.example.behavioural.interpreter.User;

// Terminal Expression
public class Permission implements PermissionExpression {


    private final String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }
    @Override
    public boolean interpret(User user) {

        return user.getPermissions().contains(permission);

    }

    @Override
    public String toString(){
        return permission;
    }
}
