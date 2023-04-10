package com.example.assignment4;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import java.io.Serializable;
import java.util.ArrayList;

public class Cars extends AppCompatActivity implements Serializable{
    private ArrayList<Cars> carArray = new ArrayList<>();
    private int carId;
    private String carImageName;
    private String carCompany;
    private boolean isAvailable;
    private String carName;
    public int vehicleId;
    public static Cars currentCar;
    private final String redCarImage = "![](../../../../res/drawable/redcar.png)";
    private final String yellowCarImage = "![](../../../../res/drawable/yellowcar.jpg)";
    private final String carsCarImage = "![](../../../../res/drawable/carscar.jpg)";
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Cars() {
    }


    public Cars(String carName, String carCompany, boolean isAvailable) {
        this.carName = carName;
        this.carCompany = carCompany;
        if (carName.equals("Red Car")) {
            carImageName = redCarImage;
        }
        if (carName.equals("Yellow Car")) {
            carImageName = yellowCarImage;
        }
        if (carName.equals("Cars Car")) {
            carImageName = carsCarImage;
        }
        if(carName.equals("Redder Car")) {
            carImageName = redCarImage;
        }
        if(carName.equals("Yellower Car")){
            carImageName = yellowCarImage;
        }
        if(carName.equals("Carser Car")){
//            ImageView carscar = findViewById(R.id.yellowcar2);
//            Drawable carscardrawable = carscar.;
//            this.carImageName = carscardrawable;
//            carImageName = "/../../../../res/drawable/carscar.jpg/";
            carImageName = redCarImage;
        }
    }


    public Cars(String carName, int carId, String carImageName, String carCompany) {
        this.carName = carName;
        this.carId = carId;
        this.carCompany = carCompany;
        if (carName.equals("Red Car")) {
            carImageName = redCarImage;
        }
        if (carName.equals("Yellow Car")) {
            carImageName = yellowCarImage;
        }
        if (carName.equals("Cars Car")) {
            carImageName = carsCarImage;
        }
        if(carName.equals("Redder Car")) {
            carImageName = redCarImage;
        }
        if(carName.equals("Yellower Car")){
            carImageName = yellowCarImage;
        }
        if(carName.equals("Carser Car")){
//            ImageView carscar = findViewById(R.id.yellowcar2);
//            Drawable carscardrawable = carscar.;
//            this.carImageName = carscardrawable;
//            carImageName = "/../../../../res/drawable/carscar.jpg/";
            carImageName = redCarImage;
        }
        this.carImageName = carImageName;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarImageName() {
        return carImageName;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }


    public Cars(String carName, int carId, String carImageName, String carCompany, boolean isAvailable) {
        this.carName = carName;
        this.carId = carId;
        this.carCompany = carCompany;
        this.isAvailable = isAvailable;
//        if(carName.equals("Red Car")) {
//            carImageName = "/../../../../res/drawable/redcar.png";
//        }
//        if(carName.equals("Yellow Car")){
//            carImageName =  "/../../../../res/drawable/yellowcar.jpg";
//        }
//        if(carName.equals("Cars Car")) {
//            carImageName = "/../../../../res/drawable/carscar.jpg";
//        }
//        if(carName.equals("Redder Car")) {
//            carImageName = "/../../../../res/drawable/redcar.png/";
//        }
//        if(carName.equals("Yellower Car")){
//            carImageName =  "/../../../../res/drawable/yellowcar.jpg/";
//        }
//        if(carName.equals("Carser Car")){
////            ImageView carscar = findViewById(R.id.yellowcar2);
////            Drawable carscardrawable = carscar.;
////            this.carImageName = carscardrawable;
//            carImageName = "/../../../../res/drawable/carscar.jpg/";
//        }
        if (carName.equals("Red Car")) {
            carImageName = redCarImage;
        }
        if (carName.equals("Yellow Car")) {
            carImageName = yellowCarImage;
        }
        if (carName.equals("Cars Car")) {
            carImageName = carsCarImage;
        }
        if(carName.equals("Redder Car")) {
            carImageName = redCarImage;
        }
        if(carName.equals("Yellower Car")){
            carImageName = yellowCarImage;
        }
        if(carName.equals("Carser Car")){
//            ImageView carscar = findViewById(R.id.yellowcar2);
//            Drawable carscardrawable = carscar.;
//            this.carImageName = carscardrawable;
//            carImageName = "/../../../../res/drawable/carscar.jpg/";
            carImageName = redCarImage;
        }
        this.carImageName = carImageName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarImageName(String carName) {

        if (carName.equals("Red Car")) {
            carImageName = redCarImage;
        }
        if (carName.equals("Yellow Car")) {
            carImageName = yellowCarImage;
        }
        if (carName.equals("Cars Car")) {
            carImageName = carsCarImage;
        }
        if(carName.equals("Redder Car")) {
            carImageName = redCarImage;
        }
        if(carName.equals("Yellower Car")){
            carImageName = yellowCarImage;
        }
        if(carName.equals("Carser Car")){
//            ImageView carscar = findViewById(R.id.yellowcar2);
//            Drawable carscardrawable = carscar.;
//            this.carImageName = carscardrawable;
//            carImageName = "/../../../../res/drawable/carscar.jpg/";
            carImageName = redCarImage;
        }
        this.carImageName = carImageName;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void addCar(Cars car) {
        carArray.add(car);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }
    public ArrayList<Cars> createArray() {

        carArray = new ArrayList<>();
        Cars car1 = new Cars("Red Car", "Red Car Company", true);
        Cars car2 = new Cars("Yellow Car", "Yellow Car Company", true);
        Cars car3 = new Cars("Cars Car", "Cars Car Company", true);
        Cars car4 = new Cars("Redder Car","Redder Car Company", false);
        Cars car5 = new Cars("Yellower Car", "Yellower Car Company", false);
        Cars car6 = new Cars("Carser Car", "Carser Car Company", false);

        carArray.add(car1);
        carArray.add(car2);
        carArray.add(car3);
        carArray.add(car4);
        carArray.add(car5);
        carArray.add(car6);

        return carArray;
    }
    public ArrayList<Cars> getArray(){
        return carArray;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        createArray();
//        Intent intent;
//
//        intent = new Intent(getApplicationContext(), getClass());
//        intent.putExtra("Array", carArray);
//        startActivity(intent);
    }

}
