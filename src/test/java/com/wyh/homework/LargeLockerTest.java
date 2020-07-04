package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class LargeLockerTest {

    @Test
    public void should_get_ticket_when_save_bag_given_large_locker() {
        LargeLocker largeLocker = new LargeLocker(5);

        Ticket ticket = largeLocker.save(new Bag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_large_locker_and_ticket() {
        LargeLocker largeLocker = new LargeLocker(5);
        Bag exceptedBag = new Bag();

        Ticket ticket = largeLocker.save(exceptedBag);
        Bag actualBag = largeLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(exceptedBag,actualBag);
    }
}
