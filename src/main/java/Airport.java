import java.util.ArrayList;

public class Airport {
    ArrayList<Flight> flights;
    private String name;

    public Airport (String name){
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public void addNewPassenger(String name, ContactInfo contactInfo){
        Passenger passenger = new Passenger(name, contactInfo);
    }

    public void addNewFlight(String destination){
        Flight flight = new Flight (destination);
    }
    public void addNewFlightToFlights(Flight flight){
        this.flights.add(flight);
    }

    public ArrayList<Flight> displayFlights(){
        return this.flights;
    }

    public void bookPassenger(Passenger passenger, Flight flight){
        for (int i = 0; i < this.flights.size(); i++) {
            if (flights.get(i).equals(flight)) { //neeed to have check for if passenger is already on flight
                flights.get(i).addPassenger(passenger);
            }
        }
    }

    public void removePassenger(Passenger passenger, Flight flight) {
        for (int i = 0; i < this.flights.size(); i++) {
            if (flights.get(i).equals(flight)) { //neeed to have check for if passenger is already on flight
                for (int j = 0; j < flights.get(i).getPassengers().size(); j++) {
                    if (flights.get(i).getPassengers().get(j).equals(passenger)) {
                        flights.get(i).getPassengers().remove(j);
                    } else {
                        System.out.println("passenger not on flight");
                    }
                }

            }
        }
    }

    public void removeFlight(Flight flight){
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).equals(flight)){
                flights.remove(i);
            }
        }
    }

}
