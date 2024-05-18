package org.example.behavioural.interpreter.permissions;


import org.example.behavioural.interpreter.User;

// Non - Terminal Expression
public class NotPermission implements PermissionExpression {

    private final PermissionExpression expression1;

    public NotPermission(PermissionExpression expression1) {
        this.expression1 = expression1;
    }

    @Override
    public boolean interpret(User user) {

        return !expression1.interpret(user);

    }

    @Override
    public String toString(){
        return String.format("!(%s)", expression1.toString());
    }
}
