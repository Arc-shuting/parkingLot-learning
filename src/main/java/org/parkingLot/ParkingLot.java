package org.parkingLot;

public class ParkingLot {
    private static int remainPark = 5;
    private static int parkNum = 5;
    private static String tickets = "ticket";

    public static String checkIN() {
        if(remainPark <= 0) {
            System.out.println("没有空车位");
        }
        remainPark = parkNum - 1;
        return tickets;
    }

    public void pickUp(String tickets) {
        if(remainPark >= 5) {
            System.out.println("无车可取");
            if (tickets != "ticket") {
                System.out.println("无效小票无法取车");
            }
        } else {
            remainPark = parkNum + 1;
        }
    }

    public static int getRemainPark(Object parkingLot) {
        return remainPark;
    }
}