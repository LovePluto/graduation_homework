package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class LargeLockerTest extends BaseTest{

    @Test
    public void should_get_ticket_when_save_bag_given_large_locker() {
        LargeLocker largeLocker = generateLargeLocker(5);

        Ticket ticket = largeLocker.save(new LargeBag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_large_locker_and_ticket() {
        LargeLocker largeLocker = generateLargeLocker(5);
        LargeBag expectedBag = new LargeBag();

        Ticket ticket = largeLocker.save(expectedBag);
        Bag actualBag = largeLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag,actualBag);
    }

    @Test(expected = TicketTypeException.class)
    public void should_throw_ticket_type_exception_when_pick_up_bag_given_error_type_ticket() {
        LargeLocker largeLocker = generateLargeLocker(5);

        largeLocker.pickUp(new SmallTicket());
    }

    @Test(expected = LockerIsFullException.class)
    public void should_throw_locker_is_full_exception_when_save_bag_given_locker_is_full() {
        LargeLocker largeLocker = generateLargeLocker(1);
        largeLocker.save(new LargeBag());
        largeLocker.save(new LargeBag());
    }

    @Test(expected = TicketInvalidException.class)
    public void should_throw_ticket_is_invalid_exception_when_pick_up_bag_given_ticket_is_invalid() {
        LargeLocker largeLocker = generateLargeLocker(1);

        largeLocker.pickUp(new LargeTicket());
    }
}
