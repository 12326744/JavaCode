package com.work.encapsulation;

public class Employee {
    private String name;
    private  int empID;
    private String companyName;
    private boolean isPermanentEmployee;
    private long salary;
    private long phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public void setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee(String name, int empID, String companyName, boolean isPermanentEmployee, long salary, long phoneNumber) {
        this.name = name;
        this.empID = empID;
        this.companyName = companyName;
        this.isPermanentEmployee = isPermanentEmployee;
        this.salary = salary;
        this.phoneNumber = phoneNumber;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", companyName='" + companyName + '\'' +
                ", isPermanentEmployee=" + isPermanentEmployee +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
