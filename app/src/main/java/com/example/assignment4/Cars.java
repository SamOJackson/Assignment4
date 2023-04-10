package com.example.assignment4;



import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Cars extends AppCompatActivity implements Serializable{
    private ArrayList<Cars> carArray = new ArrayList<>();

    private final String filename = "myfile";
    private int carId;
    private String carImageName;
    private String carCompany;
    private String carModel;


    private int cylinders;
    private int year;
    private float price;
    private String color;
    private Date sold;
    private boolean isAvailable;
    private String carName;
    public static Cars currentCar;
    private final String redCarImage = "![](../../../../res/drawable/redcar.png)";
    private final String yellowCarImage = "![](../../../../res/drawable/yellowcar.jpg)";
    private final String carsCarImage = "![](../../../../res/drawable/carscar.jpg)";

    public Cars() {
    }

    public Cars(String carCompany, int cylinders, int year, float price, boolean isAvailable, String carName) {
        this.carCompany = carCompany;
        this.cylinders = cylinders;
        this.year = year;
        this.price = price;
        this.isAvailable = isAvailable;
        this.carName = carName;
    }

    public Cars(int carId, String carImageName, String carCompany, String carModel, int cylinders, int year, float price, String color, Date sold, boolean isAvailable, String carName) {
        this.carId = carId;
        this.carImageName = carImageName;
        this.carCompany = carCompany;
        this.carModel = carModel;
        this.cylinders = cylinders;
        this.year = year;
        this.price = price;
        this.color = color;
        this.sold = sold;
        this.isAvailable = isAvailable;
        this.carName = carName;
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


    public String getCylinders() {
        String cylinders2 = String.valueOf(cylinders);
        return cylinders2;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getYear() {
        String year2 = String.valueOf(year);
        return year2;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrice() {
        String price2 = String.valueOf(price);
        return price2;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getSold() {
        return sold;
    }

    public void setSold(Date sold) {
        this.sold = sold;
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
        Cars car1 = new Cars("Red Car Company", 4, 2010, 10000, true, "Red Car");
        Cars car2 = new Cars("Yellow Car Company", 6, 2015, 20000, true, "Yellow Car");
        Cars car3 = new Cars("Cars Car Company", 8, 2020, 25000, true, "Cars Car");
        Cars car4 = new Cars("Red Car Company", 4, 2012, 3000, false, "Red Car");
        Cars car5 = new Cars("Yellow Car Company", 6, 2021, 35000, false, "Yellow Car");
        Cars car6 = new Cars("Cars Car Company", 8, 2022, 40000, false, "Cars Car");

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
