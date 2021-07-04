package com.gzeinnumer.getaddressdetail;

public class AddressKoordinat {
    private String addressLine;
    private String locality;
    private String subLocality;
    private String adminArea;
    private String postalCode;
    private String countryCode;
    private String countryName;
    private String lt;
    private String lg;
    private String kabupaten;

    public AddressKoordinat() {
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getSubLocality() {
        return subLocality;
    }

    public void setSubLocality(String subLocality) {
        this.subLocality = subLocality;
    }

    public String getAdminArea() {
        return adminArea;
    }

    public void setAdminArea(String adminArea) {
        this.adminArea = adminArea;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    @Override
    public String toString() {
        return "AddressKoordinat{" +
                "addressLine='" + addressLine + '\'' +
                ", locality='" + locality + '\'' +
                ", subLocality='" + subLocality + '\'' +
                ", adminArea='" + adminArea + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", lt='" + lt + '\'' +
                ", lg='" + lg + '\'' +
                ", kabupaten='" + kabupaten + '\'' +
                '}';
    }
}

