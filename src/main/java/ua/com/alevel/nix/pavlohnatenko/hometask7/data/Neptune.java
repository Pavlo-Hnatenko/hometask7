package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Neptune extends AbstractPlanet {

    private static Neptune neptune;

    private Neptune() {
        super("Neptune", 1.024e26, 2.4622e7);
    }

    public static Neptune getInstance() {
        if (neptune == null) {
            neptune = new Neptune();
        }
        return neptune;
    }
}
