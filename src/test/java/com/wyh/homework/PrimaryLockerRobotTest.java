package com.wyh.homework;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

public class PrimaryLockerRobotTest {

    @Test
    public void should_get_ticket_when_save_bag_given_primary_locker_robot_and_middle_locker() {
        MiddleLocker middleLocker = new MiddleLocker(5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(singletonList(middleLocker));

        Ticket ticket = primaryLockerRobot.save(new Bag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_given_primary_locker_robot_and_ticket() {
        MiddleLocker middleLocker = new MiddleLocker(5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(singletonList(middleLocker));
        Bag expectedBag = new Bag();

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
        Bag expectedBag = new Bag();

        primaryLockerRobot.save(new Bag());
        Ticket ticket = primaryLockerRobot.save(expectedBag);
        Bag actualBag = middleLocker2.pickUp(ticket);

        assertNotNull(ticket);
        assertSame(expectedBag, actualBag);
    }
}