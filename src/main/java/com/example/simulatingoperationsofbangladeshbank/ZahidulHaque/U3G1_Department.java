package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U3G1_Department implements Serializable {
    private String departmentId;
    private String name;
    private String headId;
    private String status;

    public U3G1_Department(String departmentId, String name, String headId, String status) {
        this.departmentId = departmentId;
        this.name = name;
        this.headId = headId;
        this.status = status;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadId() {
        return headId;
    }

    public String getStatus() {
        return status;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U3G1_Department{" +
                "departmentId='" + departmentId + '\'' +
                ", name='" + name + '\'' +
                ", headId='" + headId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isActive() {
        if (this.status != null && this.status.equals("Active")) {
            return true;
        } else {
            return false;
        }
    }
}
