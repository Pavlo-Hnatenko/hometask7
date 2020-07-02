package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Venus extends AbstractPlanet {

    private static Venus venus;

    private Venus() {
        super("Venus", 4.8675e24, 6.0518e6);
    }

    public static Venus getInstance() {
        if (venus == null) {
            venus = new Venus();
        }
        return venus;
    }
}
