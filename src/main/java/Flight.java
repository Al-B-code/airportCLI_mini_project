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

}
