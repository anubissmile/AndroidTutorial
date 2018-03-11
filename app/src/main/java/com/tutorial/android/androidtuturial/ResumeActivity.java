package com.tutorial.android.androidtuturial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResumeActivity extends AppCompatActivity {

    private TextView txtResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        /**
         * Binding Object.
         */
        bindObj();

        Bundle bd = getIntent().getExtras();
        showingResumeName(bd.getString("NAME"));
    }

    private void showingResumeName(String name) {
        txtResume.setText(name);
    }

    private void bindObj() {
        txtResume = (TextView)findViewById(R.id.txtResume);
    }
}