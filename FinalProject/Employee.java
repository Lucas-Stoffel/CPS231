package FinalProject;

public class Employee extends Person{

    int IDnum;
    String Email;
    double balance;
    String EmployeeType;    

    public void setIDnumber(int IDnum){
        this.IDnum = IDnum;
    }

    public int getIDnum(){
        return IDnum;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getEmail(){
        return Email;
    }

    public void setBalance(int Balance){
        this.balance = Balance;        
    }

    public double getBalance(){
        return balance;        
    }

    public void setEmployeeType(String EmployeeType) {
        this.EmployeeType = EmployeeType;        
    }


    public String getEmployeeType() {
        return EmployeeType;
    }

    public void deposit(double amount) {
        if (amount >= 0.0) {
            balance += amount;
            System.out.println("*Depositing $" + amount + " to Balance*\n");
        } else {
            System.err.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {

        if (amount >= 0.0 && amount <= balance) {
            balance -= amount;
            System.out.println("*Withdrawing $" + amount + " from Balance*\n");
        } else {
            System.err.println("Withdrawal amount must be positive and cannot be greater than balance");
        }
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
    Employee(String firstname, String lastname, int IDnum, String Email, double Balance, String EmployeeType) {

        super(firstname,lastname);        
        this.IDnum = IDnum;
        this.Email = Email;
        this.balance = Balance;
        this.EmployeeType = EmployeeType;
    }

    public Employee(){
        IDnum = 0;
        Email = "";
        balance = 0;
        EmployeeType = "";
    }

}
