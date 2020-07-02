package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

import ua.com.alevel.nix.pavlohnatenko.hometask7.service.Planet;

public abstract class AbstractPlanet implements Planet {

    protected String planetName;
    protected double mass;
    protected double radius;

    protected AbstractPlanet(String planetName, double mass, double radius) {
        this.planetName = planetName;
        this.mass = mass;
        this.radius = radius;
    }

    public String getplanetName() {
        return planetName;
    }

    public double getmass() {
        return mass;
    }

    public double getradius() {
        return radius;
    }

}
