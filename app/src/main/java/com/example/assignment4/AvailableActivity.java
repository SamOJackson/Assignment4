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

public class AvailableActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);

        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        ArrayList<Cars> carArray;
        HashMap<String, Integer> carsSoldProfit = new HashMap<>();

        carsSoldProfit.put("CarsSold", 0);
        carsSoldProfit.put("Profit", 0);

        Drawable drawable;
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");

//        if(!(args == null)) {
//            carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");
//        }
//        for (Cars c: carArray) {
        for(int i = 0; i < carArray.size(); i ++ ) {
            try {
                if (i == 0 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle1 = findViewById(R.id.Vehicles1);
//                    drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
//                    vehicle1.setImageDrawable(drawable);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle1.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains( "Yellow Car")) {
                        vehicle1.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains( "Cars Car")) {
                        vehicle1.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle1.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 1 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle2 = findViewById(R.id.Vehicles2);
                    if (carArray.get(i).getCarName().contains("Red Car")) {
                        vehicle2.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle2.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle2.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle2.setImageResource(R.drawable.unknown);
                    }}
                if (i == 2 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle3 = findViewById(R.id.Vehicles3);
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
                if (i == 3 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle4 = findViewById(R.id.Vehicles4);
                    if (carArray.get(i).getCarName().contains( "Red Car")) {
                        vehicle4.setImageResource(R.drawable.redcar);
                    } else if (carArray.get(i).getCarName().contains("Yellow Car")) {
                        vehicle4.setImageResource(R.drawable.yellowcar);
                    } else if (carArray.get(i).getCarName().contains("Cars Car")) {
                        vehicle4.setImageResource(R.drawable.carscar);
                    } else{
                        vehicle4.setImageResource(R.drawable.unknown);
                    }
                }
                if (i == 4 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle5 = findViewById(R.id.Vehicles5);
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
                if (i == 5 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle6 = findViewById(R.id.Vehicles6);
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
                if (i == 6 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle7 = findViewById(R.id.Vehicle7);
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
                if (i == 7 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle8 = findViewById(R.id.Vehicle8);
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
                if (i == 8 && carArray.get(i).getIsAvailable()) {
                    ImageView vehicle9 = findViewById(R.id.Vehicle9);
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
                Toast.makeText(getApplicationContext(),"Out of Bounds Exception", Toast.LENGTH_LONG).show();
            }
        }

        ArrayList<Cars> finalCarArray = carArray;
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();
                Intent Intent;
                Bundle args;
                Snackbar.make(view, "Hello", Snackbar.LENGTH_LONG).show();
                try {
                    switch (selectedItemId) {
                        case R.id.vehicleButton7:
                            Intent = new Intent(getApplicationContext(), MainActivity.class);

                            startActivity(Intent);

                            break;
                        case R.id.Vehicles1:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 1);
                            currentCar = finalCarArray.get(0);
                            Intent.putExtra("Current", currentCar);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicles2:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 2);
                            currentCar = finalCarArray.get(1);
                            Intent.putExtra("Current", currentCar);
                            //                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicles3:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 3);
                            currentCar = finalCarArray.get(2);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicles4:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 4);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            currentCar = finalCarArray.get(3);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicles5:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 5);
                            currentCar = finalCarArray.get(4);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicles6:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 6);
                            currentCar = finalCarArray.get(5);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicle7:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 7);
                            currentCar = finalCarArray.get(6);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicle8:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 8);
                            currentCar = finalCarArray.get(7);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.Vehicle9:
                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 9);
                            currentCar = finalCarArray.get(8);
//                            Intent.putExtra("Array", carArray);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.companyLink:
                            Intent = new Intent(getApplicationContext(), CompanyView.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            startActivity(Intent);
                            break;
                        case R.id.NotInStock2:
                            Intent = new Intent(getApplicationContext(), NotAvailableActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.inStock2:
                            Intent = new Intent(getApplicationContext(), AvailableActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        default:
//                            Intent = new Intent(getApplicationContext(), ViewActivity.class);
//                            Intent.putExtra("Id", 1);
//                            currentCar = finalCarArray.get(0);
//                            Intent.putExtra("Current", currentCar);
////                            Intent.putExtra("Array", carArray);
//                            args = new Bundle();
//                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
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

        ImageView View1 = findViewById(R.id.Vehicles1);
        ImageView View2 = findViewById(R.id.Vehicles2);
        ImageView View3 = findViewById(R.id.Vehicles3);
        ImageView View4 = findViewById(R.id.Vehicles4);
        ImageView View5 = findViewById(R.id.Vehicles5);
        ImageView View6 = findViewById(R.id.Vehicles6);
        ImageView View7 = findViewById(R.id.Vehicle7);
        ImageView View8 = findViewById(R.id.Vehicle8);
        ImageView View9 = findViewById(R.id.Vehicle9);

        Button Company = findViewById(R.id.companyLink);
        Button VehicleButton = findViewById(R.id.vehicleButton7);
        Button NotInStock = findViewById(R.id.NotInStock2);
        Button InStock = findViewById(R.id.inStock2);

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