package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class LargeLockerTest extends BaseTest{

    @Test
    public void should_get_ticket_when_save_bag_given_large_locker() {
        LargeLocker largeLocker = generateLargeLocker(5);

        Ticket ticket = largeLocker.save(new Bag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_large_locker_and_ticket() {
        LargeLocker largeLocker = generateLargeLocker(5);
        Bag expectedBag = new Bag();

        Ticket ticket = largeLocker.save(expectedBag);
        Bag actualBag = largeLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag,actualBag);
    }
}
