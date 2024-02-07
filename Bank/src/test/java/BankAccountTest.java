import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Bruce", "Wayne", "23/07/1999", 3943, "Savings");
    }

    @Test
    public void canGetFirstName() {
        String expected = "Bruce";
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Tom");
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo("Tom");
    }

    @Test
    public void canGetLastName(){
        String expected = "Wayne";
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        bankAccount.setFirstName("Hardy");
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo("Hardy");
    }

    @Test
    public void canGetDateOfBirth(){
        String expected = "23/07/1999";
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("07/10/1999");
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo("07/10/1999");
    }

    @Test
    public void canGetAccountNumber(){
        int expected = 3943;
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(007);
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(007);
    }

    @Test
    public void canGetBalance(){
        int expected = 0;
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(100);
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(100);
    }

    @Test
    public void canDepositMoney(){
        bankAccount.deposit(100);
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(100);
    }

    @Test
    public void canWithdrawMoney(){
        bankAccount.withdraw(100);
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(-100);
    }

    @Test
    public void canGetAccountType(){
        String expected = "Savings";
        String actual = bankAccount.getAccountType();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountType(){
        bankAccount.setAccountType("Personal");
        String actual = bankAccount.getAccountType();
        assertThat(actual).isEqualTo("Personal");
    }


    @Test
    public void canPayInterestOnSavingsAccount(){ // If account type == Savings 20% interest rate should be paid
        bankAccount.deposit(100);
        bankAccount.payInterest();
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(120);
    }

    @Test
    public void canPayInterestOnPersonalAccount(){ // If account type == Savings .05% interest rate should be paid
        bankAccount.deposit(100);
        bankAccount.setAccountType("Personal");
        bankAccount.payInterest();
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(105);
    }

    @Test
    public void cannotPayInterestOnAnyAccountType(){
        bankAccount.setAccountType("Credit");
        bankAccount.deposit(100);
        bankAccount.payInterest();
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(100);
    }



}
