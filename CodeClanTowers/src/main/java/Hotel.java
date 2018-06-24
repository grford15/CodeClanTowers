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

    public void addGuest(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void removeGuest(Guest guest, Room room) {
        for(Guest person : room.getGuests()) {
            if(person == guest){
                room.getGuests().remove(guest);
                return;
            }
        }

    }

    public ArrayList<Room> availableRooms() {
        ArrayList emptyRooms = new ArrayList();
        for(Room bedroom : this.rooms)
            if (bedroom.getNumberOfGuests() == 0) {
                emptyRooms.add(bedroom);
            }
        return emptyRooms;}
}
