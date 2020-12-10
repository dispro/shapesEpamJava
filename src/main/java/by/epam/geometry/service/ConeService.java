package by.epam.geometry.service;

import by.epam.geometry.entity.Cone;

public class ConeService {

    public double getVolume(Cone cone){
        double volume = ((cone.getHeight() * cone.getRadius()) / 2) * (2 * Math.PI * cone.getRadius());
        return volume;
    }

    public double getAreaSurfaceCone(Cone cone){
        double area = Math.PI * cone.getRadius() * (cone.getRadius() + cone.getRadius());
        return area;
    }


}
