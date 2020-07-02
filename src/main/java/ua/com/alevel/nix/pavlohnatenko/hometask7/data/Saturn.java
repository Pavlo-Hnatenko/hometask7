package ua.com.alevel.nix.pavlohnatenko.hometask7.data;

public class Saturn extends AbstractPlanet{

    private static Saturn saturn;

    private Saturn() {
        super("Saturn", 5.6834e26, 5.8232e7);
    }

    public static Saturn getInstance() {
        if (saturn == null) {
            saturn = new Saturn();
        }
        return saturn;
    }
    
}
