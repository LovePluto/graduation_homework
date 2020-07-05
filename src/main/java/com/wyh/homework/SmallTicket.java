package com.wyh.homework;

public class SmallTicket extends Ticket {

    private Ticket ticket;

    public SmallTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
