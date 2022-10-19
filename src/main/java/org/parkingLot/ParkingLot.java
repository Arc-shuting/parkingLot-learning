package org.parkingLot;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParkingLot {
    private final List<Park> parks;
    private int parkingLotId;
    private int remainNum;

    public int getRemainParks() {
        remainNum = this.parks.stream()
                .map(Park::getStates)
                .filter(states -> !states)
                .toList()
                .size();
        return remainNum;
    }

    private final AtomicInteger Id = new AtomicInteger();
    private final static String TICKET = "ticket";

    public ParkingLot(List<Park> parks) {
        this.parks = parks;
        this.parkingLotId = Id.incrementAndGet() ;
    }

    public String checkIN() throws Exception {
        Stream<Boolean> remainParks = this.parks.stream()
                .map(Park::getStates)
                .filter(states -> states == false);
      if (remainParks != null) {
          this.parks.stream()
                  .filter(Park::getStates)
                  .findFirst()
                  .orElseThrow(Exception::new)
                  .setStates(true);
          return TICKET;
      }
      return "Failed";
    }

    public String pickUp() throws Exception {
        Stream<Boolean> usedParks =this.parks.stream()
                .map(Park::getStates)
                .filter(states -> states == true);
        if(usedParks != null) {
            this.parks.stream()
                    .filter(Park::getStates)
                    .findFirst()
                    .orElseThrow(Exception::new)
                    .setStates(false);
        }
        return "Failed";
    }


}