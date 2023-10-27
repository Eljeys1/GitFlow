package ClassesAndObjects;

public class Main {
    // attributes/variabler/felter
   final int x = 5; //sætte der final foran int x=5 ville man ikke kunne overskrive værdien som der gøres pålinje 22.
    //final er et keyword kaldt en "modifier"
    int y;

    public static void main(String[] args){
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println((myObj1.x));
        System.out.print(myObj2.x);


        Main myObj3 = new Main();
        myObj3.y=40;

        //der printes 55, da de tager x=5 for 2 objekter + x=5 og ligger til object 3 som har en værdi 40.
        System.out.println(myObj3.x);

        Main myObj4 = new Main();
        //myObj4.x=25; //x går fra at være 5 til at 25.
        //System.out.println(myObj4.x);
    }


    }

