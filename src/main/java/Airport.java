import java.util.ArrayList;

public class Airport {
    ArrayList<Flight> flights;
    ArrayList<Passenger> airportPassengers;
    private String name;

    public Airport (String name){
        this.name = name;
        this.flights = new ArrayList<>();
        this.airportPassengers = new ArrayList<>();
    }

    public void addNewPassenger(String name, String email, String address, String phoneNumber){
        ContactInfo contactInfo = new ContactInfo(email, address, phoneNumber);
        Passenger passenger = new Passenger(name, contactInfo);
        this.airportPassengers.add(passenger);
    }

    public void addNewFlight(String destination){
        Flight flight = new Flight (destination);
        this.flights.add(flight);
    }
    public void addNewFlight(Flight flight){
        this.flights.add(flight); //might break everything if removed
    }

    public ArrayList<Flight> displayFlights(){
        return this.flights;
    }

    public void bookPassenger(String destination, int uniqueId){
        for (int i = 0; i < this.flights.size(); i++) {
            if (flights.get(i).getDestination().equals(destination)) { //neeed to have check for if passenger is already on flight
                for (int j = 0; j < this.airportPassengers.size() ; j++) {
                    if (airportPassengers.get(j).getUniqueId() == uniqueId){
                        flights.get(i).addPassenger(airportPassengers.get(j));
                    }
                }

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
