package com.example.assignment4;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

import java.io.IOError;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.attribute.AttributeView;
import java.security.KeyStore;
import java.util.ArrayList;

public class MainActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createArray();
        Drawable drawable;
        int i = 0;

        for (Cars c: carArray) {
           if (i == 0) {
                ImageView vehicle1 = findViewById(R.id.Vehicle1);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle1.setImageDrawable(drawable);
           }
           if (i == 1) {
                ImageView vehicle2 = findViewById(R.id.Vehicle2);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle2.setImageDrawable(drawable);
           }
           if (i == 2) {
                ImageView vehicle3 = findViewById(R.id.Vehicle3);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle3.setImageDrawable(drawable);
           }
           if (i == 3) {
                ImageView vehicle4 = findViewById(R.id.Vehicle4);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle4.setImageDrawable(drawable);
           }
           if (i == 4) {
                ImageView vehicle5 = findViewById(R.id.Vehicle5);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle5.setImageDrawable(drawable);
           }
           if (i == 5) {
                ImageView vehicle6 = findViewById(R.id.Vehicle6);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle6.setImageDrawable(drawable);
           }
           if (i == 6) {
                ImageView vehicle7 = findViewById(R.id.Vehicle7);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle7.setImageDrawable(drawable);
           }
           if (i == 7) {
                ImageView vehicle8 = findViewById(R.id.Vehicle8);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle8.setImageDrawable(drawable);
           }
           if (i == 8) {
                ImageView vehicle9 = findViewById(R.id.Vehicle9);
                drawable = Drawable.createFromPath(c.getCarImageName());
                vehicle9.setImageDrawable(drawable);
           }
           i++;
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();
                Intent Intent;

                Snackbar.make(view, "Hello", Snackbar.LENGTH_LONG).show();
                switch (selectedItemId){
                    case R.id.VehicleButton:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.Vehicle1:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 1);
                        currentCar = carArray.get(0);
                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                    case R.id.Vehicle2:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 2);
                        currentCar = carArray.get(1);
                        Intent.putExtra("Current", currentCar);
                        startActivity(Intent);
                    case R.id.Vehicle3:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 3);
                        currentCar = carArray.get(2);
                        Intent.putExtra("Current", currentCar);                        startActivity(Intent);
                    case R.id.Vehicle4:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 4);
                        currentCar = carArray.get(3);
                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                    case R.id.Vehicle5:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 5);
                        currentCar = carArray.get(4);

                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                    case R.id.Vehicle6:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 6);
                        currentCar = carArray.get(5);

                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                    case R.id.Vehicle7:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 7);
                        currentCar = carArray.get(6);

                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                    case R.id.Vehicle8:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 8);
                        currentCar = carArray.get(7);

                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                    case R.id.Vehicle9:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Id", 9);
                        currentCar = carArray.get(8);

                        Intent.putExtra("Current", currentCar);
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
