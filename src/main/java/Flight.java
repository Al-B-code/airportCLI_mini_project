import java.util.ArrayList;
import java.util.Random;

public class Flight {

    ArrayList<Passenger> passengers;
    String destination;
    int uniqueIdentifier;

    public Flight(String destination){
        Random random = new Random();
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.uniqueIdentifier = random.nextInt();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(int uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }
}
