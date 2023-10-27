package Arrays.multiple_Arrays;

import java.util.Arrays;

public class multipleArrays {

    public static void main(String[] args) {



        //hvordan et Array kan se ud:
        int[][] multipleArray = {{1, 4, 5, 7, 9, 12}, {8, 90, 12, 73, 12, 0}};
        System.out.println("Sådan finder du længden på et dobbelt Array");
        //Sådan printer man et dobbelt Array: system.out.println(Array navn + indextal for hver af dem [][])
        System.out.println("længden på multiArrayet er: " + multipleArray.length);

        System.out.println(" ");

        System.out.println("Sådan printer du en værdi fra en af de 2 Arrays");
        System.out.println(multipleArray[0][3]);
      /*første boks er bestemmer om det er første eller andet Array, mens anden boks fortæller. hvilken
        index plads det er i det pågældende array. der er to Arrays 0 & 1.*/

        System.out.println(" ");


        int[][] value = {{1, 4, 5, 7, 9, 12}, {8, 90, 12, 73, 12, 0}};
        System.out.println("Sådan skifter du en værdi i dit Array ud med et andet.");
        //skift en værdi ud med et andet i et dobbelt Array:
            value[0][3] = 21; //nu skiftes 7tallet i Array 1 ud med tallet 21.
        System.out.println("7 er nu blevet til: " + value[0][3]);

        System.out.println(" ");



        int[][] loopArray = {{1, 7, 9, 7, 9, 12}, {8, 91, 13, 73, 12, 0}};
        System.out.println("sådan looper du igennem et multi-dimension Array");

        for (int i = 0; i < loopArray.length; i++) {
            for (int j = 0; j < loopArray[i].length; j++) {
                System.out.println(loopArray[i][j]);

                System.out.println(" ");


            }


        }

    }
}
