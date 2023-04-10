package com.example.assignment4;



import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class ViewActivity extends Cars{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        ArrayList<Cars> carArray = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");


        ImageView vehicleView;

        ImageView Images = findViewById(R.id.Images);
        Drawable drawable = Drawable.createFromPath(currentCar.getCarImageName());
        Images.setImageDrawable(drawable);

        TextView textView = findViewById(R.id.companyText);
        textView.setText(currentCar.getCarCompany());
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
        TextView details = findViewById(R.id.Details2);
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
                switch (selectedItemIdV){
                    case R.id.vehicleButton:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.Add:
                        Intent = new Intent(getApplicationContext(), AddActivity.class);

                        Intent.putExtra("Current", currentCar);
                        Intent.putExtra("Array", carArray);
                        startActivity(Intent);
                        break;
                    case R.id.Modify:
                        Intent = new Intent(getApplicationContext(), ModifyActivity.class);
                        Intent.putExtra("Current", currentCar);
                        Intent.putExtra("Array", carArray);
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

        Vehicles.setOnClickListener(onClickListener);
        Add.setOnClickListener(onClickListener);
        Modify.setOnClickListener(onClickListener);

    }
}