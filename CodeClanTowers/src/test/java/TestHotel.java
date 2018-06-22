import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();
        bedroom1 = new Bedroom(401, RoomType.DOUBLE);
        bedroom2 = new Bedroom(402, RoomType.TWIN);
        bedroom3 = new Bedroom(403, RoomType.DELUXE)
        conferenceRoom1 = new ConferenceRoom("Wu Tang", 100);
        conferenceRoom2 = new ConferenceRoom("Eazy-E", 80);
    }

    @Test
    public void hotelHasNoRooms() {
        assertEquals(0, hotel.getRooms());
    }

    @Test
    public void hotelCanAddRooms() {
        hotel.addRooms(bedroom1);
        hotel.addRooms(conferenceRoom1);
        assertEquals(2, hotel.getRooms());
    }
}
