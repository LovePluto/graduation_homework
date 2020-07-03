package com.wyh.homework;

import java.util.HashMap;
import java.util.Map;

public class MiddleLocker {

    private Map<Ticket, Bag> map = new HashMap<>();

    public Ticket save(Bag bag) {
        Ticket ticket = new Ticket();
        map.put(ticket, bag);
        return ticket;
    }

    public Bag pickUp(Ticket ticket) {
        return map.get(ticket);
    }
}
