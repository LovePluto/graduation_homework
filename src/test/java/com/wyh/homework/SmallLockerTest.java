package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class SmallLockerTest extends BaseTest {

    @Test
    public void should_get_ticket_when_save_bag_given_small_locker() {
        SmallLocker smallLocker = generateSmallLocker(5);

        Ticket ticket = smallLocker.save(new SmallBag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_small_locker_and_ticket() {
        SmallLocker smallLocker = generateSmallLocker(5);
        SmallBag expectedBag = new SmallBag();

        Ticket ticket = smallLocker.save(expectedBag);
        Bag actualBag = smallLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag, actualBag);
    }

    @Test(expected = TicketTypeException.class)
    public void should_throw_ticket_type_exception_when_pick_up_bag_given_small_locker_and_error_type_ticket() {
        SmallLocker smallLocker = generateSmallLocker(5);

        smallLocker.pickUp(new Ticket());
    }

    @Test(expected = LockerIsFullException.class)
    public void should_throw_locker_is_full_exception_when_save_bag_given_locker_is_full() {
        SmallLocker smallLocker = generateSmallLocker(1);
        smallLocker.save(new SmallBag());
        smallLocker.save(new SmallBag());
    }

    @Test(expected = TicketInvalidException.class)
    public void should_throw_ticket_is_invalid_exception_when_pick_up_bag_given_ticket_is_invalid() {
        SmallLocker smallLocker = generateSmallLocker(1);

        smallLocker.pickUp(new SmallTicket());
    }
}
