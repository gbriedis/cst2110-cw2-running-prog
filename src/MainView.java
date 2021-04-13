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
                // output event info
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
                    // output venue info
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
                    // add user to a race
                    System.out.println("Select an Event you wish to join: ");
                    for (int i = 0; i < allEvents.size(); i++) {
                        System.out.println(i+ " Event Name: "+ allEvents.get(i).name);
                    }
                    System.out.print("Pick an event [0-3] > ");
                    int addUserVenueId  = scan.nextInt();
                    System.out.println("Enter [1] to join [Half-Marathon]");
                    System.out.println("Enter [2] to join [5km Run]");
                    int venueType  = scan.nextInt();
                    System.out.print("Enter user name > ");
                    String userName = scan.nextLine();
                    System.out.print("Enter user age > ");
                    int userAge = scan.nextInt();
                    if(addUserVenueId == 0) {
                        event1.addUser(venueType, userName, userAge);
                    }
                    else if (addUserVenueId == 1) {
                        event2.addUser(venueType, userName, userAge);
                    }
                    else if (addUserVenueId == 2) {
                        event3.addUser(venueType, userName, userAge);
                    }
                    else if (addUserVenueId == 3) {
                        event4.addUser(venueType, userName, userAge);
                    }
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
        System.out.println("3 to ADD USER TO A RACE");
        System.out.println("0 to EXIT THE PROGRAM");
        System.out.println("------------------------------");
    }

}
