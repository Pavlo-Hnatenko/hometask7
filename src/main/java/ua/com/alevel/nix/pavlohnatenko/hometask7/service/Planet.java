package ua.com.alevel.nix.pavlohnatenko.hometask7.service;

import ua.com.alevel.nix.pavlohnatenko.hometask7.data.AbstractPlanet;

public interface Planet {
    double GRAVITATIONAL_CONSTANT = 6.67430e11;

    static double getGravityAcceleration(AbstractPlanet planet){
        return GRAVITATIONAL_CONSTANT * (planet.getmass() / Math.pow(planet.getradius(), 2));
    }

}
