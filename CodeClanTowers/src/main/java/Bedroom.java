public class Bedroom extends Room {


    private RoomType roomType;
    private int roomNumber;


    public Bedroom(int roomNumber, RoomType roomType) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int rate() {
        return roomType.getRate();
    }

    public int getRoomNumber() {
        return this.roomNumber;
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
