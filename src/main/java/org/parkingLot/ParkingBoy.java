package org.parkingLot;

import java.util.ArrayList;

public class ParkingBoy {
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public ArrayList<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public ParkingBoy(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLot checkInParkingLot(ArrayList<ParkingLot> parkingLots) {
        for (int i = 0; i < parkingLots.size() - 1; i++) {
            int lastParkingLot = ParkingLot.getRemainPark(parkingLots.get(i));
            int nextParkingLot = ParkingLot.getRemainPark(parkingLots.get(i + 1));
            if (lastParkingLot > nextParkingLot) {
                int temp = lastParkingLot;
                lastParkingLot = nextParkingLot;
                nextParkingLot = temp;
            }
        }
        return parkingLots.get(parkingLots.size() - 1);
    }
}
