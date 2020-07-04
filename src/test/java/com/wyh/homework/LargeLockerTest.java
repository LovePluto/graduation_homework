package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LargeLockerTest {

    @Test
    public void should_get_ticket_when_save_bag_given_large_locker() {
        LargeLocker largeLocker = new LargeLocker(5);

        Ticket ticket = largeLocker.save(new Bag());

        assertNotNull(ticket);
    }
}
