package com.jy.blog.composit;

import java.util.ArrayList;
import java.util.List;

public class ManagerGroup extends DepartmentMember{
    private List<Manager> managers = new ArrayList<>();
    private final static int MANAGER_BUDGET = 500000;

    @Override
    public int getBudget() {
        return MANAGER_BUDGET * managers.size();
    }

    public int size(){
        return managers.size();
    }

    public void addManager(Manager manager){
        managers.add(manager);
    }
}

