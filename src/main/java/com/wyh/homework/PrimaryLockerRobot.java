package com.wyh.homework;

import java.util.List;

public class PrimaryLockerRobot {
    private List<MiddleLocker> middleLockers;

    public PrimaryLockerRobot(List<MiddleLocker> middleLockers) {
        this.middleLockers = middleLockers;
    }

    public Ticket save(Bag bag) {
        return middleLockers.get(0).save(bag);
    }
}
