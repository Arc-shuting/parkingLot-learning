package org.parkingLot;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParkingLot {
    private final List<Park> parks;
    private int parkingLotId;
    private AtomicInteger Id = new AtomicInteger();
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


}