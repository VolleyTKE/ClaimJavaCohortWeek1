/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxarray;

/**
 *
 * @author Chris
 */
public class MinMaxArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 56, 22};
        
        int oldest = age[0], youngest =age[0];
        
        for (int i = 0; i < age.length; i++)    {
            
            if (age[i] >= oldest)   {
                oldest = age[i];
            }
            
            if (age[i] <= youngest) {
                youngest = age[i];
            }
        }
        
        System.out.println("The most senior person of age is.." + oldest + " and the youngest is..." + youngest);
        
    }
    
}
