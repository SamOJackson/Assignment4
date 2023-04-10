package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AddActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        ArrayList<Cars> carArray = getArray();
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();

                EditText addText = findViewById(R.id.carName2);
                EditText addCompany = findViewById(R.id.carCompany2);
                CheckBox simpleCheckBox2 = (CheckBox) findViewById(R.id.available3);
                Button submit = (Button) findViewById(R.id.submit2);

                switch (selectedItemId) {
                    case R.id.vehicleButton3:
                        Intent Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.add2:
                        Intent = new Intent(getApplicationContext(), AddActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.modify:
                        Intent = new Intent(getApplicationContext(), ModifyActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.submit2:

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
                        Boolean checkBoxState = simpleCheckBox2.isChecked();
                        currentCar = addCar;
                        carArray.add(addCar);
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }

        };
            Button Vehicles3 = findViewById(R.id.vehicleButton3);
            Button Add3 = findViewById(R.id.add2);
            Button Modify3 = findViewById(R.id.modify);

            Vehicles3.setOnClickListener(onClickListener);
            Add3.setOnClickListener(onClickListener);
            Modify3.setOnClickListener(onClickListener);
    }
}