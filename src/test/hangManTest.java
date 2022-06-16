import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class hangManTest {

    hangMan man;

    @BeforeEach
    void setup() {man = new hangMan();}

    @Test
    void setInput() {
        man.setInput("J");
        assertEquals("J", man.userInput, "setInput() failed");

    }

    @Test
    void getInput(){
        man.setInput("T");
        String test = man.getInput();
        assertEquals("T", test, "getInput() failed");
    }

    @AfterEach
    void tearDown()
    {

    }

}
