package com.wyh.homework;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    protected SmallLocker generateSmallLocker(int capacity) {
        return new SmallLocker(capacity);
    }

    protected MiddleLocker generateMiddleLocker(int capacity) {
        return new MiddleLocker(capacity);
    }

    protected LargeLocker generateLargeLocker(int capacity) {
        return new LargeLocker(capacity);
    }

    protected PrimaryLockerRobot generatePrimaryLockerRobot(int lockerNumbers, int lockerCapacity) {
        List<MiddleLocker> middleLockers = new ArrayList<>();
        for (int i = 0; i < lockerNumbers; i++) {
            MiddleLocker middleLocker = new MiddleLocker(lockerCapacity);
            middleLockers.add(middleLocker);
        }
        return new PrimaryLockerRobot(middleLockers);
    }

    protected SupperLockerRobot generateSupperLockerRobot(int lockerNumbers, int lockerCapacity) {
        List<LargeLocker> largeLockers = new ArrayList<>();
        for (int i = 0; i < lockerNumbers; i++) {
            LargeLocker largeLocker = new LargeLocker(lockerCapacity);
            largeLockers.add(largeLocker);
        }
        return new SupperLockerRobot(largeLockers);
    }

    protected LockerRobotManager generateLockerRobotManager(int lockerNumbers, int lockerCapacity) {
        SmallLocker smallLocker = generateSmallLocker(lockerCapacity);
        PrimaryLockerRobot primaryLockerRobot = generatePrimaryLockerRobot(lockerNumbers, lockerCapacity);
        SupperLockerRobot supperLockerRobot = generateSupperLockerRobot(lockerNumbers, lockerCapacity);
        return new LockerRobotManager(smallLocker, primaryLockerRobot, supperLockerRobot);
    }
}
