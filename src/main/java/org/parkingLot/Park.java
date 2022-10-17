package org.parkingLot;

public class Park {
    Boolean states = false;

    public void checkIn() {
        new Park().states = true;
    }

    public void pickUp() {
        new Park().states = false;
    }
}
