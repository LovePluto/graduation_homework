package com.wyh.homework;

public class SmallLocker extends Locker<SmallTicket> {

    public SmallLocker(int capacity) {
        super(capacity);
    }

    public Ticket save(SmallBag bag) {
        return super.save(bag, SmallTicket.class);
    }

    public Bag pickUp(Ticket ticket) {
        if (!(ticket instanceof SmallTicket)) {
            throw new TicketTypeException();
        }
        return super.pickUp((SmallTicket) ticket);
    }
}
