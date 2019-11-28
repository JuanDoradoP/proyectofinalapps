package com.apps.proyectofinalapps.Entity;

import java.util.Date;

public class Services {

    private String ID;
    private String IDGallery;
    private String state;
    private String date;
    private String type;
    private Double[] latLong;
    private String UIDClient;
    private String UIDVendor;

    public Services() {
    }

    public Services(String ID, String IDGallery, String date, String type, Double[] latLong, String UIDClient, String UIDVendor) {
        this.ID = ID;
        this.IDGallery = IDGallery;
        this.state = "posted";
        this.date = date;
        this.type = type;
        this.latLong = latLong;
        this.UIDClient = UIDClient;
        this.UIDVendor = UIDVendor;
    }
}
