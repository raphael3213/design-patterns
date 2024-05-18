package org.example.behavioural.interpreter.permissions;


import org.example.behavioural.interpreter.User;

// Non - Terminal Expression
public class AndPermission implements PermissionExpression {

    private final PermissionExpression expression1;
    private final PermissionExpression expression2;

    public AndPermission(PermissionExpression expression1, PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(User user) {

        return expression1.interpret(user) && expression2.interpret(user);

    }

    @Override
    public String toString(){
        return String.format("(%s  &&  %s)", expression1.toString(), expression2.toString());
    }
}
