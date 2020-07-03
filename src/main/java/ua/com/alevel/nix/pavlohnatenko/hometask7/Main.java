package ua.com.alevel.nix.pavlohnatenko.hometask7;

import ua.com.alevel.nix.pavlohnatenko.hometask7.data.*;
import ua.com.alevel.nix.pavlohnatenko.hometask7.service.PlanetReporter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<AbstractPlanet> solarSystem = new ArrayList<>();
        solarSystem.add(Mercury.getInstance());
        solarSystem.add(Venus.getInstance());
        solarSystem.add(Earth.getInstance());
        solarSystem.add(Mars.getInstance());
        solarSystem.add(Jupiter.getInstance());
        solarSystem.add(Saturn.getInstance());
        solarSystem.add(Uranus.getInstance());
        solarSystem.add(Neptune.getInstance());

        for (AbstractPlanet planet:
             solarSystem) {
            PlanetReporter.printGravityAcceleration(planet);
        }

    }
}
