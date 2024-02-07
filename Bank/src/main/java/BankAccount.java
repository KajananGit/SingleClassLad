import java.util.Objects;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;
    private int overdraft;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, String accountType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
        this.overdraft = -500;
    }

//    Getters and Setters methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }




//    Custom methods
    public void deposit(int deposit){
        balance += deposit;
    }


    public void withdraw(int withdrawalAmount){
        if(balance - withdrawalAmount >= overdraft){
            balance -= withdrawalAmount;
        }
    }

    public void payInterest(){
        if(accountType == "Savings"){
            balance = (int) (balance + balance * 0.2);
        }
        if(accountType == "Personal"){
            balance = (int) (balance + balance * 0.05);
        }
        else {
        }
    }




//
}
