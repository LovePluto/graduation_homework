package com.wyh.homework;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SupperLockerRobotTest {

    @Test
    public void should_get_ticket_when_save_bag_given_supper_locker_robot_and_large_locker() {
        LargeLocker largeLocker1 = new LargeLocker(5);
        LargeLocker largeLocker2 = new LargeLocker(5);
        SupperLockerRobot supperLockerRobot = new SupperLockerRobot(asList(largeLocker1, largeLocker2));
        largeLocker1.save(new Bag());
        Bag exceptedBag = new Bag();

        Ticket ticket = supperLockerRobot.save(exceptedBag);

        assertNotNull(ticket);
        assertSame(exceptedBag, largeLocker2.pickUp(ticket));
    }


}