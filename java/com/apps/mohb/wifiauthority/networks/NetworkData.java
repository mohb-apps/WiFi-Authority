/*
 *  Copyright (c) 2017 mohb apps - All Rights Reserved
 *
 *  Project       : WiFiAuthority
 *  Developer     : Haraldo Albergaria Filho, a.k.a. mohb apps
 *
 *  File          : NetworkData.java
 *  Last modified : 7/15/17 2:28 AM
 *
 *  -----------------------------------------------------------
 */

package com.apps.mohb.wifiauthority.networks;


import com.apps.mohb.wifiauthority.Constants;

public class NetworkData {

    private String description;
    private String ssid;
    private String mac;
    private String security;
    private int frequency;
    private String password;
    private double latitude;
    private double longitude;


    public NetworkData(String description, String ssid, String bssid,
                       String security, String password, double latitude, double longitude) {
        this.description = description;
        this.ssid = ssid;
        this.mac = bssid;
        this.security = security;
        this.frequency = Constants.NO_FREQ_SET;
        this.password = password;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSSID(String ssid) {
        this.ssid = ssid;
    }

    public void setMacAddress(String mac) {
        this.mac = mac;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public String getSSID() {
        return ssid;
    }

    public String getMacAddress() {
        return mac;
    }

    public String getSecurity() {
        return security;
    }

    public String getPassword() {
        return password;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }


}
