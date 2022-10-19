package org.parkingLot;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingBoy {
    private final ArrayList<ParkingLot> parkingLots;
    private final AtomicInteger Id = new AtomicInteger();
    private final int parkingBoyId;

    public ParkingBoy(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
        this.parkingBoyId = Id.incrementAndGet() ;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public Optional chooseParkingLot() {
         Optional<ParkingLot> choice = parkingLots.stream()
                 .sorted( (p1, p2) -> -Integer.compare(p1.getRemainParks(), p2.getRemainParks()))
                 .findFirst();
        return choice;
    }

    }

