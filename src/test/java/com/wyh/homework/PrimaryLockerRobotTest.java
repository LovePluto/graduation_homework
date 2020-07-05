package com.wyh.homework;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

public class PrimaryLockerRobotTest extends BaseTest {

    @Test
    public void should_get_ticket_when_save_bag_given_primary_locker_robot_and_middle_locker() {
        PrimaryLockerRobot primaryLockerRobot = generatePrimaryLockerRobot(2, 5);

        Ticket ticket = primaryLockerRobot.save(new MiddleBag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_primary_locker_robot_and_ticket() {
        PrimaryLockerRobot primaryLockerRobot = generatePrimaryLockerRobot(2, 5);
        MiddleBag expectedBag = new MiddleBag();

        Ticket ticket = primaryLockerRobot.save(expectedBag);
        Bag actualBag = primaryLockerRobot.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag, actualBag);
    }

    @Test
    public void should_get_ticket_and_save_2nd_locker_when_save_bag_given_1st_locker_fulled_and_2nd_locker_free() {
        MiddleLocker middleLocker1 = new MiddleLocker(1);
        MiddleLocker middleLocker2 = new MiddleLocker(5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(asList(middleLocker1, middleLocker2));
        MiddleBag expectedBag = new MiddleBag();

        primaryLockerRobot.save(new MiddleBag());
        Ticket ticket = primaryLockerRobot.save(expectedBag);
        Bag actualBag = middleLocker2.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag, actualBag);
    }

    @Test(expected = TicketTypeException.class)
    public void should_throw_ticket_type_exception_when_pick_up_bag_given_error_type_ticket() {
        PrimaryLockerRobot primaryLockerRobot = generatePrimaryLockerRobot(1, 1);

        primaryLockerRobot.pickUp(new SmallTicket());
    }

    @Test(expected = LockerIsFullException.class)
    public void should_throw_locker_is_full_exception_when_save_bag_given_locker_is_full() {
        PrimaryLockerRobot primaryLockerRobot = generatePrimaryLockerRobot(1, 1);

        primaryLockerRobot.save(new MiddleBag());
        primaryLockerRobot.save(new MiddleBag());
    }

    @Test(expected = TicketInvalidException.class)
    public void should_throw_ticket_is_invalid_exception_when_pick_up_bag_given_ticket_is_invalid() {
        PrimaryLockerRobot primaryLockerRobot = generatePrimaryLockerRobot(1, 1);

        primaryLockerRobot.pickUp(new MiddleTicket());
    }
}