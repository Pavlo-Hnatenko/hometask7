package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Earth extends AbstractPlanet {

    private static Earth earth;

    private Earth() {
        super("Earth", 5.972e24, 6371);
    }

    public static Earth getInstance() {
        if (earth == null) {
            earth = new Earth();
        }
        return earth;
    }

}
