package com.example.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.HashMap;

public class CompanyView extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_view);

        HashMap<String, Integer> carsSoldProfit = (HashMap<String, Integer>) getIntent().getSerializableExtra("PROFIT");

//        currentCar = (Cars) getIntent().getSerializableExtra("Current");
//
//        Intent intent = getIntent();
//        Bundle args = intent.getBundleExtra("BUNDLE");
//        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");
//
        TextView Cc = findViewById(R.id.CCompanyName2);
        Cc.setText(Cars.getCCompanyName());
        TextView Address = findViewById(R.id.companyAddress2);
        Address.setText(Cars.getCCompanyAddress());

        TextView carsSold = findViewById(R.id.CarsSold2);
        TextView profit = findViewById(R.id.Profit2);
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
                    case R.id.vehicleButton9:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        Intent.putExtra("Current", currentCar);
                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);

                        startActivity(Intent);
                        break;
                    case R.id.submit4:
                        EditText editCC = findViewById(R.id.CCName);
                        EditText editCA = findViewById(R.id.CCAddress);
                        String CCname = editCC.getText().toString();
                        String CCaddress = editCA.getText().toString();

                        Cc.setText(CCname);
                        Address.setText(CCaddress);
                        break;
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };

        Button Vehicles = findViewById(R.id.vehicleButton9);
        Button submit = findViewById(R.id.submit4);

        Vehicles.setOnClickListener(onClickListener);
        submit.setOnClickListener(onClickListener);
    }
}
