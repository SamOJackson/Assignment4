package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ListActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");

//        ArrayList<Cars> carArray2 = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");
//        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        HashMap<String, Integer> carsSoldProfit = new HashMap<>();

        carsSoldProfit.put("CarsSold", 0);
        carsSoldProfit.put("Profit", 0);

        Drawable drawable;
        //        for (Cars c: carArray) {
        for (int i = 0; i < 5; i++) {
            try {
                if (i == 0) {
                    ImageView vehicle1 = findViewById(R.id.Car1);
//                    drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
//                    vehicle1.setImageDrawable(drawable);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle1.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle1.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle1.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle1.setImageResource(R.drawable.unknown);
                    }

                    TextView car1 = findViewById(R.id.textView2);
                    String car1Name = carArray.get(i).getCarName();
                    String car1Company = carArray.get(i).getCarCompany();
                    String car1Price = carArray.get(i).getPrice();
                    String car1Cylinders = carArray.get(i).getCylinders();
                    String car1Year = carArray.get(i).getYear();
                    car1.setText("Car Name: " + car1Name + " Car Company: " + car1Company + " Price: " + car1Price + " Cylinders: " + car1Cylinders + " Year: " + car1Year);
                }
                if (i == 1) {
                    ImageView vehicle2 = findViewById(R.id.Car2);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle2.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle2.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle2.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle2.setImageResource(R.drawable.unknown);
                    }
                    TextView car2 = findViewById(R.id.textView3);
                    String car2Name = carArray.get(i).getCarName();
                    String car2Company = carArray.get(i).getCarCompany();
                    String car2Price = carArray.get(i).getPrice();
                    String car2Cylinders = carArray.get(i).getCylinders();
                    String car2Year = carArray.get(i).getYear();
                    car2.setText("Car Name: " + car2Name + " Car Company: " + car2Company + " Price: " + car2Price + " Cylinders: " + car2Cylinders + " Year: " + car2Year);

                }
                if (i == 2) {
                    ImageView vehicle3 = findViewById(R.id.Car3);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle3.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle3.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle3.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle3.setImageResource(R.drawable.unknown);
                    }
                    TextView car3 = findViewById(R.id.textView4);
                    String car3Name = carArray.get(i).getCarName();
                    String car3Company = carArray.get(i).getCarCompany();
                    String car3Price = carArray.get(i).getPrice();
                    String car3Cylinders = carArray.get(i).getCylinders();
                    String car3Year = carArray.get(i).getYear();
                    car3.setText("Car Name: " + car3Name + " Car Company: " + car3Company + " Price: " + car3Price + " Cylinders: " + car3Cylinders + " Year: " + car3Year);

                }
                if (i == 3) {
                    ImageView vehicle4 = findViewById(R.id.Car4);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle4.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle4.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle4.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle4.setImageResource(R.drawable.unknown);
                    }
                    TextView car4 = findViewById(R.id.textView5);
                    String car4Name = carArray.get(i).getCarName();
                    String car4Company = carArray.get(i).getCarCompany();
                    String car4Price = carArray.get(i).getPrice();
                    String car4Cylinders = carArray.get(i).getCylinders();
                    String car4Year = carArray.get(i).getYear();
                    car4.setText("Car Name: " + car4Name + " Car Company: " + car4Company + " Price: " + car4Price + " Cylinders: " + car4Cylinders + " Year: " + car4Year);
                }
                if (i == 4) {
                    ImageView vehicle5 = findViewById(R.id.Car5);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle5.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle5.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle5.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle5.setImageResource(R.drawable.unknown);
                    }
                    TextView car5 = findViewById(R.id.textView6);
                    String car5Name = carArray.get(i).getCarName();
                    String car5Company = carArray.get(i).getCarCompany();
                    String car5Price = carArray.get(i).getPrice();
                    String car5Cylinders = carArray.get(i).getCylinders();
                    String car5Year = carArray.get(i).getYear();
                    car5.setText("Car Name: " + car5Name + " Car Company: " + car5Company + " Price: " + car5Price + " Cylinders: " + car5Cylinders + " Year: " + car5Year);

                }
            } catch (Exception e) {
                System.out.println("Exception" + e);

            }
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdV = view.getId();
                Intent Intent;
                Bundle args;
                switch (selectedItemIdV) {
                    case R.id.vehicleButton10:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        Intent.putExtra("Current", currentCar);
                        //                        Intent.putExtra("Array", carArray);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    case R.id.Car1:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        //                            Intent.putExtra("Id", 1);
                        currentCar = carArray.get(0);
                        Intent.putExtra("Current", currentCar);
                        //                            Intent.putExtra("Array", carArray);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    case R.id.Car2:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        //                            Intent.putExtra("Id", 2);
                        currentCar = carArray.get(1);
                        Intent.putExtra("Current", currentCar);
                        //                            Intent.putExtra("Array", carArray);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    case R.id.Car3:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        //                            Intent.putExtra("Id", 3);
                        currentCar = carArray.get(2);
                        Intent.putExtra("Current", currentCar);
                        //                            Intent.putExtra("Array", carArray);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    case R.id.Car4:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        //                            Intent.putExtra("Id", 4);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        currentCar = carArray.get(3);
                        //                            Intent.putExtra("Array", carArray);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);
                        Intent.putExtra("Current", currentCar);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    case R.id.Car5:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        //                            Intent.putExtra("Id", 4);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        currentCar = carArray.get(4);
                        //                            Intent.putExtra("Array", carArray);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);
                        Intent.putExtra("Current", currentCar);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };

        Button VehicleButton10 = findViewById(R.id.vehicleButton10);
        ImageView Cars1 = findViewById(R.id.Car1);
        ImageView Cars2 = findViewById(R.id.Car2);
        ImageView Cars3 = findViewById(R.id.Car3);
        ImageView Cars4 = findViewById(R.id.Car4);

        ImageView Cars5 = findViewById(R.id.Car5);

        Cars5.setOnClickListener(onClickListener);
        Cars4.setOnClickListener(onClickListener);
        Cars3.setOnClickListener(onClickListener);
        Cars2.setOnClickListener(onClickListener);
        Cars1.setOnClickListener(onClickListener);


        VehicleButton10.setOnClickListener(onClickListener);
    }
}