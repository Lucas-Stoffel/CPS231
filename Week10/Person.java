package Week10;

public class Person {

    static String firstname;

    static String lastname;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    Person(String firstname, String lastname){

        super();
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public Person(){

        this.firstname = "";

        this.lastname = "";


    }
    
}
