public class Park extends Venue {

    private int numChangingFacilities = 5;

    public Park() {
        name = "London";
    }

    public void display() {
        System.out.println("Name of park: " + name);
        System.out.println("Number of changing facilities: " + numChangingFacilities);
    }
}
