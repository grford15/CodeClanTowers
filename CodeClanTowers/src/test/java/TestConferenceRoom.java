import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {

    ConferenceRoom conferenceRoom;
    Guest guest1;

    @Before
    public void setUp() throws Exception {
        conferenceRoom = new ConferenceRoom("Peter Shirtliff", 100);
        guest1 = new Guest("Greg", 200);
    }

    @Test
    public void roomHasName(){
        assertEquals("Peter Shirtliff", conferenceRoom.getName());
    }

    @Test
    public void roomHasDayRate() {
        assertEquals(100, conferenceRoom.getDailyRate());
    }

    @Test
    public void roomHasNoGuests(){
        assertEquals(0, conferenceRoom.getGuests());
    }

    @Test
    public void roomCanAddGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests());
    }
}
