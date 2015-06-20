/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workforce.hr;

/**
 *
 * @author Chris
 */
public class Department {
    private Employee employee[] = null;
    private Manager managers[] = null;
    
    private String name;
    
    public Department(String name) {
        this.name = "Default Name";
    }
    
    public void calculateBonuses()  {
        //calculate bonuses of all the individuals in department 
    }
    
    public void calculateVacationDays() {
        
    }
    
}
