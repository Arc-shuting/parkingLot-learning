package ParkingLot;

import org.junit.Before;
import org.junit.Test;
import org.parkingLot.Park;
import org.parkingLot.ParkingBoy;
import org.parkingLot.ParkingLot;
import org.parkingLot.ParkingManager;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {

        @Before
        public void setUp() {
            Park park1 = new Park();
            Park park2 = new Park();
            Park park3 = new Park();
            Park park4 = new Park();
            ParkingLot P1= new ParkingLot(new ArrayList<>(), "1");
            ParkingLot P2= new ParkingLot(new ArrayList<>(), "2");
            ParkingBoy B1 = new ParkingBoy(new ArrayList<>(), "1");
            ParkingBoy B2 = new ParkingBoy(new ArrayList<>(), "2");
            ParkingManager M1 = new ParkingManager(new ArrayList<>(), new ArrayList<>());
            P1.getParks().add(park1);
            P1.getParks().add(park2);
            P2.getParks().add(park3);
            P2.getParks().add(park4);
            B1.getParkingLots().add(P1);
            B1.getParkingLots().add(P2);
            M1.getParkingBoys().add(B1);
        }

        @Test
        public void shouldBuildParksStates() {
            Park park1 = new Park();
            Boolean Truth = park1.getStates();
            assertEquals(false, Truth);
        }
    }