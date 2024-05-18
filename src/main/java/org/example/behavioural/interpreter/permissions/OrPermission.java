package org.example.behavioural.interpreter.permissions;


import org.example.behavioural.interpreter.User;

// Non - Terminal Expression
public class OrPermission implements PermissionExpression {

    private PermissionExpression expression1;
    private PermissionExpression expression2;

    public OrPermission(PermissionExpression expression1, PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(User user) {

        return expression1.interpret(user) || expression2.interpret(user);

    }

    @Override
    public String toString(){
        return String.format("(%s  ||  %s)", expression1.toString(), expression2.toString());
    }
}
