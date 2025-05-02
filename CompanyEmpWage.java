package com.bridgelabz.employeewage;

public class CompanyEmpWage {
    public final String company;
    public final int ratePerHour;
    public final int numOfDays;
    public final int maxHours;
    public int totalWage;

    public CompanyEmpWage(String company, int ratePerHour, int numOfDays, int maxHours) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.numOfDays = numOfDays;
        this.maxHours = maxHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}