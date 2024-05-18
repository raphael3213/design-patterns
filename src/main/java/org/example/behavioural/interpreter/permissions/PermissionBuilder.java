package org.example.behavioural.interpreter.permissions;

import org.example.behavioural.interpreter.Report;

import java.util.Stack;
import java.util.StringTokenizer;

public class PermissionBuilder {

    Stack<PermissionExpression> permissionStack = new Stack<>();
    Stack<String> operatorStack = new Stack<>();

    private final PermissionExpression  permissionTree;

    public PermissionExpression getPermissionTree() {
        return permissionTree;
    }

    public PermissionBuilder(Report report) {
        parse(report.getPermission());
        permissionTree = createPermissionTree();
    }

    private PermissionExpression createPermissionTree() {

        while(!operatorStack.empty()){
            String operator = operatorStack.pop();
            PermissionExpression permission1;
            PermissionExpression permission2;
            PermissionExpression resultPermission;
            switch (operator){
                case "and" :
                    permission1 = permissionStack.pop();
                    permission2 = permissionStack.pop();
                    resultPermission = new AndPermission(permission1 , permission2);
                    break;
                case "or" :
                    permission1 = permissionStack.pop();
                    permission2 = permissionStack.pop();
                    resultPermission = new OrPermission(permission1 , permission2);
                    break;
                case "not" :
                    permission1 = permissionStack.pop();
                    resultPermission = new NotPermission(permission1);
                    break;
                default:
                    throw new IllegalArgumentException("INVALID TOKEN");
            }
            permissionStack.push(resultPermission);

        }
        return permissionStack.pop();
    }

    private void parse(String permissionStatement) {
        StringTokenizer tokenizer = new StringTokenizer(permissionStatement.toLowerCase());

        while(tokenizer.hasMoreTokens()){
            String token;
            switch (token = tokenizer.nextToken()){
                case "and" :
                    operatorStack.push("and");
                    break;
                case "or" :
                    operatorStack.push("or");
                    break;
                case "not" :
                    operatorStack.push("not");
                    break;
                default:
                    permissionStack.push(new Permission(token));

            }
        }
    }
}
