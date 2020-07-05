package com.wyh.homework;

public class MiddleLocker extends Locker<MiddleTicket> {

    public MiddleLocker(int capacity) {
        super(capacity);
    }

    public Ticket save(MiddleBag bag) {
        return super.save(bag, MiddleTicket.class);
    }

    public Bag pickUp(Ticket ticket) {
        if (!(ticket instanceof MiddleTicket)) {
            throw new TicketTypeException();
        }
        return super.pickUp((MiddleTicket) ticket);
    }
}
