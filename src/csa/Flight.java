package csa;

import java.util.List;
import java.util.ArrayList;

public class Flight {
    /** A two-dimensional array of reservations with empty seats represented by null,
     *  instantiated in the constructor */
    private Reservation[][] seats;

    /** The number of rows of seats, set by the constructor; guaranteed to be >= 1 */
    private int rows;

    /** The number of seats per row, set by the constructor; guaranteed to be >= 3 */
    private int seatsPerRow;

    /** Determines the name of each frequent flyer with a reservation
     *  @return a list of the names of the frequent flyers with reservations */
    public List<String> frequentFlyers() {
        ArrayList<String> frequentFlyers = new ArrayList<>();
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[0].length; j++){
                if (seats[i][j].isFrequentFlyer()){
                    frequentFlyers.add(seats[i][j].passengerName());
                }
            }
        }
        return frequentFlyers;
    }

    /** Reserves adjacent seats and returns true if possible; otherwise,
     *  does not make reservations and returns false.
     *  @param passOneName the name of a passenger seeking a reservation
     *  @param passTwoName the name of a passenger seeking a reservation
     *  @return true if adjacent seats were reserved, false if no adjacent seats are available */
    public boolean reserveAdjacentSeats(String passOneName, String passTwoName, boolean oneIsFlyer, boolean twoIsFlyer) {
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[0].length; j++){
                if (seats[i][j] == null && seats[i][j + 1] == null){
                    seats[i][j] = new Reservation(passOneName, oneIsFlyer) ;
                    seats[i][j+1] = new Reservation(passTwoName, twoIsFlyer);
                    return true;
                }
            }
        }
        return false;
    }

    /** Reserves a window seat and returns true if possible; otherwise,
     *  does not make a reservation and returns false
     *  @param passengerName the name of a passenger seeking a reservation
     *  @return true if a window seat was reserved, false if no window seat is available */
    public boolean reserveWindowSeat(String passengerName, boolean isFlyer) {
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[0].length; j++){
                if ((i == 0 || i == seats.length - 1) && seats[i][j] == null){
                    seats[i][j] = new Reservation(passengerName, isFlyer) ;
                    return true;
                }
            }
        }
        return false;
    }

    /** Determines the name of each passenger without an adjacent reservation.
     *  @return a list of the names of all passengers without adjacent reservations */
    public List<String> isolatedPassengers() {
        ArrayList<String> isolatedPassengers = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (i == 0 && seats[i][j + 1] == null){
                    isolatedPassengers.add(seats[i][j].passengerName());
                }
                else if (i == seats.length - 1 && seats[i][j - 1] == null){
                    isolatedPassengers.add(seats[i][j].passengerName());
                }
                else if (seats[i][j + 1] == null && seats[i][j - 1] == null){
                    isolatedPassengers.add(seats[i][j].passengerName());
                }
            }
        }
        return isolatedPassengers;
    }
}
