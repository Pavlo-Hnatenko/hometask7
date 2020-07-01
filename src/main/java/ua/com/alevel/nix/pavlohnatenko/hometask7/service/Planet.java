package ua.com.alevel.nix.pavlohnatenko.hometask7.service;

import ua.com.alevel.nix.pavlohnatenko.hometask7.data.AbstractPlanet;
import ua.com.alevel.nix.pavlohnatenko.hometask7.util.GravityUtil;

public interface Planet {
    static double getGravityAcceleration(){
        return GravityUtil.getGravitationalConstant() * (AbstractPlanet.getMASS() / Math.pow(AbstractPlanet.getRADIUS(), 2));
    }

}
