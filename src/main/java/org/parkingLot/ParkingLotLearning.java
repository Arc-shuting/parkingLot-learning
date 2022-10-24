package org.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotLearning {
    public static void main(String[] args) throws Exception {
        Park park1 = new Park();
        Park park2 = new Park();
        ParkingLot P1= new ParkingLot(new ArrayList<>(), 1);
        P1.getParks().add(park1);
        P1.getParks().add(park2);
        //System.out.println(P1.getParks().get(1).getStates());
        System.out.println(P1.checkIN());
       /*System.out.println(park1.getStates())
*/
    }
}
