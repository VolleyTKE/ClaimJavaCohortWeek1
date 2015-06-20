/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workforce.hr;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Manager extends Employee{
    
    private ArrayList reports = new ArrayList();
    
    public void addEmployee(int employeeId) {
        //add report
        reports.add(employeeId);
    }
    
    public void removeEmployee(int employeeId)  {
        //remove report
        reports.remove(employeeId);
    }
}
