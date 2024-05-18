package org.example.behavioural.interpreter.permissions;

import org.example.behavioural.interpreter.User;

public interface PermissionExpression {

    boolean interpret(User user);
}
