package com.example.assignment4;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class NotAvailableActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_available);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        ArrayList<Cars> carArray;
        HashMap<String, Integer> carsSoldProfit = new HashMap<>();

        carsSoldProfit.put("CarsSold", 0);
        carsSoldProfit.put("Profit", 0);

        Drawable drawable;
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");

      //  ArrayList<Cars> carArray = carArray;
//        for (Cars c: carArray) {
        for(int i = 0; i < 10; i ++ ) {
            try {
                if (i == 0 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle1 = findViewById(R.id.Image1);
//                    drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
//                    vehicle1.setImageDrawable(drawable);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle1.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle1.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle1.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle1.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 1 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle2 = findViewById(R.id.Image2);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle2.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle2.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle2.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle2.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 2 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle3 = findViewById(R.id.Image3);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle3.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle3.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle3.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle3.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 3 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle4 = findViewById(R.id.Image4);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle4.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle4.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle4.setImageResource(R.drawable.carscar);
                    } else {
                        vehicle4.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 4 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle5 = findViewById(R.id.Image5);
                    if (carArray.get(i).getCarName().contains( "Red Car")) {
                        vehicle5.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle5.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle5.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle5.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 5 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle6 = findViewById(R.id.Image6);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle6.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle6.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle6.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle6.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 6 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle7 = findViewById(R.id.Image7);
                    if (carArray.get(i).getCarName().contains( "Red Car")) {
                        vehicle7.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains( "Yellow Car")) {
                        vehicle7.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains( "Cars Car")) {
                        vehicle7.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle7.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 7 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle8 = findViewById(R.id.Image8);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle8.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle8.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle8.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle8.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 8 && !carArray.get(i).getIsAvailable()) {
                    ImageView vehicle9 = findViewById(R.id.Image9);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle9.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle9.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle9.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle9.setImageResource(R.drawable.unknown);
                    }
                }
            }catch(Exception e)
            {
                System.out.println("Out of bounds Exception");
            }
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();
                Intent Intent;
                Bundle args;
//                Snackbar.make(view, "", Snackbar.LENGTH_LONG).show();
                try {
                    switch (selectedItemId) {
                        case R.id.vehicleButton8:
                            Intent = new Intent(getApplicationContext(), MainActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);

                            break;
                        case R.id.Image1:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 1);
                            currentCar = carArray.get(0);
                            Intent.putExtra("Current", currentCar);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image2:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 2);
                            currentCar = carArray.get(1);
                            Intent.putExtra("Current", currentCar);
                            //                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image3:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 3);
                            currentCar = carArray.get(2);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image4:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 4);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            currentCar = carArray.get(3);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image5:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 5);
                            currentCar = carArray.get(4);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image6:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 6);
                            currentCar = carArray.get(5);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image7:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 7);
                            currentCar = carArray.get(6);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image8:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 8);
                            currentCar = carArray.get(7);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Image9:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 9);
                            currentCar = carArray.get(8);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.companyLink2:
                            Intent = new Intent(getApplicationContext(), CompanyView2.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.NotInStock3:
                            Intent = new Intent(getApplicationContext(), NotAvailableActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.inStock3:
                            Intent = new Intent(getApplicationContext(), AvailableActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        default:
//                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 1);
//                            currentCar = carArray.get(0);
//                            Intent.putExtra("Current", currentCar);
////                            Intent.putExtra("Array", carArray);
//                            args = new Bundle();
//                            args.putSerializable("ARRAYLIST",(Serializable) carArray);
//                            Intent.putExtra("BUNDLE",args);
//                            startActivity(Intent);
                            Snackbar.make(view, "unknown item selected", Snackbar.LENGTH_LONG).show();
                    }
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Out of Bounds Exception", Toast.LENGTH_LONG).show();
                }
            }
        };

        ImageView View1 = findViewById(R.id.Image1);
        ImageView View2 = findViewById(R.id.Image2) ;
        ImageView View3 = findViewById(R.id.Image3);
        ImageView View4 = findViewById(R.id.Image4);
        ImageView View5 = findViewById(R.id.Image5);
        ImageView View6 = findViewById(R.id.Image6);
        ImageView View7 = findViewById(R.id.Image7);
        ImageView View8 = findViewById(R.id.Image8);
        ImageView View9 = findViewById(R.id.Image9);

        Button Company = findViewById(R.id.companyLink2);
        Button VehicleButton = findViewById(R.id.vehicleButton8);
        Button NotInStock = findViewById(R.id.NotInStock3);
        Button InStock = findViewById(R.id.inStock3);

        VehicleButton.setOnClickListener(onClickListener);
        NotInStock.setOnClickListener(onClickListener);
        InStock.setOnClickListener(onClickListener);
        Company.setOnClickListener(onClickListener);

        View1.setOnClickListener(onClickListener);
        View2.setOnClickListener(onClickListener);
        View3.setOnClickListener(onClickListener);
        View4.setOnClickListener(onClickListener);
        View5.setOnClickListener(onClickListener);
        View6.setOnClickListener(onClickListener);
        View7.setOnClickListener(onClickListener);
        View8.setOnClickListener(onClickListener);
        View9.setOnClickListener(onClickListener);
    }
}
