package FinalProject;

public class Faculty extends Employee{

    String subject;

    public void setSubject(String subject) {

        this.subject = subject;
        
    }

    public String getSubject(){
        return subject;
    }

    Faculty(String subject){
        
        this.subject = subject;

    }

    public Faculty(String firstname, String lastname, int IDnum, String Email, double Balance, String EmployeeType, 
            int PhoneNumber,int CashAppWallet, String subject){
        
        super(firstname, lastname, IDnum, Email, Balance, EmployeeType);
        subject = "";

    }
    
}
