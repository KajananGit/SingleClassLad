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
}
