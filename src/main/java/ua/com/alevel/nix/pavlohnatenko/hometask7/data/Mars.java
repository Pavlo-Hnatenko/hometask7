package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Mars extends AbstractPlanet {

    private static Mars mars;

    private Mars() {
        super("Mars", 6.4171e23, 3.3895e6);
    }

    public static Mars getInstance() {
        if (mars == null) {
            mars = new Mars();
        }
        return mars;
    }
}
