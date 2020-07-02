package ua.com.alevel.nix.pavlohnatenko.hometask7.service;

import ua.com.alevel.nix.pavlohnatenko.hometask7.data.AbstractPlanet;

public class PlanetReporter {

    public static void printGravityAcceleration(AbstractPlanet planet){
        System.out.println("Acceleration on this planet (" + planet.getplanetName() + ") is equals to " +
                Planet.getGravityAcceleration(planet));
    }

}
