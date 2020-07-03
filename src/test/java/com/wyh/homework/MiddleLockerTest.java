package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLockerTest {

    @Test
    public void should_get_ticket_when_save_bag_given_middle_locker() {
        MiddleLocker middleLocker = new MiddleLocker();

        Ticket ticket = middleLocker.save(new Bag());

        assertNotNull(ticket);
    }
}