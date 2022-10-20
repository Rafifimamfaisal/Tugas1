package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnmaps, btnCall, btnemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmaps=findViewById(R.id.btnmaps);
        btnCall=findViewById(R.id.btnCall);
        btnemail=findViewById(R.id.btnemail);
        String email = "111202113416@mhs.dinus.ac.id";

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMaps = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("https://www.google.co.id/maps/place/Jl.+K.H+Ahmad+Dahlan,+Kebondalem,+Kec.+Pemalang,+Kabupaten+Pemalang,+Jawa+Tengah+52312/@-6.9007773,109.3749446,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6fc4d539cd27ff:0x22fc1e9fefe2cd8f!8m2!3d-6.9007826!4d109.3771333"));
                startActivity(openMaps);
            }
        });
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "085713192018";
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.fromParts("tel", number, null));
                startActivity(call);
            }
        });
        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kirim_mail = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:"+ email));
                startActivity(kirim_mail);
            }
        });
    }
}