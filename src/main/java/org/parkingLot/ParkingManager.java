
package org.parkingLot;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingManager{
    private List<ParkingBoy> parkingBoys;
    private List<ParkingLot> parkingLots;

    public ParkingManager(List<ParkingBoy> parkingBoys, List<ParkingLot> parkingLots) {
        this.parkingBoys = parkingBoys;
        this.parkingLots = parkingLots;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public List<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void setParkingBoys(List<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public String addParkingLot(List<Park> parks, String id) {
        parkingLots.add(new ParkingLot(parks, id));
        return "Success";
    }
    public String deleteParkingLot(String id) {
        parkingLots = parkingLots.stream()
                .filter(item -> item.getParkingLotId().equals(id))
                .collect(Collectors.toList());
        return "Success";
    }

    public String addParkingBoy(List<ParkingLot> parkingLots, String id) {
        parkingBoys.add(new ParkingBoy(parkingLots, id));
        return "Success";
    }
    public String deleteParkingBoy(String id) {
        parkingBoys = parkingBoys.stream()
                .filter(item -> item.getParkingBoyId().equals(id))
                .collect(Collectors.toList());
        return "Success";
    }

    public String parkingManager(String id, String carNum) throws Exception {
        return this.parkingLots.stream().filter(item -> !item.getParkingLotId().equals(id))
                .findFirst()
                .orElseThrow(Exception::new)
                .checkIN(carNum);
    }

    public String pickUpManager(String id, Tickets tickets) throws Exception {
        return this.parkingBoys.stream()
                .filter(item -> !item.getParkingBoyId().equals(id))
                .findFirst()
                .orElseThrow(Exception::new)
                .pickUpBoy(id, tickets);
    }
}
