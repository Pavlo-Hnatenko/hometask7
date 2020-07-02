package ua.com.alevel.nix.pavlohnatenko.hometask7;

import ua.com.alevel.nix.pavlohnatenko.hometask7.data.AbstractPlanet;
import ua.com.alevel.nix.pavlohnatenko.hometask7.data.Earth;
import ua.com.alevel.nix.pavlohnatenko.hometask7.service.PlanetReporter;

public class Main {

    public static void main(String[] args) {

        AbstractPlanet earth = Earth.getInstance();
        PlanetReporter.printGravityAcceleration(earth);

    }
}
