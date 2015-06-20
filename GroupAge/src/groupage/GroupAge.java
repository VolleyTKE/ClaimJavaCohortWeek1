/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupage;


import java.util.Arrays;

/**
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

        int minNum = 0;
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
            int count = 0;
            System.out.println(Arrays.toString(age));
            if (age[i] < 18) {

                minAge[minNum] = age[i];
                minNum++;

            }

            System.out.println(Arrays.toString(minAge));

        }

        for (int i = 0; i < age.length; i++) {
            int count = 0;
            System.out.println(Arrays.toString(age));
            if (age[i] >= 18 && age[i] < 65) {

                majAge[majNum] = age[i];
                majNum++;

            }

            System.out.println(Arrays.toString(majAge));

        }

        for (int i = 0; i < age.length; i++) {
            int count = 0;
            System.out.println(Arrays.toString(age));
            if (age[i] >= 65) {

                senAge[senNum] = age[i];
                senNum++;

            }

            System.out.println(Arrays.toString(senAge));

        }

        //System.out.println(minageCount + " " + majageCount + " " + senageCount + " " + Arrays.toString(minAge));
    }

}
