package org.example;

public class StarShip {
    private String name;
    private int crew;

    @Override
    public String toString() {
        return "Starship: \"" + name + "\". Crew: " + crew;
    }

    StarShip() {
        this.name = "unnamed";
        this.crew = 0;
    }

    StarShip(String name, int crew) {
        this.name = name;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

}