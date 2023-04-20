package com.example.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TreeMap;

public class BuyActivity extends Cars {
//    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");
        HashMap<String, Integer> carsSoldProfit = (HashMap<String, Integer>) getIntent().getSerializableExtra("PROFIT");

//        for( int i = 0; i < carArray.size(); i++)
//        {
//            if(carArray.get(i).equals(currentCar)){
//                j = i;
//            }
//
//        }
        TextView textView = findViewById(R.id.totals2);
//        textView.setText(getTotal());
        textView.setText(currentCar.getPrice());
        TextView totalPrice = findViewById(R.id.totalPrice2);
        totalPrice.setText(currentCar.getPrice());
        TextView textView2 = findViewById(R.id.totalCarName);
        textView2.setText(currentCar.getCarName());
//        TextView totalAmount = findViewById(R.id.totalAmount);
//        TextView totalPrice = findViewById(R.id.totalPrice2);
////        totalAmount.0setText(getAmount());
//        totalPrice.setText(getPrice());

        int remove = carArray.indexOf(currentCar);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemIdM = view.getId();

                Intent Intent;
                Bundle args;
                switch (selectedItemIdM) {
                    case R.id.vehicleButton5:
                        Intent = new Intent(getApplicationContext(), MainActivity.class);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);
                        Intent.putExtra("Current", currentCar);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);

                        startActivity(Intent);
                        break;
                    case R.id.submit3:
                        Person person = submitting();

                        break;
                    case R.id.BackToView:

                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        Intent.putExtra("PROFIT", (Serializable) carsSoldProfit);
                        Intent.putExtra("Current", currentCar);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST", (Serializable) carArray);
                        Intent.putExtra("BUNDLE", args);
                        startActivity(Intent);
                        break;
                    case R.id.Pay:
                        Intent = new Intent(getApplicationContext(), ViewActivity.class);
                        try {
                            Cars.setCarsSold(Cars.getCarsSold() + getAmount());
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        try {
                            Cars.setProfit(Cars.getProfit() + getTotal());
                        } catch (Exception e){
                            System.out.println(e);
                        }
                        try {
                            currentCar.setIsAvailable(false);
                        }catch(Exception e) {
                            System.out.println(e);
                        }
                        try{
                            currentCar.setSold(String.valueOf(Calendar.DATE));
                        }catch(Exception e){
                            System.out.println(e);
                        }
//                        carArray.set(j, currentCar);

                        Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                        Intent.putExtra("Current", currentCar);

                        args = new Bundle();
                        args.putSerializable("ARRAYLIST",(Serializable) carArray);
                        Intent.putExtra("BUNDLE",args);
                        startActivity(Intent);
                        break;

                    default:
                        Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                }
            }
        };


        Button Vehicles2 = findViewById(R.id.vehicleButton5);
        Button Pay = findViewById(R.id.Pay);
        Button submit = findViewById(R.id.submit3);

        submit.setOnClickListener(onClickListener);
        Vehicles2.setOnClickListener(onClickListener);
        Pay.setOnClickListener(onClickListener);


    }

    private Person submitting() {
        EditText payName = findViewById(R.id.PersonName);
        EditText payAddress = findViewById(R.id.PersonAddress);
        EditText payCard = findViewById(R.id.Card);

        String pname = payName.getText().toString();
        String pAddress = payAddress.getText().toString();
        String pCard = payCard.getText().toString();

        Person person = new Person(pname, pAddress, pCard);

        return person;
    }
}