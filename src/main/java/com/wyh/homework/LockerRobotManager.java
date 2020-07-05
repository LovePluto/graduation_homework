package com.wyh.homework;

public class LockerRobotManager {
    private SmallLocker smallLocker;
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
        if (bag instanceof SmallBag) {
            return smallLocker.save((SmallBag) bag);
        }
        if (bag instanceof MiddleBag) {
            return primaryLockerRobot.save((MiddleBag) bag);
        }
        if (bag instanceof LargeBag) {
            return supperLockerRobot.save((LargeBag) bag);
        }
        return null;
    }

    public Bag pickUp(Ticket ticket) {
        if (ticket instanceof SmallTicket) {
            return smallLocker.pickUp(ticket);
        }
        if (ticket instanceof MiddleTicket) {
            return primaryLockerRobot.pickUp(ticket);
        }
        if (ticket instanceof LargeTicket) {
            return supperLockerRobot.pickUp(ticket);
        }
        return null;
    }
}
