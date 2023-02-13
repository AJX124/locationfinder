package com.example.locationfinder;

import android.location.Location;

public class Calculate {

    public static float getDistanceInKM(double startLatitude,double startLongitude,double endLatitude, double endLongitude){
        System.out.println("In getDistanceInKM");
        float[] result = new float[]{0};
        Location.distanceBetween(startLatitude,startLongitude,endLatitude,endLongitude,result);

        return result[0] / 1000;
    }
}
