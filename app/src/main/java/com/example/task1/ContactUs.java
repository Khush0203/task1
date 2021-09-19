package com.example.task1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUs extends AppCompatActivity {


    TextView sp;
    TextView pp;
    TextView tos;
    TextView cu;
    TextView rp;
    TextView au;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);

        sp = findViewById(R.id.shippingp1);
        pp = findViewById(R.id.privacyp1);
        tos = findViewById(R.id.ts1);
        cu = findViewById(R.id.contactus1);
        rp = findViewById(R.id.refundp1);
        au = findViewById(R.id.aboutus1);


        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactUs.this , ShippingPolicy.class);
                startActivity(i);
            }
        });


        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactUs.this , PrivacyPolicy.class);
                startActivity(i);
            }
        });


        tos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactUs.this , TermsOfService.class);
                startActivity(i);
            }
        });

        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactUs.this , ContactUs.class);
                startActivity(i);
            }
        });

        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactUs.this , RefundPolicy.class);
                startActivity(i);
            }
        });

        au.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactUs.this , AboutUs.class);
                startActivity(i);

            }
        });
        
        
        

    }
}