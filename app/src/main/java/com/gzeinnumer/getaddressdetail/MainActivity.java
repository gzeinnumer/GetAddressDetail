package com.gzeinnumer.getaddressdetail;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.getaddressdetail.helper.GetAddress;
import com.gzeinnumer.getaddressdetail.model.AddressKoordinat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddressKoordinat addressKoordinat = GetAddress.getAddressResult(getApplicationContext(), -0.9001564,100.4059463);

        ((TextView)findViewById(R.id.tv)).setText(addressKoordinat.toString());
    }
}