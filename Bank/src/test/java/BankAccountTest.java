import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Bruce", "Wayne", "23/07/1999", 3943);
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

    



}
