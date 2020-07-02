package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Uranus extends AbstractPlanet {

    private static Uranus uranus;

    private Uranus() {
        super("Uranus", 8.681e25, 2.5362e7);
    }

    public static Uranus getInstance() {
        if (uranus == null) {
            uranus = new Uranus();
        }
        return uranus;
    }
}
