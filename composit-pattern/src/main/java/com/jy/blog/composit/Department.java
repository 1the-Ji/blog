package com.jy.blog.composit;

import java.util.ArrayList;
import java.util.List;

public class Department extends DepartmentMember{
    private List<DepartmentMember> departmentMembers = new ArrayList<>();

    public void addDepartmentMember(DepartmentMember departmentMember){
        departmentMembers.add(departmentMember);
    }


    public void removeDepartmentMember(DepartmentMember departmentMember){
        departmentMembers.remove(departmentMember);
    }

    @Override
    public int getBudget() {
        int budget = 0;
        for(DepartmentMember departmentMember : departmentMembers){
            budget += departmentMember.getBudget();
        }
        return budget;
    }


}



