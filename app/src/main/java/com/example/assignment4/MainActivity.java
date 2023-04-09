package com.example.assignment4;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

import java.nio.file.attribute.AttributeView;
import java.security.KeyStore;
import java.util.ArrayList;

public class MainActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createArray();
        Drawable[] drawable = new Drawable[carArray.size() + 9];
        int i = 0;
        //int i = 1;
        for (Cars c: carArray) {
            drawable[i] = Drawable.createFromPath(c.getCarImageName());
            i++;
        }
        if (carArray.size() >= 1) {
            ImageView vehicle1 = findViewById(R.id.Vehicle1);
            //vehicle1.setImageDrawable(drawable[0]);
        }
        if(carArray.size() >= 2) {
            ImageView vehicle2 = findViewById(R.id.Vehicle2);
            //vehicle2.setImageDrawable(drawable[1]);
        }
        if(carArray.size() >= 3) {
            ImageView vehicle3 = findViewById(R.id.Vehicle3);
            //vehicle3.setImageDrawable(drawable[2]);
        }
        if(carArray.size() >= 4) {
            ImageView vehicle4 = findViewById(R.id.Vehicle4);
            //vehicle4.setImageDrawable(drawable[4]);
        }
        if(carArray.size() >= 5) {
            ImageView vehicle5 = findViewById(R.id.Vehicle5);
            //vehicle5.setImageDrawable(drawable[5]);
        }
        if(carArray.size() >= 6) {
            ImageView vehicle6 = findViewById(R.id.Vehicle6);
            //vehicle6.setImageDrawable(drawable[6]);
        }
        if(carArray.size() >= 7) {
            ImageView vehicle7 = findViewById(R.id.Vehicle7);
            //vehicle7.setImageDrawable(drawable[7]);
        }
        if(carArray.size() >= 8) {
            ImageView vehicle8 = findViewById(R.id.Vehicle8);
            //vehicle8.setImageDrawable(drawable[8]);
        }
        if (carArray.size() >= 9) {
            ImageView vehicle9 = findViewById(R.id.Vehicle9);
            //vehicle9.setImageDrawable(drawable[9]);
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();
                Intent Intent;

                //Button which = findViewById(selectedItemId);
                Snackbar.make(view, "Hello", Snackbar.LENGTH_LONG).show();
                switch (selectedItemId){
                    case R.id.VehicleButton:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.Vehicle1:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 1;
                        startActivity(Intent);
                    case R.id.Vehicle2:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 2;
                        startActivity(Intent);
                    case R.id.Vehicle3:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 3;
                        startActivity(Intent);
                    case R.id.Vehicle4:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 4;
                        startActivity(Intent);
                    case R.id.Vehicle5:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 5;
                        startActivity(Intent);
                    case R.id.Vehicle6:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 6;
                        startActivity(Intent);
                    case R.id.Vehicle7:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 7;
                        startActivity(Intent);
                    case R.id.Vehicle8:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 8;
                        startActivity(Intent);
                    case R.id.Vehicle9:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        vehicleId = 9;
                        startActivity(Intent);

                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };

        ImageView View1 = findViewById(R.id.Vehicle1);
        ImageView View2 = findViewById(R.id.Vehicle2);
        ImageView View3 = findViewById(R.id.Vehicle3);
        ImageView View4 = findViewById(R.id.Vehicle4);
        ImageView View5 = findViewById(R.id.Vehicle5);
        ImageView View6 = findViewById(R.id.Vehicle6);
        ImageView View7 = findViewById(R.id.Vehicle7);
        ImageView View8 = findViewById(R.id.Vehicle8);
        ImageView View9 = findViewById(R.id.Vehicle9);


        View1.setOnClickListener(onClickListener);
        View2.setOnClickListener(onClickListener);
        View3.setOnClickListener(onClickListener);
        View4.setOnClickListener(onClickListener);
        View5.setOnClickListener(onClickListener);
        View6.setOnClickListener(onClickListener);
        View7.setOnClickListener(onClickListener);
        View8.setOnClickListener(onClickListener);
        View9.setOnClickListener(onClickListener);
    }
}
