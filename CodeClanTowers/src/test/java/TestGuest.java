import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Greg", 200);
    }

    @Test
    public void guestHasName() {
        assertEquals("Greg", guest1.getName());
    }

    @Test
    public void guestHasWallet() {
        assertEquals(200, guest1.getWallet());
    }
}
