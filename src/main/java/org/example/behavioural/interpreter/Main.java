package org.example.behavioural.interpreter;

import org.example.behavioural.interpreter.permissions.PermissionExpression;

public class Main {

    public static void main(String[] args) {

        Report report1 = new Report("Cashflow Report", "NOT ADMIN");
        PermissionBuilder pb1 = new PermissionBuilder(report1);

        PermissionExpression expr1 = pb1.getPermissionTree();

        User user1 = new User("Dave", "USER" , "ADMIN");

        System.out.println(expr1.toString());

        System.out.println(expr1.interpret(user1));


        Report report2 = new Report("Cashflow Report", "ADMIN AND USER");
        PermissionBuilder pb2 = new PermissionBuilder(report2);

        PermissionExpression expr2 = pb2.getPermissionTree();

        User user2 = new User("Dave", "USER" , "ADMIN");
        User user3 = new User("Dave", "CLERK" , "ADMIN");

        System.out.println(expr2.toString());

        System.out.println(expr2.interpret(user2));
        System.out.println(expr2.interpret(user3));

    }
}
