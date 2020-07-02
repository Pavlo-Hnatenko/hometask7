package ua.com.alevel.nix.pavlohnatenko.hometask7;

import ua.com.alevel.nix.pavlohnatenko.hometask7.data.*;
import ua.com.alevel.nix.pavlohnatenko.hometask7.service.PlanetReporter;

public class Main {

    public static void main(String[] args) {

        AbstractPlanet mercury = Mercury.getInstance();
        PlanetReporter.printGravityAcceleration(mercury);
        AbstractPlanet venus = Venus.getInstance();
        PlanetReporter.printGravityAcceleration(venus);
        AbstractPlanet earth = Earth.getInstance();
        PlanetReporter.printGravityAcceleration(earth);
        AbstractPlanet mars = Mars.getInstance();
        PlanetReporter.printGravityAcceleration(mars);
        AbstractPlanet jupiter = Jupiter.getInstance();
        PlanetReporter.printGravityAcceleration(jupiter);
        AbstractPlanet saturn = Saturn.getInstance();
        PlanetReporter.printGravityAcceleration(saturn);
        AbstractPlanet uranus = Uranus.getInstance();
        PlanetReporter.printGravityAcceleration(uranus);
        AbstractPlanet neptune = Neptune.getInstance();
        PlanetReporter.printGravityAcceleration(neptune);

    }
}
