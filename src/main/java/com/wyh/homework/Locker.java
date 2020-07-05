package com.wyh.homework;

import java.util.HashMap;
import java.util.Map;

public abstract class Locker<T> {

    private int capacity;
    private int availableCapacity;

    public Locker(int capacity) {
        this.capacity = capacity;
        this.availableCapacity = capacity;
    }

    private Map<T, Bag> map = new HashMap<>();

    public T save(Bag bag, Class<T> ticketType) {
        if (!this.hasCapacity()) {
            throw new LockerIsFullException();
        }
        T ticket = null;
        try {
            ticket = ticketType.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put(ticket, bag);
        availableCapacity--;
        return ticket;
    }

    public Bag pickUp(T ticket) {
        if (!map.containsKey(ticket)) {
            throw new TicketInvalidException();
        }
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

    public boolean hasValidTicket(T ticket) {
        return map.containsKey(ticket);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }
}
