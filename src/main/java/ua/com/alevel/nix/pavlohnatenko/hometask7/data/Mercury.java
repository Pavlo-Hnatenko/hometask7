package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Mercury extends AbstractPlanet {

    private static Mercury mercury;

    private Mercury() {
        super("Mercury", 3.3e23, 2.44e6);
    }

    public static Mercury getInstance() {
        if (mercury == null) {
            mercury = new Mercury();
        }
        return mercury;
    }
}
