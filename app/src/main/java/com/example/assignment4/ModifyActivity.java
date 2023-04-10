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

public class ModifyActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");

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

                int selectedItemId = view.getId();

                EditText editText = findViewById(R.id.CarName);
                EditText editCompany = findViewById(R.id.CarCompany);
                CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.available);
                Button submit = (Button) findViewById(R.id.submit);

                switch (selectedItemId) {
                    case R.id.vehicleButton2:
                        Intent Intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.Add2:
                        Intent = new Intent(getApplicationContext(), AddActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.Modify2:
                        Intent = new Intent(getApplicationContext(), ModifyActivity.class);
                        startActivity(Intent);
                        break;
                    case R.id.submit:
                        if (editText.getText().toString().isEmpty() || editCompany.getText().toString().isEmpty()) {
                            Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();
                        } else {
                            currentCar.setCarName(editText.getText().toString());
                            currentCar.setCarCompany(editCompany.getText().toString());
                            Boolean checkBoxState = simpleCheckBox.isChecked();
                            if(checkBoxState){
                                currentCar.setIsAvailable(true);
                            }else{
                                currentCar.setIsAvailable(false);
                            }
                        }
                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };


        Button Vehicles2 = findViewById(R.id.vehicleButton2);
        Button Add2 = findViewById(R.id.Add2);
        Button Modify2 = findViewById(R.id.Modify2);

        Vehicles2.setOnClickListener(onClickListener);
        Add2.setOnClickListener(onClickListener);
        Modify2.setOnClickListener(onClickListener);

    }
}