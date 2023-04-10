package com.example.assignment4;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import java.io.Serializable;
import java.util.ArrayList;

public class Cars extends AppCompatActivity implements Serializable{
    static ArrayList<Cars> carArray = new ArrayList<Cars>();
    private int carId;
    private String carImageName;
    private String carCompany;
    private boolean isAvailable;
    private String carName;
    public int vehicleId;
    public static Cars currentCar;

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
        this.vehicleId = vehicleId;
        if (this.carName == "Red Car") {
            carImageName = "/../../../../res/drawable/redcar.png";
        }
        if (this.carName == "Yellow Car") {
            carImageName = "/../../../../res/drawable/yellowcar.jpg";
        }
        if (this.carName == "Cars Car") {
            carImageName = "/../../../../res/drawable/carscar.jpg";
        }
    }


    public Cars(String carName, int carId, String carImageName, String carCompany) {
        this.carName = carName;
        this.carId = carId;
        this.carCompany = carCompany;
        if(this.carName == "Red Car") {
            carImageName = "/../../../../res/drawable/redcar.png";
        }
        if(this.carName == "Yellow Car"){
            carImageName =  "/../../../../res/drawable/yellowcar.jpg";
        }
        if(this.carName == "Cars Car") {
            carImageName = "/../../../../res/drawable/carscar.jpg";
        }
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
        if(this.carName == "Red Car") {
            carImageName = "/../../../../res/drawable/redcar.png";
        }
        if(this.carName == "Yellow Car"){
            carImageName =  "/../../../../res/drawable/yellowcar.jpg";
        }
        if(this.carName == "Cars Car") {
            carImageName = "/../../../../res/drawable/carscar.jpg";
        }
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarImageName(String carImageName) {

        if(this.carName == "Red Car") {
            carImageName = "/../../../../res/drawable/redcar.png/";
        }
        if(this.carName == "Yellow Car"){
           carImageName =  "/../../../../res/drawable/yellowcar.jpg/";
        }
        if(this.carName == "Cars Car"){
//            ImageView carscar = findViewById(R.id.yellowcar2);
//            Drawable carscardrawable = carscar.;
//            this.carImageName = carscardrawable;
            carImageName = "/../../../../res/drawable/carscar.jpg/";
        }
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
    public void createArray() {

        carArray = new ArrayList<Cars>();
        Cars car1 = new Cars("Red Car", "Red Car Company", true);
        Cars car2 = new Cars("Yellow Car", "Yellow Car Company", true);
        Cars car3 = new Cars("Cars Car", "Cars Car Company", true);
        Cars car4 = new Cars("Redder Car","Redder Car Company", false);
        Cars car5 = new Cars("Yellower Car", "Yellower Car Company", false);
        Cars car6 = new Cars("Cars'er Car", "Carser Car Company", false);

        carArray.add(car1);
        carArray.add(car2);
        carArray.add(car3);
        carArray.add(car4);
        carArray.add(car5);
        carArray.add(car6);
    }
    public static ArrayList<Cars> getArray(){
        return carArray;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createArray();
    }

}
