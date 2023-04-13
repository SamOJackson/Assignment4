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

public class MainActivity extends Cars {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Cars> carArray = (ArrayList<Cars>) args.getSerializable("ARRAYLIST");
        if((ArrayList<Cars>) args.getSerializable("ARRAYLIST") == null) {
            carArray = createArray();
        }

//        ArrayList<Cars> carArray2 = (ArrayList<Cars>) getIntent().getSerializableExtra("Array");
//        currentCar = (Cars) getIntent().getSerializableExtra("Current");
        HashMap<String, Integer> carsSoldProfit = new HashMap<>();

        carsSoldProfit.put("CarsSold", 0);
        carsSoldProfit.put("Profit", 0);

        Drawable drawable;
        ArrayList<Cars> finalCarArray = carArray;
//        for (Cars c: carArray) {
         for(int i = 0; i < 10; i ++ ) {
             try {
                 if (i == 0) {
                     ImageView vehicle1 = findViewById(R.id.Vehicles1);
//                    drawable = Drawable.createFromPath(carArray.get(i).getCarImageName());
//                    vehicle1.setImageDrawable(drawable);
                     if (finalCarArray.get(i).getCarName().contains("Red Car")) {
                         vehicle1.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains( "Yellow Car")) {
                         vehicle1.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains( "Cars Car")) {
                         vehicle1.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle1.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 1) {
                     ImageView vehicle2 = findViewById(R.id.Vehicles2);
                     if (finalCarArray.get(i).getCarName().contains("Red Car")) {
                         vehicle2.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle2.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
                         vehicle2.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle2.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 2) {
                     ImageView vehicle3 = findViewById(R.id.Vehicles3);
                     if (finalCarArray.get(i).getCarName().contains("Red Car")) {
                         vehicle3.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle3.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
                         vehicle3.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle3.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 3) {
                     ImageView vehicle4 = findViewById(R.id.Vehicles4);
                     if (finalCarArray.get(i).getCarName().contains( "Red Car")) {
                         vehicle4.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle4.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
                         vehicle4.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle4.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 4) {
                     ImageView vehicle5 = findViewById(R.id.Vehicles5);
                     if (finalCarArray.get(i).getCarName().contains( "Red Car")) {
                         vehicle5.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle5.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
                         vehicle5.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle5.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 5) {
                     ImageView vehicle6 = findViewById(R.id.Vehicles6);
                     if (finalCarArray.get(i).getCarName().contains("Red Car")) {
                         vehicle6.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle6.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
                         vehicle6.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle6.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 6) {
                     ImageView vehicle7 = findViewById(R.id.Vehicle7);
                     if (finalCarArray.get(i).getCarName().contains( "Red Car")) {
                         vehicle7.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains( "Yellow Car")) {
                         vehicle7.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains( "Cars Car")) {
                         vehicle7.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle7.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 7) {
                     ImageView vehicle8 = findViewById(R.id.Vehicle8);
                     if (finalCarArray.get(i).getCarName().contains("Red Car")) {
                         vehicle8.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle8.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
                         vehicle8.setImageResource(R.drawable.carscar);
                     } else{
                         vehicle8.setImageResource(R.drawable.unknown);
                     }
                 }
                 if (i == 8) {
                     ImageView vehicle9 = findViewById(R.id.Vehicle9);
                     if (finalCarArray.get(i).getCarName().contains("Red Car")) {
                         vehicle9.setImageResource(R.drawable.redcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Yellow Car")) {
                         vehicle9.setImageResource(R.drawable.yellowcar);
                     } else if (finalCarArray.get(i).getCarName().contains("Cars Car")) {
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

         View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();
                Intent Intent;
                Bundle args;
//                Snackbar.make(view, "Hello", Snackbar.LENGTH_LONG).show();
             //   try {
                    switch (selectedItemId) {
                        case R.id.VehicleButton:
                            Intent = new Intent(getApplicationContext(), MainActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
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
                            Intent.putExtra("Current", currentCar);
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
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
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
                        case R.id.CompanyLink:
                            Intent = new Intent(getApplicationContext(), CompanyView2.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);
                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);

                            startActivity(Intent);
                            break;
                        case R.id.NotInStock:
                            Intent = new Intent(getApplicationContext(), NotAvailableActivity.class);                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);

                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);

                            args = new Bundle();
                            args.putSerializable("ARRAYLIST",(Serializable) finalCarArray);
                            Intent.putExtra("BUNDLE",args);
                            startActivity(Intent);
                            break;

                        case R.id.inStock:
                            Intent = new Intent(getApplicationContext(), AvailableActivity.class);
                            Intent.putExtra("PROFIT",(Serializable) carsSoldProfit);
                            Intent.putExtra("Current", currentCar);

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
                //}catch (Exception e)
               // {
               //     Toast.makeText(getApplicationContext(),"Out of Bounds Exception", Toast.LENGTH_LONG).show();
               // }
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



        Button Company = findViewById(R.id.CompanyLink);
        Button InStock = findViewById(R.id.inStock);
        InStock.setOnClickListener(onClickListener);
        Button NotInStock = findViewById(R.id.NotInStock);


        NotInStock.setOnClickListener(onClickListener);


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
