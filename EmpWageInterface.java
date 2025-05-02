package com.bridgelabz.employeewage;

public interface EmpWageInterface {
    void addCompanyEmpWage(String company, int ratePerHour, int numOfDays, int maxHours);
    void computeEmpWage();
    int getTotalWage(String company);
}