package org.parkingLot;

import java.util.List;

public class ParkingLot {
    private final List<Park> parks;

    private final String parkingLotId;

    private List<Tickets> tickets;

    public ParkingLot(List<Park> parks, String parkingLotId) {
        this.parks = parks;
        this.parkingLotId  = parkingLotId;
        this.tickets = null;
    }
    public List<Park> getParks() {
        return parks;
    }

    public String getParkingLotId() {
        return parkingLotId;
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

    public String checkIN(String carNum) throws Exception {
        this.tickets.add(new Tickets(carNum));
        this.parks.stream()
                .filter(Park::getStates)
                .findFirst()
                .orElseThrow(Exception::new)
                .setStates(true);
        return "success";
    }

    public String pickUp(Tickets tickets) throws Exception {
        this.tickets.stream()
                .filter(item -> item.getCarNum().equals(tickets.getCarNum()))
                .findFirst()
                .orElseThrow(Exception::new)
                .getPark()
                .setStates(false);
        this.tickets.remove(tickets);
        return "success";
    }
}
