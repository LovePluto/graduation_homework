package com.wyh.homework;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SupperLockerRobotTest extends BaseTest {

    @Test
    public void should_get_ticket_when_save_bag_given_supper_locker_robot_and_large_locker() {
        LargeLocker largeLocker1 = new LargeLocker(5);
        LargeLocker largeLocker2 = new LargeLocker(5);
        SupperLockerRobot supperLockerRobot = new SupperLockerRobot(asList(largeLocker1, largeLocker2));
        largeLocker1.save(new LargeBag());
        LargeBag expectedBag = new LargeBag();

        Ticket ticket = supperLockerRobot.save(expectedBag);

        assertNotNull(ticket);
        assertSame(expectedBag, largeLocker2.pickUp(ticket));
    }

    @Test
    public void should_get_bag_when_pick_up_bag_given_supper_locker_robot_and_ticket() {
        SupperLockerRobot supperLockerRobot = generateSupperLockerRobot(2, 5);
        LargeBag expectedBag = new LargeBag();

        Ticket ticket = supperLockerRobot.save(expectedBag);

        assertSame(expectedBag, supperLockerRobot.pickUp(ticket));
    }

    @Test(expected = TicketTypeException.class)
    public void should_throw_ticket_type_exception_when_pick_up_bag_given_error_type_ticket() {
        SupperLockerRobot supperLockerRobot = generateSupperLockerRobot(1, 1);

        supperLockerRobot.pickUp(new SmallTicket());
    }

    @Test(expected = LockerIsFullException.class)
    public void should_throw_locker_is_full_exception_when_save_bag_given_locker_is_full() {
        SupperLockerRobot supperLockerRobot = generateSupperLockerRobot(1, 1);

        supperLockerRobot.save(new LargeBag());
        supperLockerRobot.save(new LargeBag());
    }

    @Test(expected = TicketInvalidException.class)
    public void should_throw_ticket_is_invalid_exception_when_pick_up_bag_given_ticket_is_invalid() {
        SupperLockerRobot supperLockerRobot = generateSupperLockerRobot(1, 1);

        supperLockerRobot.pickUp(new LargeTicket());
    }
}