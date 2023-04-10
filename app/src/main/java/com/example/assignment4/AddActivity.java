package com.example.assignment4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;


import java.util.ArrayList;


public class AddActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        ArrayList<Cars> carArray = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdA = view.getId();

                EditText addText = findViewById(R.id.carName2);
                EditText addCompany = findViewById(R.id.carCompany2);
                CheckBox simpleCheckBox2 = (CheckBox) findViewById(R.id.available3);
                Button submit = (Button) findViewById(R.id.submit2);
                Intent Intent;
                switch (selectedItemIdA) {
                    case R.id.vehicleButton3:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.add2:
                        Intent = new Intent(getApplicationContext(), AddActivity.class);
                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                        break;
                    case R.id.modify:
                        Intent = new Intent(getApplicationContext(), ModifyActivity.class);
                        startActivity(Intent);
                        Intent.putExtra("Current", currentCar);

                        startActivity(Intent);
                        break;
                    case R.id.submit2:
                        currentCar = Submitting();
                        carArray.add(currentCar);
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Current", currentCar);
                        startActivity(Intent);
                        break;
                    case R.id.backToView:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Current", currentCar);
                        startActivity(Intent);
                        break;
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }

        };
        Button Vehicles3 = findViewById(R.id.vehicleButton3);
        Button Add3 = findViewById(R.id.add2);
        Button Modify3 = findViewById(R.id.modify);
        Button View2 = findViewById(R.id.backToView);


        View2.setOnClickListener(onClickListener);

        Vehicles3.setOnClickListener(onClickListener);
        Add3.setOnClickListener(onClickListener);
        Modify3.setOnClickListener(onClickListener);

        currentCar = carArray.get(carArray.size());
    }

    private Cars Submitting() {
        EditText addText = findViewById(R.id.carName2);
        EditText addCompany = findViewById(R.id.carCompany2);
        CheckBox simpleCheckBox2 = (CheckBox) findViewById(R.id.available3);
        Button submit = (Button) findViewById(R.id.submit2);


        String carName = addText.getText().toString();
        String carCompany = addCompany.getText().toString();

        boolean checkedBoxState = simpleCheckBox2.isChecked();
        boolean available;
        if (checkedBoxState) {
            available = true;
        } else {
            available = false;
        }
        Cars addCar = new Cars(carName, carCompany, available);
        currentCar = addCar;
        return currentCar;

    }
}