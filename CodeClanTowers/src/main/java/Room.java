import java.util.ArrayList;

public abstract class Room  {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if(this.guests.size() < this.capacity) this.guests.add(guest);
    }

    public ArrayList<Guest> getGuests(){
        return this.guests;
    }


}
