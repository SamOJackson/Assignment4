package com.example.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity2 extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagesview);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        // ArrayList<Cars> carArray = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");
        HashMap<String, Integer> carsSoldProfit = (HashMap<String, Integer>) getIntent().getSerializableExtra("PROFIT");


        ImageView Images = findViewById(R.id.Images);
        if (currentCar.getCarName().contains("Red Car")) {
            Images.setImageResource(R.drawable.redcar);
        } else if (currentCar.getCarName().contains("Yellow Car")) {
            Images.setImageResource(R.drawable.yellowcar);
        } else if (currentCar.getCarName().contains("Cars Car")) {
            Images.setImageResource(R.drawable.carscar);
        } else {
            Images.setImageResource(R.drawable.unknown);
        }
        TextView textView = findViewById(R.id.companyText2);
        textView.setText(currentCar.getCarCompany());
        TextView textView2 = findViewById(R.id.isAvailable3);
        String text;
        if (!currentCar.getIsAvailable()) {
            text = "Unavailable";
        } else {
            text = "Available";
        }
        textView2.setText(text);
        TextView details = findViewById(R.id.details);
        details.setText(currentCar.getCarName());


        TextView year = findViewById(R.id.year3);
        year.setText(currentCar.getYear());
        TextView cylinder = findViewById(R.id.cylinders3);
        cylinder.setText(currentCar.getCylinders());

        TextView price = findViewById(R.id.buyPrice);
        price.setText(currentCar.getPrice());

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdV = view.getId();
                Intent Intent;
                Bundle args;
                switch (selectedItemIdV) {
                    case R.id.vehicleButton4:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        Intent.putExtra("Current", currentCar);
//                        Intent.putExtra("Array", carArray);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);

                        startActivity(Intent);
                        break;
                    case R.id.submit5:
                        int total = 0;
//                        int amount = 0;
                        if (!currentCar.getIsAvailable()) {
                            Snackbar.make(view, "Car is not available", Snackbar.LENGTH_LONG).show();
                        } else {
                            currentCar.setIsAvailable(false);
//                            EditText amount2 = findViewById(R.id.amount);
//                            String amount1 = amount2.getText().toString();
//                            amount = Integer.parseInt(amount1);
//                            int Int = Integer.parseInt(currentCar.getPrice());
                            int Int = currentCar.getPrice2();
                            total = currentCar.getPrice2(); //* amount;
//                            total = Int * amount;
                            TextView Total = findViewById(R.id.Total);
                            Total.setText(total);
//                            Cars.setTotal(total);
//                            Cars.setAmount(amount);
                        }
                        break;
                    case R.id.Buy2:
                        Intent = new Intent(getApplicationContext(), BuyActivity.class);
                        Intent.putExtra("Current", currentCar);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        startActivity(Intent);
                        break;
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };

        Button Vehicles = findViewById(R.id.vehicleButton4);
        Button Buy = findViewById(R.id.Buy2);
        Buy.setOnClickListener(onClickListener);
        Vehicles.setOnClickListener(onClickListener);
    }
}

