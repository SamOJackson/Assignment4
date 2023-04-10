package com.example.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ModifyActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        ArrayList<Cars> carArray = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");


        TextView textView = findViewById(R.id.CurrentName);
        textView.setText(currentCar.getCarName());
        TextView textView2 = findViewById(R.id.available2);
        String text;
        if (!currentCar.getIsAvailable()) {
            text = "Unavailable";
        } else {
            text = "Available";
        }
        textView2.setText(text);
        TextView details = findViewById(R.id.CurrentCompany2);
        details.setText(currentCar.getCarCompany());

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdM = view.getId();

                Intent Intent;
                switch (selectedItemIdM) {
                    case R.id.vehicleButton2:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.Add2:
                        Intent = new Intent(getApplicationContext(), AddActivity.class);
                        Intent.putExtra("Array", carArray);
                        startActivity(Intent);
                        break;
                    case R.id.Modify2:
                        Intent = new Intent(getApplicationContext(), ModifyActivity.class);
                        Intent.putExtra("Current", currentCar);
                        startActivity(Intent);
                        break;
                    case R.id.submit:
                        carArray.set(carArray.indexOf(currentCar), submitting());
                        break;
                    case R.id.BackToView:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("Current", currentCar);
                        Intent.putExtra("Array", carArray);
                        startActivity(Intent);
                        break;
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };


        Button Vehicles2 = findViewById(R.id.vehicleButton2);
        Button Add2 = findViewById(R.id.Add2);
        Button Modify2 = findViewById(R.id.Modify2);
        Button View2 = findViewById(R.id.BackToView);

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(onClickListener);

        View2.setOnClickListener(onClickListener);
        Vehicles2.setOnClickListener(onClickListener);
        Add2.setOnClickListener(onClickListener);
        Modify2.setOnClickListener(onClickListener);


    }


    private Cars submitting() {
        EditText editText = findViewById(R.id.CarName);
        EditText editCompany = findViewById(R.id.CarCompany);
        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.available);

        String cname = editText.getText().toString();
        String cmp = editCompany.getText().toString();
        currentCar.setCarName(cname);
        currentCar.setCarCompany(cmp);
        boolean check = simpleCheckBox.isChecked();

        Cars newCar = new Cars(cname, cmp, check);

        Button submit = (Button) findViewById(R.id.submit);

        TextView textView = findViewById(R.id.CurrentName);
        textView.setText(currentCar.getCarName());
        TextView textView2 = findViewById(R.id.available2);
        String text;
        if (!currentCar.getIsAvailable()) {
            text = "Unavailable";
        } else {
            text = "Available";
        }
        textView2.setText(text);
        TextView details = findViewById(R.id.CurrentCompany2);
        details.setText(currentCar.getCarCompany());

        Boolean checkBoxState = simpleCheckBox.isChecked();
        if (checkBoxState) {
            currentCar.setIsAvailable(true);
        } else {
            currentCar.setIsAvailable(false);
        }
        return newCar;
    }
}
