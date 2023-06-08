package org.example;

//Ctrl+D Ctrl+X

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Main {

    public static void main(String[] args) {

        StarPort angel = new StarPort("Angel");
        //System.out.println(angel);

        StarShip voyager = new StarShip("Voyager", 3);
        angel.landStarShip(voyager);

        StarShip rosinante = new StarShip("Rosinante", 5);
        angel.landStarShip(rosinante);

        StarShip rufie = new StarShip("Rufie", 1);
        angel.landStarShip(rufie);

        System.out.println(angel);
        angel.printLandingPadsInfo();

    }

}














/*


package org.example;

public class StarPort {
    public String name = "unknown";
    private StarShip[] landingPads = new StarShip[10];

    private final byte LIFE_PODS = 100;
    private final byte STARSHIPS_MAX_CAPACITY = 10;

    private static byte countShips = 0;

    public boolean isFull() {
        return countShips < 10 ? false : true;
    }

    @Override
    public String toString() {
        return "Starport's name: " + name + "\nCount landed starships: " + countShips + "/" + STARSHIPS_MAX_CAPACITY;
    }

    public boolean landStarShip (StarShip starShip) {
        if (!isFull()) {
            for (int i = 0; i < 10; i++) {
                if (landingPads[i] == null) {
                    landingPads[i] = starShip;
                    countShips++;
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
 */