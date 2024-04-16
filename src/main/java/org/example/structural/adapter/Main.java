package org.example.structural.adapter;

public class Main {

    public static void main(String[] args) {


        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        adapter.setFullName("Joel");
        adapter.setJobTitle("SD-2");
        adapter.setOfficeLocation("Bengaluru");


        BusinessCardDesigner newBusinessCardDesigner = new BusinessCardDesigner(adapter);

        System.out.println(newBusinessCardDesigner.designCard());

        Employee newEmployee = new Employee();
        newEmployee.setFullName("Joel");
        newEmployee.setJobTitle("SD-2");
        newEmployee.setOfficeLocation("Bengaluru");
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(newEmployee);

        BusinessCardDesigner newBusinessCardDesigner2 = new BusinessCardDesigner(objectAdapter);

        System.out.println(newBusinessCardDesigner2.designCard());







    }
}
