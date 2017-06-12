package com.example.baadjie.mybirthdayapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btnViews;
    private TextView venue,date,time,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViews= (Button) findViewById(R.id.btnView);
        venue= (TextView) findViewById(R.id.txtVenue);
        date= (TextView) findViewById(R.id.txtDate);
        time= (TextView) findViewById(R.id.txtTime);
        contact= (TextView) findViewById(R.id.txtContact);

        btnViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String venues="Muswane Village";
                String dates="16 - November - 2017";
                String times="14:00";
                String contacts="0727436927";


                venue.setText(venues);
                date.setText(dates);
                time.setText(times);
                contact.setText(times);



                Toast.makeText(MainActivity.this, "dont forget to bring your own refreshment ",Toast.LENGTH_LONG).show();

            }
        });

    }
}
