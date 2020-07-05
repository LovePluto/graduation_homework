package com.wyh.homework;

import java.util.List;

public class PrimaryLockerRobot extends LockerRobot {

    public PrimaryLockerRobot(List<MiddleLocker> lockers) {
        super(lockers);
    }

    @Override
    public Bag pickUp(Ticket ticket) {
        if (!(ticket instanceof MiddleTicket)) {
            throw new TicketTypeException();
        }
        return super.pickUp(ticket);
    }

    public Ticket save(MiddleBag bag) {
        return getLockers().stream()
                       .filter(Locker::hasCapacity)
                       .findFirst()
                       .map(smallLocket -> (Ticket) smallLocket.save(bag, MiddleTicket.class))
                       .orElseThrow(LockerIsFullException::new);
    }
}
