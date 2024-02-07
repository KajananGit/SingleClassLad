import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

    




}
