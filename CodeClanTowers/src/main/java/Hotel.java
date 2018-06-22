import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
    }

    public int getRooms() {
        return rooms.size();
    }

    public void addRooms(Room room) {
        this.rooms.add(room);
    }
}
