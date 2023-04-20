package com.example.assignment4;



import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
//

public class Cars extends AppCompatActivity implements Serializable{
    protected int getCarName;
    private ArrayList<Cars> carArray = new ArrayList<>();

//    private final String filename = "myfile";
    private static String CCompanyName ="Assignment 3: Coding Cars";
    private static String CCompanyAddress ="9 Main Street, Barrie, L4N 18R, ON, CA";
    private int carId;
    private String carImageName;
    private String carCompany;
    private String carModel;

    private static int profit = 0;

    private static int carsSold = 0;

    private static int total;
    private static int amount;
    private int cylinders;
    private int year;
    private int price;
    private String color;
    private String sold;
    private boolean isAvailable;
    private String carName;
    public static Cars currentCar;
//    private final String redCarImage = "![](../../../../res/drawable/redcar.png)";
//    private final String yellowCarImage = "![](../../../../res/drawable/yellowcar.jpg)";
//    private final String carsCarImage = "![](../../../../res/drawable/carscar.jpg)";

    public Cars() {
    }

    public Cars(String carCompany, String carModel, int cylinders, int year, int price, String color, String sold, boolean isAvailable, String carName) {
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

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel (String carModel) throws Exception {
        if (carModel == null) {
            throw new Exception("Cannot be null");
        }
            this.carModel = carModel;
    }

    public static String getCCompanyName() {
        return CCompanyName;
    }

    public static void setCCompanyName(String CCompanyName2) throws Exception{
        if (CCompanyName == null) {
            throw new Exception("Cannot be null");
        }CCompanyName = CCompanyName2;
    }

    public static String getCCompanyAddress() {
        return CCompanyAddress;
    }

    public static void setCCompanyAddress(String CCompanyAddress2) throws Exception {
        if(CCompanyAddress2 == null)
        {
            throw new Exception("Cannot be null");
        }
        CCompanyAddress = CCompanyAddress2;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) throws Exception {
        if(total < 0)
        {
            throw new Exception("Cannot be less than 0");
        }
        Cars.total = total;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount)throws Exception {
        if(amount < 0)
        {
            throw new Exception("Cannot be less than 0");
        }
        Cars.amount = amount;
    }

    public Cars(String carCompany, int cylinders, int year, int price, boolean isAvailable, String carName) {
        this.carCompany = carCompany;
        this.cylinders = cylinders;
        this.year = year;
        this.price = price;
        this.isAvailable = isAvailable;
        this.carName = carName;
    }

    public Cars(int carId, String carImageName, String carCompany, String carModel, int cylinders, int year, int price, String color, String sold, boolean isAvailable, String carName) {
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
//        if (carName.equals("Red Car")) {
//            carImageName = redCarImage;
//        }
//        if (carName.equals("Yellow Car")) {
//            carImageName = yellowCarImage;
//        }
//        if (carName.equals("Cars Car")) {
//            carImageName = carsCarImage;
//        }
//        if(carName.equals("Redder Car")) {
//            carImageName = redCarImage;
//        }
//        if(carName.equals("Yellower Car")){
//            carImageName = yellowCarImage;
//        }
//        if(carName.equals("Carser Car")){
////            ImageView carscar = findViewById(R.id.yellowcar2);
////            Drawable carscardrawable = carscar.;
////            this.carImageName = carscardrawable;
////            carImageName = "/../../../../res/drawable/carscar.jpg/";
//            carImageName = redCarImage;
//        }
    }


    public Cars(String carName, int carId, String carImageName, String carCompany) {
        this.carName = carName;
        this.carId = carId;
        this.carCompany = carCompany;
//        if (carName.equals("Red Car")) {
//            carImageName = redCarImage;
//        }
//        if (carName.equals("Yellow Car")) {
//            carImageName = yellowCarImage;
//        }
//        if (carName.equals("Cars Car")) {
//            carImageName = carsCarImage;
//        }
//        if(carName.equals("Redder Car")) {
//            carImageName = redCarImage;
//        }
//        if(carName.equals("Yellower Car")){
//            carImageName = yellowCarImage;
//        }
//        if(carName.equals("Carser Car")){
////            ImageView carscar = findViewById(R.id.yellowcar2);
////            Drawable carscardrawable = carscar.;
////            this.carImageName = carscardrawable;
////            carImageName = "/../../../../res/drawable/carscar.jpg/";
//            carImageName = redCarImage;
//        }
//        this.carImageName = carImageName;
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
////        if(carName.equals("Red Car")) {
////            carImageName = "/../../../../res/drawable/redcar.png";
////        }
////        if(carName.equals("Yellow Car")){
////            carImageName =  "/../../../../res/drawable/yellowcar.jpg";
////        }
////        if(carName.equals("Cars Car")) {
////            carImageName = "/../../../../res/drawable/carscar.jpg";
////        }
////        if(carName.equals("Redder Car")) {
////            carImageName = "/../../../../res/drawable/redcar.png/";
////        }
////        if(carName.equals("Yellower Car")){
////            carImageName =  "/../../../../res/drawable/yellowcar.jpg/";
////        }
////        if(carName.equals("Carser Car")){
//////            ImageView carscar = findViewById(R.id.yellowcar2);
//////            Drawable carscardrawable = carscar.;
//////            this.carImageName = carscardrawable;
////            carImageName = "/../../../../res/drawable/carscar.jpg/";
////        }
//        if (carName.equals("Red Car")) {
//            carImageName = redCarImage;
//        }
//        if (carName.equals("Yellow Car")) {
//            carImageName = yellowCarImage;
//        }
//        if (carName.equals("Cars Car")) {
//            carImageName = carsCarImage;
//        }
//        if(carName.equals("Redder Car")) {
//            carImageName = redCarImage;
//        }
//        if(carName.equals("Yellower Car")){
//            carImageName = yellowCarImage;
//        }
//        if(carName.equals("Carser Car")){
////            ImageView carscar = findViewById(R.id.yellowcar2);
////            Drawable carscardrawable = carscar.;
////            this.carImageName = carscardrawable;
////            carImageName = "/../../../../res/drawable/carscar.jpg/";
//            carImageName = redCarImage;
//        }
//        this.carImageName = carImageName;
    }

    public void setCarName(String carName) throws Exception {
        if(carName == null)
        {
            throw new Exception("Cannot be null");
        }
        this.carName = carName;
    }

    public void setCarId(int carId) throws Exception {
        if(carId < 0)
        {
            throw new Exception("Cannot be less than 0");
        }this.carId = carId;
    }

//    public void setCarImageName(String carName) {
//
//        if (carName.equals("Red Car")) {
//            carImageName = redCarImage;
//        }
//        if (carName.equals("Yellow Car")) {
//            carImageName = yellowCarImage;
//        }
//        if (carName.equals("Cars Car")) {
//            carImageName = carsCarImage;
//        }
//        if(carName.equals("Redder Car")) {
//            carImageName = redCarImage;
//        }
//        if(carName.equals("Yellower Car")){
//            carImageName = yellowCarImage;
//        }
//        if(carName.equals("Carser Car")){
////            ImageView carscar = findViewById(R.id.yellowcar2);
////            Drawable carscardrawable = carscar.;
////            this.carImageName = carscardrawable;
////            carImageName = "/../../../../res/drawable/carscar.jpg/";
//            carImageName = redCarImage;
//        }
//        this.carImageName = carImageName;
//    }

    public void setCarCompany(String carCompany) throws Exception {
            if(carCompany == null)
            {
                throw new Exception("Cannot be null");
            }
            this.carCompany = carCompany;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public String getCylinders() {
        String cylinders2 = String.valueOf(cylinders);
        return cylinders2;
    }

    public void setCylinders(int cylinders) throws Exception {
        if(cylinders < 0)
        {
            throw new Exception("Cannot be less than 0");
        }
        this.cylinders = cylinders;
    }

    public String getYear() {
        String year2 = String.valueOf(year);
        return year2;
    }

    public void setYear(int year) throws Exception {
        if(year < 1900)
        {
            throw new Exception("Cannot be less than 0");
        }
        this.year = year;
    }

    public String getPrice() {
        String price2 = String.valueOf(price);
        return price2;
    }

    public int getPrice2(){
        return (int) price;
    }

    public void setPrice(int price) throws Exception {
        if(price < 0)
        {
            throw new Exception("Cannot be less than 0");
        }
        this.price = price;
    }

    public static int getProfit() {
        return profit;
    }

    public static void setProfit(int profit2) {
        profit = profit2;
    }

    public static int getCarsSold() {
        return carsSold;
    }

    public static void setCarsSold(int carsSold2) throws Exception {
        if(carsSold2 < 0)
        {
            throw new Exception("Cannot be less than 0");
        }
        carsSold = carsSold2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws Exception {
        if(color == null)
        {
            throw new Exception("Cannot be null");
        }
        this.color = color;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold)
            throws Exception {
        if(sold == null)
        {
            throw new Exception("Cannot be less null");
        }
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
//        Cars car1 = new Cars("Red Car Company", 4, 2010, 10000, true, "Red Car");
//        Cars car2 = new Cars("Yellow Car Company", 6, 2015, 20000, true, "Yellow Car");
//        Cars car3 = new Cars("Cars Car Company", 8, 2020, 25000, false, "Cars Car");
//        Cars car4 = new Cars("Red Car Company", 4, 2012, 3000, true, "Red Car");
//        Cars car5 = new Cars("Yellow Car Company", 6, 2021, 35000, true, "Yellow Car");
//        Cars car6 = new Cars("Cars Car Company", 8, 2022, 40000, true, "Cars Car");
//        Cars car7 = new Cars("Question Car Company", 6, 2021, 35000, false, "Question Car");

        Cars car1 = new Cars("Red Car Company", "GT", 4, 2010, 10000, "red", "", true, "Red Car");
        Cars car2 = new Cars("Yellow Car Company","SSR", 6, 2015, 20000, "yellow", "", true, "Yellow Car");
        Cars car3 = new Cars("Cars Car Company","RT", 8, 2020, 25000, "yellow", "09-12-22",false, "Cars Car");
        Cars car4 = new Cars("Red Car Company","SSR", 4, 2012, 3000, "red","", true, "Red Car");
        Cars car5 = new Cars("Yellow Car Company", "GT", 6, 2021, 35000,"Yellow", "",true, "Yellow Car");
        Cars car6 = new Cars("Cars Car Company", "RX", 8, 2022, 40000,"Yellow","", true, "Cars Car");
       // Cars car7 = new Cars("Question Car Company", "Sedan", 6, 2021, 35000, "Red", "09-12-22", false, "Question Car");


//        carCompany = carCompany;
//        this.carModel = carModel;
//        this.cylinders = cylinders;
//        this.year = year;
//        this.price = price;
//        this.color = color;
//        this.sold = sold;
//        this.isAvailable = isAvailable;
//        this.carName = carName;
//    }


        carArray.add(car1);
        carArray.add(car2);
        carArray.add(car3);
        carArray.add(car4);
        carArray.add(car5);
        carArray.add(car6);
        //        carArray.add(car7);

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
