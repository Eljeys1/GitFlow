package Test;

import java.util.ArrayList;

public class testMain {

    public static void main(String[] args){
        ArrayList<Integer> minAnonymeArrayList = new ArrayList<>();
        minAnonymeArrayList.add(9);
        minAnonymeArrayList.add(18);
        minAnonymeArrayList.add(27);
        minAnonymeArrayList.add(36);
        minAnonymeArrayList.add(45);

        minAnonymeArrayList.add(54);

        int førsteTal= minAnonymeArrayList.get(0);
        System.out.println(minAnonymeArrayList);
        //ud kommmer [9,18,27,36,45,54]

        char[] chars={'a','b','c','d'};
        System.out.println(chars); //vil blive printet som en String abcd

        System.out.println("");
        System.out.println("eksempel på passing Arrays to methods");

        int[] numbers ={0,1};  //array består af 2 elementer.
        change(numbers); //kalder en metode kaldt change(); som får tilført numbers som parameter/argument til metoden change.
        printArray(numbers); //en metode "printArray".

    }
    //TODO 1) har en metode "change" indholdende en int array "numbers" dette array indholder informationerne af ovenståend array med samme navn.
    //TODO 2) asigner først element i array til =1 så ville arayet se ud: //{1,1}
    //TODO 3) assigner andet element til =0. arrayet vil se ud som følgende: //{1, 0}
    public static void change(int[] numbers) {  //1)
        numbers[0] = 1;                         //2)
        numbers[1] = 0;                         //3)
    }

    public static void printArray(int[] numbers) {
        for(int i
            =0; i< numbers.length; i++);
        System.out.println(numbers[i]+ " ");
    }
}
