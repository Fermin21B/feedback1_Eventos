package com.example.feedbackeventos;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("title");
        Log.v("landing page","landing page loaded");


        Button firstFloorButton=findViewById(R.id.actividad1);
        firstFloorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","First floor button hit");
                Intent inten=new Intent(MainActivity.this, actividad1.class);
                try {
                    startActivity(inten);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","first floor button failed");
                }

            }
        });

        Button secondFloorButton=findViewById(R.id.actividad2);
        secondFloorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","second floor button hit");
                Intent intent=new Intent(MainActivity.this, actividad2.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","second floor button failed");
                }
            }
        });

        Button thirdFlooButton=findViewById(R.id.actividad3);
        thirdFlooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","third floor button hit");
                Intent intent=new Intent(MainActivity.this, actividad3.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","third floor button failed");
                }
            }
        });

        Button campusMapButton=findViewById(R.id.MapaCampus);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","campus map button hit");
                Intent intent=new Intent(MainActivity.this,campusMap.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","campus button failed");
                }
            }
        });

        Button aboutButton=findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","about button hit");
                Intent intent=new Intent(MainActivity.this, aboutMe.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","about button failed");
                }
            }
        });

        ImageView imageView=findViewById(R.id.WestHallImage);

        //Drawable d=getDrawable()

      //  imageView.setImageDrawable(R.drawable.campusmap);


    }




}
