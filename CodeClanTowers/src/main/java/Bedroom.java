public class Bedroom extends Room {


    private RoomType roomType;
    private int capacity;
    private int roomNumber;


    public Bedroom(int roomNumber, RoomType roomType, int capacity) {

        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
    }

    public int rate() {
        return roomType.getRate();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType.getName();
    }


    public void addGuest(Guest guest) {

        if(guest.getWallet() > this.roomType.getRate()){
            super.addGuest(guest);
        }

    }
}
