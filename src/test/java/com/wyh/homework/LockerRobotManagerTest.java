package com.wyh.homework;

import org.junit.Test;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class LockerRobotManagerTest {
    @Test
    public void should_get_ticket_when_save_bag_give_locker_robot_manger() {
        Locker locker = new LargeLocker(5);
        MiddleLocker middleLocker = new MiddleLocker(5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(singletonList(middleLocker));
        LargeLocker largeLocker = new LargeLocker(5);
        SupperLockerRobot supperLockerRobot = new SupperLockerRobot(singletonList(largeLocker));
        LockerRobotManager lockerRobotManager = new LockerRobotManager(locker, primaryLockerRobot, supperLockerRobot);

        Ticket ticket = lockerRobotManager.save(new Bag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_bag_given_locker_robot_manager_and_ticker() {
        Locker locker = new LargeLocker(5);
        MiddleLocker middleLocker = new MiddleLocker(5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(singletonList(middleLocker));
        LargeLocker largeLocker = new LargeLocker(5);
        SupperLockerRobot supperLockerRobot = new SupperLockerRobot(singletonList(largeLocker));
        LockerRobotManager lockerRobotManager = new LockerRobotManager(locker, primaryLockerRobot, supperLockerRobot);
        Bag expectedBag = new Bag();

        Ticket ticket = lockerRobotManager.save(expectedBag);

        assertSame(expectedBag,lockerRobotManager.pickUp(ticket));
    }
}