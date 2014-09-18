package com.urbik.framework.main.Model;

/**
 * Created by Antoine on 17/09/2014.
 */
public class ModelGps extends Model {
    private float latitude;
    private float longitude;
    private float altitude;
    private float accuracy;

    public ModelGps(float lat, float longitude, float alt, float acc) {
        this.latitude = lat;
        this.longitude = longitude;
        this.altitude = alt;
        this.accuracy = acc;
    }
}
