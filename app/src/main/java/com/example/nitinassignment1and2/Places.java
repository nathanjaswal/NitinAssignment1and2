package com.example.nitinassignment1and2;


import com.google.android.gms.maps.model.LatLng;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "place_table")
public class Places {

    public static final String Date_KEY = "date", VIC_KEY = "vicinity", LAT_KEY = "lat", LNG_KEY = "lng", LOC_KEY = "location";

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "date")
    private String date;
    @ColumnInfo(name = "address")
    private String address;
    @ColumnInfo(name = "latitude")
    private String latitude;
    @ColumnInfo(name = "longitude")
    private String longitude;


    public Places(@NonNull String date, @NonNull String address, @NonNull String latitude, @NonNull String longitude) {
        this.date = date;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String vicinity) {
        this.address = vicinity;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public LatLng getLocation() {
        return new LatLng(Double.valueOf(getLatitude()), Double.valueOf(getLongitude()));
    }


}
