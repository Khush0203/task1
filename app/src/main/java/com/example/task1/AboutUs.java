package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {


    TextView sp;
    TextView pp;
    TextView tos;
    TextView cu;
    TextView rp;
    TextView au;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        sp = findViewById(R.id.shippingp1);
        pp = findViewById(R.id.privacyp1);
        tos = findViewById(R.id.ts1);
        cu = findViewById(R.id.contactus1);
        rp = findViewById(R.id.refundp1);



        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutUs.this , ShippingPolicy.class);
                startActivity(i);
            }
        });


        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutUs.this , PrivacyPolicy.class);
                startActivity(i);
            }
        });


        tos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutUs.this , TermsOfService.class);
                startActivity(i);
            }
        });

        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutUs.this , ContactUs.class);
                startActivity(i);
            }
        });

        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutUs.this , RefundPolicy.class);
                startActivity(i);
            }
        });







    }
}