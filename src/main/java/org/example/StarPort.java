package org.example;

public class StarPort {
    public String name = "unknown";
    private StarShip[] landingPads = new StarShip[10];

    private final byte LIFE_PODS = 100;
    private final byte STARSHIPS_MAX_CAPACITY = 2;

    private static byte countShips = 0;

    StarPort() {

    }

    StarPort(String name) {
        this.name = name;
    }

    public boolean isFull() {
        return countShips < STARSHIPS_MAX_CAPACITY ? false : true;
    }

    @Override
    public String toString() {
        return "Starport's name: " + name + "\nCount landed starships: " + countShips + "/" + STARSHIPS_MAX_CAPACITY;
    }

    public void printLandingPadsInfo() {
        if (countShips != 0) {
            for (int i = 0; i < STARSHIPS_MAX_CAPACITY; i++) {
                if (landingPads[i] != null) {
                    System.out.println("Landing pads #" + (i + 1) + ": \t" + landingPads[i]);
                } else {
                    System.out.println("Landing pads #" + (i + 1) + ": \tempty");
                }
            }

        } else {
            System.out.println("There are no starhips on the " + name + " starport!");
        }

    }

    public void landStarShip (StarShip starShip) {
        if (!isFull()) {
            for (int i = 0; i < 10; i++) {
                if (landingPads[i] == null) {
                    landingPads[i] = starShip;
                    countShips++;
                    break;
                }
            }
        } else {
            System.out.println("The starport is full and can't take one more starship. The " + starShip.getName() + " need to go away!");
        }

    }
}