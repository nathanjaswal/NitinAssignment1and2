package com.example.nitinassignment1and2;

public class LocM {
    /**
     * Properties
     */
    protected String address;
    protected String date;
    protected Double lat;
    protected Double longi;
    //-----------------------------------------------------------------------


    /**
     * Constructor
     */
    public LocM(String address, Double lat, Double longi) {
        this.address = address;
        this.lat = lat;
        this.longi = longi;
    }

    //-----------------------------------------------------------------------

    /**
     * Getter - Setter
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String address) {
        this.date = date;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLongi() {
        return longi;
    }

    public void setLongi(Double lat) {
        this.longi = longi;
    }

}

