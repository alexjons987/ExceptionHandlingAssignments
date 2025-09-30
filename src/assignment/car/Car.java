package assignment.car;

import exceptions.SpeedLimitExceededException;

public class Car {
    final int SPEED_LIMIT = 300;
    int speed;

    public Car() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) throws SpeedLimitExceededException {
        if (speed > 300) {
            throw new SpeedLimitExceededException(String.format("Speed limit exceeded (%d > %d)", speed, this.SPEED_LIMIT));
        }
        this.speed = speed;
        System.out.printf("Speed set to %d km/h%n", speed);
    }
}
