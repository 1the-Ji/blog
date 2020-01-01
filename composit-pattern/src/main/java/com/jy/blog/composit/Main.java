package com.jy.blog.composit;

public class Main {
    public static void main(String[] args) {

        TeamLeader teamLeader = new TeamLeader();

        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        ManagerGroup managerGroup = new ManagerGroup();
        managerGroup.addManager(manager1);
        managerGroup.addManager(manager2);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        EmployeeGroup employeeGroup = new EmployeeGroup();
        employeeGroup.addEmployee(employee1);
        employeeGroup.addEmployee(employee2);
        employeeGroup.addEmployee(employee3);


        Department department = new Department();
        department.addDepartmentMember(teamLeader);
        department.addDepartmentMember(managerGroup);
        department.addDepartmentMember(employeeGroup);



        department.removeDepartmentMember(managerGroup);









    }
}
