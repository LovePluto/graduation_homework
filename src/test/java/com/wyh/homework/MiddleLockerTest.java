package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLockerTest {

    @Test
    public void should_get_ticket_when_save_bag_given_middle_locker() {
        MiddleLocker middleLocker = new MiddleLocker(5);

        Ticket ticket = middleLocker.save(new Bag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_middle_locker_and_ticket() {
        MiddleLocker middleLocker = new MiddleLocker(5);
        Bag expectedBag = new Bag();

        Ticket ticket = middleLocker.save(expectedBag);
        Bag actualBag = middleLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag,actualBag);
    }
}