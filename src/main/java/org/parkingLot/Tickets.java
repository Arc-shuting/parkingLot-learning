package org.parkingLot;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tickets {
    private String time;
    private Park park;
    private final String carNum;

    public Tickets(String carNum) {
        this.carNum = carNum;
    }

    public Park getPark() {
        return park;
    }

    public String getCarNum() {
        return carNum;
    }

    public String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("year/MM/dd HH:mm:ss");
        LocalDateTime nowTime = LocalDateTime.now();
        return dtf.format(nowTime);
    }

}
