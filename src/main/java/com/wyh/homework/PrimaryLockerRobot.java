package com.wyh.homework;

import java.util.List;

public class PrimaryLockerRobot {
    private List<MiddleLocker> middleLockers;

    public PrimaryLockerRobot(List<MiddleLocker> middleLockers) {
        this.middleLockers = middleLockers;
    }

    public Ticket save(Bag bag) {
        return middleLockers
                       .stream()
                       .filter(Locker::hasCapacity)
                       .findFirst()
                       .map(Locker -> Locker.save(bag))
                       .orElse(null);
    }

    public Bag pickUp(Ticket ticket) {
        return middleLockers.stream()
                       .filter(locker -> locker.hasValidTicket(ticket))
                       .findFirst()
                       .map(locker -> locker.pickUp(ticket))
                       .orElse(null);
    }
}
