package com.example.assignment4;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<Cars> carArray2 = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");
        currentCar = (Cars) getIntent().getSerializableExtra("Current");

//        Intent intent = getIntent();
//        Bundle args = intent.getBundleExtra("BUNDLE");
//        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");

//        Intent intent;
        Drawable drawable;
//        int i = 0;
        ArrayList<Cars> carArray = new ArrayList<>();
        if(!carArray.isEmpty()) {
            Intent intent = getIntent();
            Bundle args = intent.getBundleExtra("BUNDLE");
            carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");
        }else{
            carArray = createArray();
        }
//        for (Cars c: carArray) {
         for(int i = 0; i < carArray.size(); i ++ ) {
             try {
                 if (i == 0) {
                     ImageView vehicle1 = findViewById(R.id.Vehicle1);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle1.setImageDrawable(drawable);
                 }
                 if (i == 1) {
                     ImageView vehicle2 = findViewById(R.id.Vehicle2);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle2.setImageDrawable(drawable);
                 }
                 if (i == 2) {
                     ImageView vehicle3 = findViewById(R.id.Vehicle3);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle3.setImageDrawable(drawable);
                 }
                 if (i == 3) {
                     ImageView vehicle4 = findViewById(R.id.Vehicle4);
                     //                drawable = Drawable.createFromPath(c.getCarImageName());
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle4.setImageDrawable(drawable);
                 }
                 if (i == 4) {
                     ImageView vehicle5 = findViewById(R.id.Vehicle5);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle5.setImageDrawable(drawable);
                 }
                 if (i == 5) {
                     ImageView vehicle6 = findViewById(R.id.Vehicle6);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle6.setImageDrawable(drawable);
                 }
                 if (i == 6) {
                     ImageView vehicle7 = findViewById(R.id.Vehicle7);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle7.setImageDrawable(drawable);
                 }
                 if (i == 7) {
                     ImageView vehicle8 = findViewById(R.id.Vehicle8);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle8.setImageDrawable(drawable);
                 }
                 if (i == 8) {
                     ImageView vehicle9 = findViewById(R.id.Vehicle9);
                     drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
                     vehicle9.setImageDrawable(drawable);
                 }
             }catch(Exception e)
             {
                 Toast.makeText(getApplicationContext(),"Out of Bounds Exception", Toast.LENGTH_LONG).show();
             }
         }

        ArrayList<Cars> finalCarArray = carArray;
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();
                Intent Intent;
                Bundle args;
                Snackbar.make(view, "Hello", Snackbar.LENGTH_LONG).show();
                try {
                    switch (selectedItemId) {
                        case R.id.VehicleButton:
                            Intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(Intent);
                            break;
                        case R.id.Vehicle1:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 1);
                            currentCar = finalCarArray.get(0);
                            Intent.putExtra("Current", currentCar);
//                            Intent.putExtra("Array", carArray);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle2:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 2);
                            currentCar = finalCarArray.get(1);
                            Intent.putExtra("Current", currentCar);
                            //                            Intent.putExtra("Array", carArray);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle3:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 3);
                            currentCar = finalCarArray.get(2);
//                            Intent.putExtra("Array", carArray);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle4:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 4);
                            currentCar = finalCarArray.get(3);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle5:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 5);
                            currentCar = finalCarArray.get(4);
//                            Intent.putExtra("Array", carArray);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle6:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 6);
                            currentCar = finalCarArray.get(5);
//                            Intent.putExtra("Array", carArray);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle7:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 7);
                            currentCar = finalCarArray.get(6);
//                            Intent.putExtra("Array", carArray);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle8:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 8);
                            currentCar = finalCarArray.get(7);
//                            Intent.putExtra("Array", carArray);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        case R.id.Vehicle9:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
                            Intent.putExtra("Id", 9);
                            currentCar = finalCarArray.get(8);
//                            Intent.putExtra("Array", carArray);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                        default:
//                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 1);
//                            currentCar = finalCarArray.get(0);
//                            Intent.putExtra("Current", currentCar);
////                            Intent.putExtra("Array", carArray);
//                            args = new Bundle();
//                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
//                            Intent.putExtra("BUNDLE",args);
//                            startActivity(Intent);
                            Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                    }
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Out of Bounds Exception", Toast.LENGTH_LONG).show();
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
