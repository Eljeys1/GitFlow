package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // program hvor der ligger alle tal i et array Sammen.
        int[] ArraySum = {10, 90, 1000, 89, 76, 300};

        int Sum = 0;

        //laver et for each loop der køre Array igennem.
        for (int num : ArraySum) {
            Sum = Sum + num;
        }
        System.out.println("The result is: " + Sum);

        //sorter et array så alle nuller kommer til at stå til sidst.
        int[] inputArr = {0,9,7,39,0,76,45,0,0,6,12,19,51,0,7};

        int counter = 0;
        //vi går i gennem Arrayet et for loop.
        for(int i = 0; i< inputArr.length;i++) {
            if(inputArr[i] != 0) {
                inputArr[counter] = inputArr[i];
                counter++;                             //hvorfor ville denne print kun 0'er ud hvis man fjerner Counter++ fra denne linje?
            }

        }
        //efterfølgende laves et while loop

        while(counter<inputArr.length){
            inputArr[counter] = 0;
            counter++;
        }
        System.out.println(Arrays.toString(inputArr));

        //laver en kode der kan finde det næststørste tal i et array.
        //laver et Array:
        int talArray[]= new int[] {12,78,19,100,300,678,990,8365,9087,76,13};

        //sorter Arrayet:
        Arrays.sort(talArray);

        // gentag Arrayet til det har rammer det næstsidste element i arrayet.
        for(int i=0; i<talArray.length; i++){
            //print det næst sidste element:
            if(i == talArray.length - 2)
            System.out.println("Det næststørste tal er: " + talArray[i]);
        }

    }



    }


