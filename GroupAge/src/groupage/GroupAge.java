/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupage;

import java.util.Arrays;

/**
 * Groups age array into 3 different arrays based on age
 *
 * @author Chris
 */
public class GroupAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minageCount = 0;
        int majageCount = 0;
        int senageCount = 0;

        int minIndex = 0;
        int majNum = 0;
        int senNum = 0;

        int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 56, 22, 65, 67, 17, 15};

        //int i = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 18) {

                minageCount += 1;

            }

            if (age[i] >= 18 && age[i] < 65) {
                majageCount += 1;
            }

            if (age[i] >= 65) {
                senageCount += 1;
            }
        }
        int minAge[] = new int[minageCount];
        int majAge[] = new int[majageCount];
        int senAge[] = new int[senageCount];

        for (int i = 0; i < age.length; i++) {

            if (age[i] < 18) {

                minAge[minIndex++] = age[i];

            } else if (age[i] >= 18 && age[i] < 65) {

                majAge[majNum++] = age[i];

            } else {

                senAge[senNum++] = age[i];

            }

        }
        System.out.println(Arrays.toString(age));

        System.out.println(Arrays.toString(minAge));
        System.out.println(Arrays.toString(majAge));
        System.out.println(Arrays.toString(senAge));
    }

}
