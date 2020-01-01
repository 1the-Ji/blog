package com.jy.blog.composit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGroup extends DepartmentMember{

    private List<Employee> employees = new ArrayList<>();
    private final static int EMPLOYEE_BUDGET = 100000;

    @Override
    public int getBudget() {
        return EMPLOYEE_BUDGET;
    }

    public int size(){
        return employees.size();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}


