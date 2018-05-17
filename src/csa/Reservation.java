package csa;

public class Reservation {
    private String name;
    private boolean frequentFlyer;
    /** Constructs a reservation for a passenger
     *  @param passengerName the passenger's name */
    public Reservation(String passengerName, boolean flyer) {
        name = passengerName;
        frequentFlyer = flyer;
    }

    /** Returns the name of the passenger associated with the reservation
     *  @return the passenger's name */
    public String passengerName() {
        return name;
    }

    /**
     * Returns whether the passenger associated with the reservation is a frequent flyer
     * @return true if the passenger is a frequent flyer, false otherwise
     */
    public boolean isFrequentFlyer() {
        return frequentFlyer;
    }
}
