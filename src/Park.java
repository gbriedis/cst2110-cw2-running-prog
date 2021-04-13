public class Park extends Venue {

    int numOfChangingFacilities;

    Park(String venueName, int num) {
        super(venueName);
        this.numOfChangingFacilities = num;
        type = "Park";
    }

    public String toString() {
        return "Number of Changing Facilities: [" + numOfChangingFacilities+']';
    }
}
