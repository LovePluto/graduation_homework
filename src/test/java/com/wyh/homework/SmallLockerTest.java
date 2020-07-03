package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SmallLockerTest {

    @Test
    public void should_get_ticket_when_save_bag_given_small_locker() {
        SmallLocker smallLocker = new SmallLocker();

        Ticket ticket = smallLocker.save(new Bag());

        assertNotNull(ticket);
    }
}
