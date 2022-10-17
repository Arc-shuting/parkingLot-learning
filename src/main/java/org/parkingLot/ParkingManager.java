package org.parkingLot;

import java.util.ArrayList;

public class ParkingManager {
    private ArrayList<ParkingBoy> parkingBoys = new ArrayList<>();
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    private ParkingLot parkingLot = new ParkingLot();
    private ParkingBoy parkingBoy = new ParkingBoy(null);

    public ArrayList<ParkingLot> getParkingLots() {
        return parkingLots;
    }
    public ArrayList<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public void addParkingBoy(ArrayList<ParkingBoy> parkingBoys) {
        getParkingBoys().add(parkingBoy);
    }
    public void disParkingBoy(ArrayList<ParkingBoy> parkingBoys) {
        getParkingBoys().remove(parkingBoy);
    }

    public void addParkingLot(ArrayList<ParkingLot> parkingLots) {
        getParkingLots().add(parkingLot);
    }
    public void disParkingLot(ArrayList<ParkingLot> parkingLots) {
        getParkingLots().remove(parkingLot);
    }
}
