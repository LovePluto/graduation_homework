package com.wyh.homework;

import java.util.List;

public class LockerRobot {

    private List<? extends Locker> lockers;

    public LockerRobot(List<? extends Locker> lockers) {
        this.lockers = lockers;
    }

    public Bag pickUp(Ticket ticket) {
        return lockers.stream()
                       .filter(locker -> locker.hasValidTicket(ticket))
                       .findFirst()
                       .map(locker -> locker.pickUp(ticket))
                       .orElseThrow(TicketInvalidException::new);
    }

    public List<? extends Locker> getLockers() {
        return lockers;
    }
}
