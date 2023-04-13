package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class CompanyView2 extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_view2);
        HashMap<String, Integer> carsSoldProfit = (HashMap<String, Integer>) getIntent().getSerializableExtra("PROFIT");

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        // ArrayList<Cars> carArray = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");

        TextView Cc = findViewById(R.id.CCompanyName);
        Cc.setText(Cars.getCCompanyName());
        TextView Address = findViewById(R.id.companyAddress);
        Address.setText(Cars.getCCompanyAddress());

        TextView carsSold = findViewById(R.id.carsSold);
        TextView profit = findViewById(R.id.profit);
//        carsSoldProfit.get("Profit");
//        carsSold.setText(carsSoldProfit.get("Profit"));
//        profit.setText(carsSoldProfit.get("CarsSold"));
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdV = view.getId();
                Intent Intent;
                Bundle args;
                switch (selectedItemIdV) {
                    case R.id.vehicleButton6:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        Intent.putExtra("Current", currentCar);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        startActivity(Intent);
                        break;
                    case R.id.edit:
                        Intent = new Intent(getApplicationContext(), CompanyView.class);
                        Intent.putExtra("Current", currentCar);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        startActivity(Intent);
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };

        Button Vehicles = findViewById(R.id.vehicleButton6);

        Button edit = findViewById(R.id.edit);

        edit.setOnClickListener(onClickListener);
        Vehicles.setOnClickListener(onClickListener);
    }
}