package com.wyh.homework;

import java.util.List;

public class SupperLockerRobot {
    private List<LargeLocker> largeLockers;

    public SupperLockerRobot(List<LargeLocker> largeLockers) {
        this.largeLockers = largeLockers;

    }

    public Ticket save(Bag bag) {
        LargeLocker savedLocker = null;
        double vacancyRate = 0.00;
        for (LargeLocker locker : largeLockers) {
            if (locker.hasCapacity() && locker.getVacancyRate() > vacancyRate) {
                savedLocker = locker;
                vacancyRate = locker.getVacancyRate();
            }
        }
        if (savedLocker != null) {
            return savedLocker.save(bag);
        }
        return null;
    }
}
