package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class SmallLockerTest extends BaseTest {

    @Test
    public void should_get_ticket_when_save_bag_given_small_locker() {
        SmallLocker smallLocker = generateSmallLocker(5);

        Ticket ticket = smallLocker.save(new Bag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_small_locker_and_ticket() {
        SmallLocker smallLocker = generateSmallLocker(5);
        Bag expectedBag = new Bag();

        Ticket ticket = smallLocker.save(expectedBag);
        Bag actualBag = smallLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag,actualBag);
    }
}
