package org.example.ch8;

import java.awt.geom.Point2D;

public record Location(double latitude, double longtitude) {

    public Location {
        if (!isValid(latitude, longtitude))
            throw new IllegalArgumentException("Invalid range");
    }

    Point2D.Double toPoint() {
        return new Point2D.Double(longtitude, latitude);
    }

    Location withLatitude(double latitude) {
        return new Location(longtitude, latitude);
    }

    Location withLongtitude(double longtitude) {
        return new Location(longtitude, latitude);
    }

    @Override
    public double longtitude() {
        System.out.println("Access " + longtitude );
        return longtitude;
    }

    @Override
    public String toString() {
        return latitude + ", " + longtitude;
    }

    static boolean isValid(double latitude, double longtitude) {
        return (-90 <= latitude && latitude <= 90) && (-180 <= longtitude && longtitude <= 180);
    }
}
