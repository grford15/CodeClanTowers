import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom;
    Guest guest1;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(401, RoomType.SINGLE);
        guest1 = new Guest("Greg", 100);
    }

    @Test
    public void roomHasRate() {
        assertEquals(50, bedroom.rate());
    }

    @Test
    public void roomHasRoomNumber(){
        assertEquals(401, bedroom.getRoomNumber());
    }

    @Test
    public void roomHasRoomType(){
        assertEquals("Single", bedroom.getRoomType());
    }

    @Test
    public void roomCanAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getGuests());
    }


}
