package com.wyh.homework;

public class LargeLocker extends Locker {
    public LargeLocker(int capacity) {
        super(capacity);
    }

    public double getVacancyRate() {
        return  (double) getAvailableCapacity() / getCapacity();
    }
}
