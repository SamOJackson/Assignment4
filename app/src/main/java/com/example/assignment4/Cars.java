package com.example.assignment4;

import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import java.nio.file.Path;
import java.util.ArrayList;

public class Cars extends AppCompatActivity {
    static ArrayList<Cars> carArray = new ArrayList<Cars>();
    private int carId;
    private String carImageName;
    private String carCompany;
    private boolean isAvailable;
    private String carName;
    public static int vehicleId;
    String redCarPath = "/./././res/drawable/redcar.png";
    String yellowCarPath = "/./././res/drawable/yellowcar.jpg";
    String carsCarPath = "/./././res/drawable/carscar.jpg";

    public Cars() {
    }


    public Cars(String carName, String carImageName, String carCompany) {
        this.carName = carName;
        this.carImageName = carImageName;
        this.carCompany = carCompany;
    }


    public Cars(String carName, int carId, String carImageName, String carCompany) {
        this.carName = carName;
        this.carId = carId;
        this.carImageName = carImageName;
        this.carCompany = carCompany;
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
        this.carImageName = carImageName;
        this.carCompany = carCompany;
        this.isAvailable = isAvailable;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarImageName(String carImageName) {
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
    public void createArray() {
        carArray = new ArrayList<Cars>();
        Cars car1 = new Cars("Red Car", "/./././res/drawable/redcar.png", "Red Car Company");
        Cars car2 = new Cars("Yellow Car", "/./././res/drawable/yellowcar.jpg", "Yellow Car Company");
        Cars car3 = new Cars("Cars Car", "/./././res/drawable/yellowcar.jpg", "Cars Car Company");
        Cars car4 = new Cars("Redder Car", "/./././res/drawable/redcar.png", "Redder Car Company");
        Cars car5 = new Cars("Yellower Car", "/./././res/drawable/yellowcar.jpg", "Yellower Car Company");
        Cars car6 = new Cars("Carser Car", "/./././res/drawable/yellowcar.jpg", "Carser Car Company");

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
}
