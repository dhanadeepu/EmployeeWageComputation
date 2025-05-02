package com.bridgelabz.employeewage;

public class EmpWageMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilder builder = new EmpWageBuilder();
        builder.addCompanyEmpWage("CompanyA", 20, 20, 100);
        builder.addCompanyEmpWage("CompanyB", 25, 22, 120);
        builder.computeEmpWage();
        System.out.println("Thank You");
    }
}