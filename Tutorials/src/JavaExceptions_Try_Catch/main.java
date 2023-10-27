package JavaExceptions_Try_Catch;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args){

        //Dette er en Try Catch hvor koden køres, og scannes for fejl.
        try {
            int[] myNumbers = {1, 3, 4, 5, 6, 7};
            System.out.println(myNumbers[10]);
        }catch (Exception e) {
            System.out.println("Error: Somthing went wrong");
            // man kan udvide den med "Finally" gør det muligt at eksekvere kode efter try..Catch.
        }finally {
            System.out.println("'Finally': The 'try catch' is finished");
        }


    }

}
