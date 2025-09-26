// A Trip has three constructors
// When one argument is passed,
// it is the trip destination
// When two arguments are passed,
// they are the destination and departure cities
// When three arguments are passed,
// the last one is the mode of transportation for the trip
public class DebugTrip
{
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Davao City";
    private static final String DEFAULT_MODE = "bus";

    public DebugTrip(String destination)
    {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    public DebugTrip(String destination, String departure)
    {
        this(destination, departure, DEFAULT_MODE);  
    }

    public DebugTrip(String destination, String departure, String mode)
    {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination()
    {
        return destination;
    }

    public String getDepartureCity()
    {
        return departure;
    }

    public String getMode()
    {
        return mode;
    }

    public static void main(String[] args)
    {
        DebugTrip trip1 = new DebugTrip("Cagayan de Oro");
        DebugTrip trip2 = new DebugTrip("Surigao del Norte", "Butuan City");
        DebugTrip trip3 = new DebugTrip("Zamboanga City", "Surigao del norte", "train");

        System.out.println("Trip1 -> Destination: " + trip1.getDestination() +
                           ", Departure: " + trip1.getDepartureCity() +
                           ", Mode: " + trip1.getMode());

        System.out.println("Trip2 -> Destination: " + trip2.getDestination() +
                           ", Departure: " + trip2.getDepartureCity() +
                           ", Mode: " + trip2.getMode());

        System.out.println("Trip3 -> Destination: " + trip3.getDestination() +
                           ", Departure: " + trip3.getDepartureCity() +
                           ", Mode: " + trip3.getMode());
    }
}
