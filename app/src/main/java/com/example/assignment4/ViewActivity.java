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


public class ViewActivity extends Cars{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        HashMap<String, Integer> carsSoldProfit = (HashMap<String, Integer>) getIntent().getSerializableExtra("PROFIT");

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        // ArrayList<Cars> carArray = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");


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
        //        Drawable drawable = Drawable.createFromPath(currentCar.getCarImageName());
//        Images.setImageDrawable(drawable);

        TextView textView = findViewById(R.id.companyText);
        textView.setText(currentCar.getCarCompany());

        TextView model = findViewById(R.id.Model);
        model.setText(currentCar.getCarCompany());
        TextView sold = findViewById(R.id.sold);
        sold.setText(currentCar.getCarCompany());
        TextView colour = findViewById(R.id.colour);
        colour.setText(currentCar.getCarCompany());


        TextView textView2 = findViewById(R.id.isAvailable2);
        String text;
        if(!currentCar.getIsAvailable())
        {
            text = "Unavailable";
        }
        else{
            text = "Available";
        }
        textView2.setText(text);
        TextView details = findViewById(R.id.Details1);
        details.setText(currentCar.getCarName());


        TextView year = findViewById(R.id.year);
        year.setText(currentCar.getYear());
        TextView cylinder = findViewById(R.id.Cylinders);
        cylinder.setText(currentCar.getCylinders());

        TextView price = findViewById(R.id.price);
        price.setText( currentCar.getPrice());

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdV = view.getId();
                Intent Intent;
                Bundle args;
                switch (selectedItemIdV){
                    case R.id.vehicleButton:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        Intent.putExtra("Current", currentCar);
//                        Intent.putExtra("Array", carArray);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST",(Serializable)carArray);
                        Intent.putExtra("BUNDLE",args);
                        startActivity(Intent);
                        break;
                    case R.id.Add:
                        Intent = new Intent(getApplicationContext(), AddActivity.class);

                        Intent.putExtra("Current", currentCar);
//                        Intent.putExtra("Array", carArray);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST",(Serializable)carArray);
                        Intent.putExtra("BUNDLE",args);
                        startActivity(Intent);
                        break;
                    case R.id.Modify:
                        Intent = new Intent(getApplicationContext(), ModifyActivity.class);
                        Intent.putExtra("Current", currentCar);
                        Intent.putExtra("Array", carArray);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST",(Serializable)carArray);
                        Intent.putExtra("BUNDLE",args);
                        startActivity(Intent);
                        break;
                    case R.id.Buy:
                        Intent = new Intent(getApplicationContext(), MainActivity2.class);
                        Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                        Intent.putExtra("Current", currentCar);
//                        Intent.putExtra("Array", carArray);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST",(Serializable)carArray);
                        Intent.putExtra("BUNDLE",args);
                        startActivity(Intent);
                        break;
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };

        Button Vehicles = findViewById(R.id.vehicleButton);
        Button Add = findViewById(R.id.Add);
        Button Modify = findViewById(R.id.Modify);

        Button Buy = findViewById(R.id.Buy);

        Buy.setOnClickListener(onClickListener);

        Vehicles.setOnClickListener(onClickListener);
        Add.setOnClickListener(onClickListener);
        Modify.setOnClickListener(onClickListener);

    }
}