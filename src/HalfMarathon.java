
public class HalfMarathon extends CharityRun {

    int numOfWaterStations;


    HalfMarathon(int num, String date, String time) {
        super(date, time);
        this.numOfWaterStations = num;
        type = "Half Marathon";
    }

    @Override
    public String toString() {
        return "Number of Water Stations: [" + numOfWaterStations+']';
    }
}
