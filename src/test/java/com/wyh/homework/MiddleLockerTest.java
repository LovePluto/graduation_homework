package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLockerTest extends BaseTest{

    @Test
    public void should_get_ticket_when_save_bag_given_middle_locker() {
        MiddleLocker middleLocker = generateMiddleLocker(5);

        Ticket ticket = middleLocker.save(new MiddleBag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_middle_locker_and_ticket() {
        MiddleLocker middleLocker = generateMiddleLocker(5);
        MiddleBag expectedBag = new MiddleBag();

        Ticket ticket = middleLocker.save(expectedBag);
        Bag actualBag = middleLocker.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag,actualBag);
    }

    @Test(expected = TicketTypeException.class)
    public void should_throw_ticket_type_exception_when_pick_up_bag_given_middle_locker_and_error_type_ticket() {
        MiddleLocker middleLocker = generateMiddleLocker(5);

        middleLocker.pickUp(new Ticket());
    }

}