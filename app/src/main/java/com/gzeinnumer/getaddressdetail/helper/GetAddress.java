package com.gzeinnumer.getaddressdetail.helper;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

import com.gzeinnumer.getaddressdetail.model.AddressKoordinat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GetAddress {

    private final String TAG = getClass().getSimpleName();

    public static AddressKoordinat getAddressResult(Context context, double LATITUDE, double LONGITUDE) {
        Geocoder geocoder = new Geocoder(context, Locale.getDefault());
        AddressKoordinat addressKoordinat = new AddressKoordinat();

        List<Address> addressList = new ArrayList<>();

        try {
            addressList = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (addressList != null && addressList.size() != 0) {
            Address address = addressList.get(0);

            for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                addressKoordinat.setAddressLine(address.getAddressLine(i));
                addressKoordinat.setLocality(address.getSubLocality());
                addressKoordinat.setSubLocality(address.getLocality());
                addressKoordinat.setAdminArea(address.getAdminArea());
                addressKoordinat.setPostalCode(address.getPostalCode());
                addressKoordinat.setCountryCode(address.getCountryCode());
                addressKoordinat.setCountryName(address.getCountryName());
                addressKoordinat.setLt(String.valueOf(address.getLatitude()));
                addressKoordinat.setLg(String.valueOf(address.getLongitude()));
                addressKoordinat.setKabupaten(String.valueOf(address.getSubAdminArea()));
            }
            return addressKoordinat;
        } else {
            return null;
        }
    }
}

