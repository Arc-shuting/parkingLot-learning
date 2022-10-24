package org.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParkingLot {
    private final List<Park> parks;
    private int parkingLotId;

    private final static String TICKET = "ticket";

    public List<Park> getParks() {
        return parks;
    }

    public ParkingLot(List<Park> parks, int parkingLotId) {
        this.parks = parks;
        this.parkingLotId  = parkingLotId;
    }

    public int getRemainParks() {
        return (
           this.parks.stream()
           .map(Park::getStates)
           .filter(states -> !states)
           .toList()
           .size()
        );
    }

    public String checkIN() throws Exception {
        /*Stream<Boolean> remainParks = this.parks.stream()
                .map(Park::getStates)
                .filter(states -> !states);*/
        this.parks.stream()
                .filter(Park::getStates)
                .findFirst()
                .orElseThrow(Exception::new)
                .setStates(true);
        return TICKET;
    }

    public String pickUp() throws Exception {
        /*Stream<Boolean> usedParks = this.parks.stream()
                .map(Park::getStates)
                .filter(states -> states);*/
        this.parks.stream()
                .filter(Park::getStates)
                .findFirst()
                .orElseThrow(Exception::new)
                .setStates(false);
        return "Success";
    }
}

