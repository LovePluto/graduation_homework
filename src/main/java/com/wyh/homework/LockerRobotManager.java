package com.wyh.homework;

public class LockerRobotManager {
    private Locker smallLocker;
    private PrimaryLockerRobot primaryLockerRobot;
    private SupperLockerRobot supperLockerRobot;

    public LockerRobotManager(SmallLocker smallLocker,
                              PrimaryLockerRobot primaryLockerRobot,
                              SupperLockerRobot supperLockerRobot) {
        this.smallLocker = smallLocker;
        this.primaryLockerRobot = primaryLockerRobot;
        this.supperLockerRobot = supperLockerRobot;
    }

    public Ticket save(Bag bag) {
        Ticket ticket = smallLocker.save(bag);
        if (ticket != null) {
            return ticket;
        }
        ticket = primaryLockerRobot.save(bag);
        if (ticket != null) {
            return ticket;
        }
        ticket = supperLockerRobot.save(bag);
        if (ticket != null) {
            return ticket;
        }
        return null;
    }

    public Bag pickUp(Ticket ticket) {
        Bag bag = smallLocker.pickUp(ticket);
        if (bag != null) {
            return bag;
        }
        bag = primaryLockerRobot.pickUp(ticket);
        if (bag != null) {
            return bag;
        }
        bag = supperLockerRobot.pickUp(ticket);
        if (bag != null) {
            return bag;
        }
        return null;
    }
}
