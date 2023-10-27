package ClassesAndObjects.flere_Attributes;

public class Main {
    String fname;
    String lname;

    int age = 24;
    String JobTitle;

    Main(String fname, String lname, int age, String JobTitle) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.JobTitle = JobTitle;
    }
       public String toString() {
           return "Fornavn: " +fname+ "\n"+ "EfterNavn: "+lname+ "\n" +"Alder: " +age+ "\n"+ "Jobtitle: " + JobTitle;
        }


    public static void main(String[] args) {
        Main person = new Main("John","Svenson",47, "Bankmanager");

        System.out.println(person);
    }
}
