package com.wyh.homework;

public class LargeLocker extends Locker<LargeTicket> {
    public LargeLocker(int capacity) {
        super(capacity);
    }

    public double getVacancyRate() {
        return (double) getAvailableCapacity() / getCapacity();
    }

    public Ticket save(LargeBag bag) {
        return super.save(bag, LargeTicket.class);
    }

    public Bag pickUp(Ticket ticket) {
        if (!(ticket instanceof LargeTicket)) {
            throw new TicketTypeException();
        }
        return super.pickUp((LargeTicket) ticket);
    }
}
