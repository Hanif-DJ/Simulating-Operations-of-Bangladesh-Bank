package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class ExecutiveDirector implements Serializable {
    private String userId;
    private String name;
    private String departmentId;

    public ExecutiveDirector(String userId, String name, String departmentId) {
        this.userId = userId;
        this.name = name;
        this.departmentId = departmentId;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "ExecutiveDirector{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean belongsToDepartment(String targetDeptId) {
        if (this.departmentId != null && this.departmentId.equals(targetDeptId)) {
            return true;
        } else {
            return false;
        }
    }
}
