package com.wyh.homework;

public class SmallLocker extends Locker {

    public SmallLocker(int capacity) {
        super(capacity);
    }

    @Override
    public Ticket save(Bag bag) {
        Ticket ticket = super.save(bag);
        if (ticket != null) {
            return new SmallTicket(ticket);
        }
        return null;
    }

    @Override
    public Bag pickUp(Ticket ticket) {
        if (!(ticket instanceof SmallTicket)) {
            throw new TicketTypeException();
        }
        return super.pickUp(((SmallTicket) ticket).getTicket());
    }
}
