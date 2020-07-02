package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Jupiter extends AbstractPlanet {

    private static Jupiter jupiter;

    private Jupiter() {
        super("Jupiter", 1.8982e27, 6.9911e7);
    }

    public static Jupiter getInstance() {
        if (jupiter == null) {
            jupiter = new Jupiter();
        }
        return jupiter;
    }
}
