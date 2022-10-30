/*
package org.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingBoy {

    private final ArrayList<ParkingLot> parkingLots;
    private final int parkingBoyId;

    public ParkingBoy(ArrayList<ParkingLot> parkingLots) {
        super();
        this.parkingLots = parkingLots;
        AtomicInteger id = new AtomicInteger();
        this.parkingBoyId = id.incrementAndGet() ;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }
    public ArrayList<ParkingLot> getParkingLots(int Id) {
        for(int i = 0; i< parkingLots.size(); i++) {
            if(this.parkingBoyId == Id) {
                return this.parkingLots;
            }
        }
            return null;
    }

    public Optional chooseParkingLot() {
         Optional<ParkingLot> choice = parkingLots.stream()
                 .sorted( (p1, p2) -> -Integer.compare(p1.getRemainParks(), p2.getRemainParks()))
                 .findFirst();
        return choice;
    }

    public String parking() {
        chooseParkingLot().checkIN();
    }

    public void addParkingLot(List<Park>parks, int Id) {
        parkingLots.add(new ParkingLot(parks, Id));
    }
    public void removeParkingLot(int Id) {
        parkingLots.remove(getParkingLots(Id));
    }

    }

*/
