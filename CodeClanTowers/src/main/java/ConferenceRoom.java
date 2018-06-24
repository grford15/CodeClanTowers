import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private final String name;
    private final int dailyRate;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int dailyRate, int capacity) {
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getDailyRate() {
        return dailyRate;
    }

}
