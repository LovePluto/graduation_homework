package com.wyh.homework;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PrimaryLockerRobotTest {
    @Test
    public void should_get_ticket_when_save_bag_given_primary_locker_robot_and_middle_locker() {
        MiddleLocker middleLocker = new MiddleLocker(5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(asList(middleLocker));

        Ticket ticket = primaryLockerRobot.save(new Bag());

        assertNotNull(ticket);
    }
}