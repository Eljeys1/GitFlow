package Opgaver_Array;

import java.sql.Array;
import java.util.Arrays;

public class opgaver_Array {


      /*Opgave 1: Sum af elementer i et array
Skriv en metode, der tager et heltalsarray som input og returnerer summen af alle elementerne i arrayet.*/

    public static int CalculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /*Opgave 2: Find det største element
        Skriv en metode, der tager et heltalsarray som input og returnerer det største element i arrayet.*/


    //TODO 1) der er lavet en metode kaldt "findLargest" som indeholder et Array.
    //TODO 2) efterfølgende har jeg lavet en betingelse som siger at hvis array== null (tomt) eller kun indholder 0 skal der smides en exception (koden virker ik).
    //TODO 3) declare en ny variable largest (datatype int) som array[0] her vælger jeg at antage at den første plads har det største tal.
    //TODO 4) køre Arrayet igennem med et for-loop for at finde det største tal.
    //TODO 5) return det int largest.
    public static int findLargest(int[] arr) {                                                                  //1
        if (arr == null || arr.length == 0) {                                                                   //2
            // Håndter specialtilfælde: Tomt array eller null-array
            throw new IllegalArgumentException("Arrayet er tomt eller null.");
        }

        int largest = arr[0]; // Antag det første element er det største                                        //3

        // Gennemløb arrayet for at finde det største element                                                   //4
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;                                                                                         //5
    }

    /*Opgave 3: Omvendt rækkefølge
    Skriv en metode, der tager et array af strengværdier som input og returnerer et nyt array, hvor elementerne er i omvendt rækkefølge.*/
    public static int[] reversArr(int[] arr) {
     int length = arr.length;
     int [] omvendtArray= new int[length];
     //laver et for-loop.
        for(int i=0; i<length; i++) {
            omvendtArray[i] = arr[length-1-i];
        }
            return omvendtArray;
    }





    public static void main(String[] args) {
        System.out.println("Opgave 1: ");

        int[] SumArray = {5, 7, 8, 9, 0, 9, 88, 100};
        int result = CalculateSum(SumArray);
        System.out.println("the reuslt is: " + result);

        System.out.println(" ");

        System.out.println("opgave 2: ");

        /*Opgave 2: Find det største element
        Skriv en metode, der tager et heltalsarray som input og returnerer det største element i arrayet.*/

            //TODO 1) declar et array.
            //TODO 2) declare en variable ("largest element") som = metoden "findLargest" som skal indholde et Array. (myArray)
            //TODO 3) printer en sætning plus indholdet fra vores variable "largestElement".

            int[] myArray = {5, 60, 90, 100, 2000};                                                                 //1
            int largestElement = findLargest(myArray);                                                              //2
            System.out.println("Det største element i arrayet er: " + largestElement);                              //3

        System.out.println(" ");

        //opgave 3 Omvendt rækkefølge Skriv en metode, der tager et array af strengværdier
        // som input og returnerer et nyt array, hvor elementerne er i omvendt rækkefølge.*/

        System.out.println("opgave 3 omvendt rækkefølge");

        int[] mitArray = {2,8,80,87,50,60};
        int[]  reversArr=(mitArray);
        System.out.println("omvendt rækkefølge: ");
        for(int nummer: reversArr){
            System.out.println(nummer + " ");

            System.out.println(" ");
            System.out.println("test");



        }


        }


    }


