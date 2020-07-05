package com.wyh.homework;

import java.util.List;

public class PrimaryLockerRobot extends LockerRobot {

    public PrimaryLockerRobot(List<MiddleLocker> lockers) {
        super(lockers);
    }

    public Ticket save(Bag bag) {
        return getLockers()
                       .stream()
                       .filter(Locker::hasCapacity)
                       .findFirst()
                       .map(Locker -> Locker.save(bag))
                       .orElse(null);
    }
}
