package org.parkingLot;

import java.util.Comparator;
import java.util.List;

public class ParkingBoy {

    private final List<ParkingLot> parkingLots;
    private final String parkingBoyId;

    public ParkingBoy(List<ParkingLot> parkingLots, String id) {
        this.parkingLots = parkingLots;
        this.parkingBoyId = id;
    }

    public String getParkingBoyId() {
        return parkingBoyId;
    }

    public List<ParkingLot> getParkingLots() {
        return this.parkingLots;
    }

    public String parkingBoy(String carNum) {
        try {
            return this.parkingLots.stream()
                    .max(Comparator.comparingInt(ParkingLot::getRemainParks))
                    .orElseThrow(Exception::new)
                    .checkIN(carNum);
        } catch (Exception e) {
            return null;
        }
    }

    public String pickUpBoy(String id, Tickets tickets) {
        try {
            return this.parkingLots.stream()
                    .filter(item -> !item.getParkingLotId().equals(id))
                    .findFirst()
                    .orElseThrow(Exception::new)
                    .pickUp(tickets);
        } catch (Exception e) {
            return null;
        }
    }
}
