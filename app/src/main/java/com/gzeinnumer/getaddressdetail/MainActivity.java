package com.gzeinnumer.getaddressdetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.gzeinnumer.getaddressdetail.helper.GetAddress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddressKoordinat addressKoordinat = GetAddress.getAddressResult(getApplicationContext(), -0.9001564,100.4059463);

        ((TextView)findViewById(R.id.tv)).setText(addressKoordinat.toString());
    }
}