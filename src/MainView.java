import java.util.Scanner;

public class MainView {

    public void displayChoice() {
        System.out.println("------------------------------");
        System.out.println("Pick between the valid choices");
        System.out.println("1 to LIST EVENT INFORMATION");
        System.out.println("2 to LIST VENUE DETAILS");
        System.out.println("3 to SEARCH EVENT ENTRIES");
        System.out.println("------------------------------");
    }

    public void userChoice(String choice) {
        switch(choice) {
            case "1":
                System.out.println("event info");
                return;
            case "2":
                System.out.println("venue details");
                return;
            case "3":
                System.out.println("search event entries");
                return;
            default:
                System.out.println("Pick a valid choice");
        }
    }

    public static void main(String[] args) {
        // class initialization
        MainView output = new MainView();

        output.displayChoice();

        Scanner scanInput = new Scanner(System.in);
        String userInput = scanInput.nextLine();

        output.userChoice(userInput);

    }
}
