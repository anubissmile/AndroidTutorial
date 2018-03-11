package com.tutorial.android.androidtuturial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAddress, btnResume;

    /**
     * Logic at on create.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Load resources layout.
         */
        setContentView(R.layout.activity_main);

        /**
         * Binding Object.
         */
        bindingObj();

        /**
         * Activity on click address button.
         */
        onClickAddressButton();

        /**
         * Activity on click resume button.
         */
        onClickResumeButton();
    }

    private void onClickResumeButton() {
        btnResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Your code here.
                 */

                /**
                 * Call Intent object
                 */
                Intent intent = new Intent(MainActivity.this, ResumeActivity.class);
                Bundle bd = new Bundle(); // New bundle class
                bd.putString("NAME", "Wesarut Khm"); // Put the values.
                intent.putExtras(bd); // Put bundle in the intent object.
                startActivity(intent); //Load new Activity
            }
        });
    }

    private void onClickAddressButton() {
        btnAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Call Intent object.
                 */
                Intent intent = new Intent(MainActivity.this, AddressActivity.class);
                Bundle bd = new Bundle(); // New bundle class
                bd.putString("ADDRESS", "SINGHABURI"); // Put the values.
                intent.putExtras(bd); // Put bundle in the intent object.
                startActivity(intent); // Load new Activity.
            }
        });
    }

    private void bindingObj() {
        btnAddress = (Button) findViewById(R.id.btnAddress);
        btnResume = (Button) findViewById(R.id.btnResume);
    }
}
