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
        largeLocker1.save(new Bag());
        Bag expectedBag = new Bag();

        Ticket ticket = supperLockerRobot.save(expectedBag);

        assertNotNull(ticket);
        assertSame(expectedBag, largeLocker2.pickUp(ticket));
    }

    @Test
    public void should_get_bag_when_pick_up_bag_given_supper_locker_robot_and_ticket() {
        SupperLockerRobot supperLockerRobot = generateSupperLockerRobot(2, 5);
        Bag expectedBag = new Bag();

        Ticket ticket = supperLockerRobot.save(expectedBag);

        assertSame(expectedBag, supperLockerRobot.pickUp(ticket));
    }
}