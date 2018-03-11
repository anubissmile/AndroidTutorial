package com.tutorial.android.androidtuturial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AddressActivity extends AppCompatActivity {

    private TextView txtAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        /**
         * Binding Object.
         */
        bindObj();

        Bundle bd = getIntent().getExtras();
        showingAddressName(bd.getString("ADDRESS"));
    }

    private void showingAddressName(String addressName) {
        txtAddress.setText(addressName);
    }

    private void bindObj() {
        txtAddress = (TextView)findViewById(R.id.txtAddress);
    }
}
