import java.util.ArrayList;

public abstract class Room  {

    private ArrayList<Guest> guests;

    public Room() {
        this.guests = new ArrayList<Guest>();
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public ArrayList<Guest> getGuests(){
        return this.guests;
    }

}
