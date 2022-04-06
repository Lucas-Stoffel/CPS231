//NOTE ADDED
package Week10;


public class Employee extends Person{

    String IDnum;
    String Email;
    double Balance;
    String EmployeeType;
    int PhoneNumber;
    int CashAppWallet;

    /**
     * Sets the ID number of an Employee
     * @param IDnum
     */
    public void setIDnumber(String IDnum){
        this.IDnum = IDnum;
    }

    /**
     * Returns the ID number of an Employee
     * @return
     */
    public String getIDnum(){
        return IDnum;
    }

    /**
     * 
     * @param Email
     */
    public void setEmail(String Email){
        this.Email = Email;
    }

    /**
     * 
     * @return
     */
    public String getEmail(){
        return Email;
    }

    /**
     * 
     * @param Balance
     */
    public void setBalance(int Balance){
        this.Balance = Balance;        
    }

    /**
     * 
     * @return
     */
    public double getBalance(){
        return Balance;        
    }

    /**
     * 
     * @param EmployeeType
     */
    public void setEmployeeType(String EmployeeType) {
        this.EmployeeType = EmployeeType;        
    }


    public String getEmployeeType() {
        return EmployeeType;
    }


    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }


    public int getPhoneNumber(){
        return PhoneNumber;
    }


    public void setCashAppWallet(int CashAppWallet) {
        this.CashAppWallet = CashAppWallet;
    }


    public int getCashAppWallet(){
        return CashAppWallet;
    }


    /**
     * 
     * @param IDnum
     * @param Name
     * @param Email
     * @param Balance
     * @param EmployeeType
     * @param PhoneNumber
     * @param CashAppWallet
     */
    Employee(String firstname, String lastname, String IDnum, String Email, double Balance, String EmployeeType, int PhoneNumber,int CashAppWallet) {

        super(firstname,lastname);        
        this.IDnum = IDnum;
        this.Email = Email;
        this.Balance = Balance;
        this.EmployeeType = EmployeeType;
        this.PhoneNumber = PhoneNumber;
        this.CashAppWallet = CashAppWallet;
    }

    public Employee(){
        IDnum = "";
        Email = "";
        Balance = 0;
        EmployeeType = "";
        PhoneNumber = 0;
        CashAppWallet = 0;
    }

    public String print() {

		String Information = IDnum + " : " + firstname + " " + lastname + " : " + Email + " : " + Balance + " : " + EmployeeType + 
        " : " + PhoneNumber + " : " + CashAppWallet;
		return Information;
	}

}
