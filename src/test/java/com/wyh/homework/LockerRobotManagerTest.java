package com.wyh.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class LockerRobotManagerTest extends BaseTest {
    @Test
    public void should_get_ticket_when_save_bag_give_locker_robot_manger() {
        LockerRobotManager lockerRobotManager = generateLockerRobotManager(2, 5);

        Ticket ticket = lockerRobotManager.save(new SmallBag());

        assertNotNull(ticket);
    }

    @Test
    public void should_get_bag_when_pick_up_bag_given_locker_robot_manager_and_ticker() {
        LockerRobotManager lockerRobotManager = generateLockerRobotManager(2, 5);
        Bag expectedBag = new SmallBag();

        Ticket ticket = lockerRobotManager.save(expectedBag);

        assertSame(expectedBag, lockerRobotManager.pickUp(ticket));
    }

    @Test(expected = LockerIsFullException.class)
    public void should_throw_locker_is_full_exception_when_save_bag_given_locker_is_full() {
        LockerRobotManager lockerRobotManager = generateLockerRobotManager(1, 1);

        lockerRobotManager.save(new LargeBag());
        lockerRobotManager.save(new LargeBag());
        lockerRobotManager.save(new LargeBag());
        lockerRobotManager.save(new LargeBag());
    }
}