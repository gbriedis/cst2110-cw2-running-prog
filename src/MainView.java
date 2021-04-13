import java.util.ArrayList;
import java.util.Scanner;

public class MainView {

    public static void main(String[] args)  {
        ArrayList<Event> allEvents = new ArrayList<>();

        // event 1 info
        Event event1 = new Event("North London Event", 51);
        event1.addParkVenue("North London Park Race", 2);
        event1.addFiveKmRun("21/06/2021", "15:30");

        // event 2 info
        Event event2 = new Event("South London Event", 52);
        event2.addTownVenue("South London Town Run");
        event2.addHalfMarathon(2, "21/06/2021", "09:00");

        // event 3 info
        Event event3 = new Event("Middlesex Charity Run", 102);
        event3.addParkVenue("Around the campus park", 1);
        event3.addFiveKmRun("16/04/2021", "16:30");

        // event 4 info
        Event event4 = new Event("Celebratory Event", 18);
        event4.addParkVenue("Celebrate passing the course", 2);
        event4.addHalfMarathon(2, "16/04/2021", "09:00");

        allEvents.add(event1);
        allEvents.add(event2);
        allEvents.add(event3);
        allEvents.add(event4);

        while(true) {
            displayChoice();
            Scanner scan = new Scanner(System.in);
            String choice  = scan.nextLine();
            switch(choice) {
                case "1":
                    System.out.println("Events: ");
                    for (int i = 0; i < allEvents.size(); i++) {
                        System.out.println(i+ " Event Name: "+ allEvents.get(i).name);
                    }
                    System.out.print("Pick an event [0-3] > ");
                    int eventId  = scan.nextInt();
                    if(eventId == 0) {
                        event1.outputEventInfo();
                    }
                    else if (eventId == 1) {
                        event2.outputEventInfo();
                    }
                    else if (eventId == 2) {
                        event3.outputEventInfo();
                    }
                    else if (eventId == 3) {
                        event4.outputEventInfo();
                    }
                    break;
                case "2":
                    System.out.println("Events: ");
                    for (int i = 0; i < allEvents.size(); i++) {
                        System.out.println(i+ " Event Name: "+ allEvents.get(i).name);
                    }
                    System.out.print("Pick an event [0-3] > ");
                    int venueId  = scan.nextInt();
                    if(venueId == 0) {
                        event1.outputVenueInfo();
                    }
                    else if (venueId == 1) {
                        event2.outputVenueInfo();
                    }
                    else if (venueId == 2) {
                        event3.outputVenueInfo();
                    }
                    else if (venueId == 3) {
                        event4.outputVenueInfo();
                    }
                    break;
                case "3":
                    System.out.println("search event entries");
                    break;
                case "0":
                    System.out.println("Closing Program");
                    return;
                default:
                    System.out.println("Pick a valid choice");
            }
        }
    }

    // display choices to user
    static void displayChoice() {
        System.out.println("------------------------------");
        System.out.println("Pick between the valid choices");
        System.out.println("1 to LIST EVENT INFORMATION");
        System.out.println("2 to LIST VENUE DETAILS");
        System.out.println("3 to SEARCH EVENT ENTRIES");
        System.out.println("0 to EXIT THE PROGRAM");
        System.out.println("------------------------------");
    }

}
