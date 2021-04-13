import java.util.ArrayList;

public class Event extends ArrayList {
    String name;
    int entries;
    ArrayList<Venue> venueName;
    ArrayList<CharityRun> charityDetails;
    ArrayList<Competitor> competitors;

    Event(String name, int entries) {
        this.name = name;
        this.entries = entries;

        venueName = new ArrayList<>();
        charityDetails = new ArrayList<>();
    }

    // create information for town venue
    public void addTownVenue(String nameOfVenue) {
        venueName.add(new Town(nameOfVenue));
    }

    // create information for park venue
    public void addParkVenue(String nameOfVenue, int num) {
        venueName.add(new Park(nameOfVenue, num));
    }

    // create information for half marathon
    public void addHalfMarathon(int num, String date, String time) { charityDetails.add(new HalfMarathon(num, date, time)); }

    // create information for five km run
    public void addFiveKmRun(String date, String time) {
        charityDetails.add(new FiveKmRun(date, time));
    }

    // display name of event venue, current entries, event length, if water stations = true
    public void outputEventInfo() {
        System.out.println("--------------------------");
        System.out.println("Name Of Venue ["+venueName.get(0).venueName+"]");
        System.out.println("Current Entries ["+entries+"]");
        System.out.println("Event Type ["+charityDetails.get(0).type+"]");
        if(charityDetails.get(0).type == "Half Marathon") {
            System.out.println(charityDetails.get(0).toString());
        }
    }

    // display venue dates and start times, if park, then output the number of changing facilities
    public void outputVenueInfo() {
        System.out.println("--------------------------");
        System.out.println("Name Of Venue ["+venueName.get(0).venueName+"]");
        System.out.println("Date of Event: ["+charityDetails.get(0).date+"]");
        System.out.println("Time of Event: ["+charityDetails.get(0).time+"]");
        if(venueName.get(0).type == "Park") {
            System.out.println(venueName.get(0).toString());
        }
    }
}
