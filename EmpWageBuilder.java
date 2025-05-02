package com.bridgelabz.employeewage;

import java.util.ArrayList;

public class EmpWageBuilder implements EmpWageInterface {
    ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

    public void addCompanyEmpWage(String company, int ratePerHour, int numOfDays, int maxHours) {
        companyList.add(new CompanyEmpWage(company, ratePerHour, numOfDays, maxHours));
    }

    public void computeEmpWage() {
        for (CompanyEmpWage c : companyList) {
            int totalHours = 0, totalDays = 0, totalWage = 0;
            while (totalHours < c.maxHours && totalDays < c.numOfDays) {
                int empHrs = (int) (Math.random() * 3) * 4; // 0, 4, or 8
                totalHours += empHrs;
                totalDays++;
                totalWage += empHrs * c.ratePerHour;
            }
            c.setTotalWage(totalWage);
            System.out.println("Total Wage for " + c.company + ": " + totalWage);
        }
    }

    public int getTotalWage(String company) {
        for (CompanyEmpWage c : companyList) {
            if (c.company.equals(company)) {
                return c.totalWage;
            }
        }
        return -1;
    }
}