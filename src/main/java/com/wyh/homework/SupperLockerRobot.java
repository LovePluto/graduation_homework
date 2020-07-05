package com.wyh.homework;

import java.util.List;

public class SupperLockerRobot extends LockerRobot {
    public SupperLockerRobot(List<LargeLocker> lockers) {
        super(lockers);
    }

    public Ticket save(LargeBag bag) {
        LargeLocker savedLocker = null;
        double vacancyRate = 0.00;
        for (LargeLocker locker : (List<LargeLocker>) getLockers()) {
            if (locker.hasCapacity() && locker.getVacancyRate() > vacancyRate) {
                savedLocker = locker;
                vacancyRate = locker.getVacancyRate();
            }
        }
        if (savedLocker == null) {
            throw new LockerIsFullException();
        }
        return savedLocker.save(bag, LargeTicket.class);

    }
}
