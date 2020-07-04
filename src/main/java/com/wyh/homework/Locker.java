package com.wyh.homework;

import java.util.HashMap;
import java.util.Map;

public abstract class Locker {

    private int capacity;
    private int availableCapacity;

    public Locker(int capacity) {
        this.capacity = capacity;
        this.availableCapacity = capacity;
    }

    private Map<Ticket, Bag> map = new HashMap<>();

    public Ticket save(Bag bag) {
        if (!this.hasCapacity()) {
            return null;
        }
        Ticket ticket = new Ticket();
        map.put(ticket, bag);
        availableCapacity--;
        return ticket;
    }

    public Bag pickUp(Ticket ticket) {
        Bag bag = map.get(ticket);
        if (bag != null) {
            availableCapacity++;
            return bag;
        }
        return null;
    }

    public boolean hasCapacity() {
        return availableCapacity > 0;
    }

    public boolean hasValidTicket(Ticket ticket) {
        return map.containsKey(ticket);
    }
}
