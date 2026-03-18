// the main purpose of abstraction is hiding the implementation and showing only the essential functionality.

package OOPS.Abstraction;

abstract class Abstraction {
    abstract void turnOn();
    abstract void turnOff();
}

class TvRemote extends Abstraction {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class Main {
    public static void main(String[] args) {
        Abstraction remote = new TvRemote();
        remote.turnOn();
        remote.turnOff();
    }
}