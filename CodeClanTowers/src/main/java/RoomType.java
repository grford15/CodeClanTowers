public enum RoomType {

    SINGLE("Single", 50),
    DOUBLE("Double", 80),
    TWIN("Twin", 80),
    DELUXE("Deluxe", 150);

    private String name;
    private int rate;

    RoomType(String name, int rate){
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }


}
