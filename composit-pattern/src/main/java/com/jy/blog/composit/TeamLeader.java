package com.jy.blog.composit;

public class TeamLeader extends DepartmentMember{
    private final static int TEAMLEADER_BUDGET = 10000000;

    @Override
    public int getBudget() {
        return TEAMLEADER_BUDGET;
    }
}

