package model;

import java.io.*;
import java.util.ArrayList;

public class FileHandling {

  static ObjectInputStream ois;
//  static ArrayList<CarProperty> carProperties = new ArrayList<>();
//  static ArrayList<LorryProperty> lorryProperties = new ArrayList<>();
//  static ArrayList<MiniBusProperty> miniBusProperties = new ArrayList<>();
  static ArrayList<CustomerProperty> customerProperties = new ArrayList<>();
  static ArrayList<CarProperty> displayCar = (ArrayList<CarProperty>) FileHandling.loadCars();
  static ArrayList<LorryProperty> displayLorry = (ArrayList<LorryProperty>) FileHandling.loadLorry();
  static ArrayList<MiniBusProperty> displayMiniBus = (ArrayList<MiniBusProperty>) FileHandling.loadMiniBus();
  static ArrayList<CustomerProperty> displayCustomer = (ArrayList<CustomerProperty>) FileHandling.loadCustomer();
  public static String customerDataID;
  public static String customerDataName;
  public static int customerDataPhone;
  public static String customerDataEmail;
  public static String customerDataAddress;
  public static void addCars(ArrayList<CarProperty> carProperties) {

//  try{
//    carProperties = (ArrayList<CarProperty>) loadCars();
//     carProperties.add(carProperty);
//  }catch (NullPointerException e){
//    carProperties.add(carProperty);
//  }


//    if (carProperties == null) {
//      System.out.println("Ram");
//      carProperties =new ArrayList<CarProperty>();
//      carProperties.add(carProperty);
//    }else{
//      carProperties = (ArrayList<CarProperty>) loadCars();
//      carProperties.add(carProperty);
//    }

    try {
      FileOutputStream fos = new FileOutputStream("Cars.dat");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      //            obj.add(carProperty);
      oos.writeObject(carProperties);
      oos.close();
      fos.close();
    } catch (IOException e) {
      //e.printStackTrace();
      System.out.println("Cars could not be saved.");
    }
  }

  public static Object loadCars() {
    try {
      FileInputStream fis = new FileInputStream("Cars.dat");
      ois = new ObjectInputStream(fis);
      //            CarProperty obj = null;

      //            while ((obj=(CarProperty) ois.readObject())!=null) {
      //                System.out.println("Name:" + obj.getMake() + ", Address:" + obj.getModel());
      //            }

      //            CarProperty obj = null;

      //            while ((obj=(CarProperty) ois.readObject())!=null) {
      //                System.out.println("Name:" + obj.getMake() + ", Address:" + obj.getModel());
      //            }

      return ois.readObject();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("No data");
    }

    return null;
  }

  public static void addLorry(ArrayList<LorryProperty> lorryProperties) {

    try {
      FileOutputStream fos = new FileOutputStream("Lorry.dat", true);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(lorryProperties);
      oos.close();
      fos.close();
    } catch (IOException e) {
      //e.printStackTrace();
      System.out.println("Lorries could not be saved.");
    }
  }

  public static Object loadLorry() {
    try {
      FileInputStream fis = new FileInputStream("Lorry.dat");
      ois = new ObjectInputStream(fis);
      //            CarProperty obj = null;

      //            while ((obj=(CarProperty) ois.readObject())!=null) {
      //                System.out.println("Name:" + obj.getMake() + ", Address:" + obj.getModel());
      //            }

      return ois.readObject();
    } catch (Exception e) {
      System.out.println("No data in lorry file");
    }
    return null;
  }

  public static void addCustomer(CustomerProperty customerProperty) {
//    customerProperties = (ArrayList<CustomerProperty>) loadCustomer();

    if (customerProperties==null){
      customerProperties =new ArrayList<>();
    }
    customerProperties.add(customerProperty);

    try {
      FileOutputStream fos = new FileOutputStream("Customers.dat", true);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(customerProperties);
    } catch (IOException e) {
      //e.printStackTrace();
      System.out.println("Customers could not be saved.");
    }
  }

  public static Object loadCustomer() {
    try {
      FileInputStream fis = new FileInputStream("Customers.dat");
      ois = new ObjectInputStream(fis);
      //            CarProperty obj = null;

      //            while ((obj=(CarProperty) ois.readObject())!=null) {
      //                System.out.println("Name:" + obj.getMake() + ", Address:" + obj.getModel());
      //            }

      return ois.readObject();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("No data in customer file");
    }
    return null;
  }

  //    public ArrayList<CarProperty> getCarDetails(){
  //        return carProperties;
  //   } public static void addMiniBus(MiniBusProperty miniBusProperty) {
  //        miniBusProperties.add(miniBusProperty);
  //
  //        try {
  //            FileOutputStream fos = new FileOutputStream("MiniBus.dat");
  //            ObjectOutputStream oos = new ObjectOutputStream(fos);
  //            oos.writeObject(miniBusProperties);
  //            oos.close();
  //            fos.close();
  //        } catch (IOException e) {
  //            //e.printStackTrace();
  //            System.out.println("MiniBus could not be saved.");
  //        }
  //    }
  //
  //    public static Object loadMiniBus() {
  //        try {
  //            FileInputStream fis = new FileInputStream("MiniBus.dat");
  //            ois = new ObjectInputStream(fis);
  ////            CarProperty obj = null;
  //
  ////            while ((obj=(CarProperty) ois.readObject())!=null) {
  ////                System.out.println("Name:" + obj.getMake() + ", Address:" + obj.getModel());
  ////            }
  //
  //            return ois.readObject();
  //        } catch (Exception e) {
  //            System.out.println("Ram");
  //        }
  //        return null;
  //    }
  public static void addMiniBus(ArrayList<MiniBusProperty> miniBusProperties) {

    try {
      FileOutputStream fos = new FileOutputStream("MiniBus.dat", true);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(miniBusProperties);
      oos.close();
      fos.close();
    } catch (IOException e) {
      //e.printStackTrace();
      System.out.println("MiniBus could not be saved.");
    }
  }

  public static Object loadMiniBus() {
    try {
      FileInputStream fis = new FileInputStream("MiniBus.dat");
      ois = new ObjectInputStream(fis);
      //            CarProperty obj = null;

      //            while ((obj=(CarProperty) ois.readObject())!=null) {
      //                System.out.println("Name:" + obj.getMake() + ", Address:" + obj.getModel());
      //            }

      return ois.readObject();
    } catch (Exception e) {
      System.out.println("Ram");
    }
    return null;
  }
  public CarProperty displayCar(String car_id){

    for (CarProperty car : displayCar) {
      if (car_id.equals(car.getVehicleId())){
        return car;
      }

    }
    return null;
  }
  public LorryProperty displayLorry(String lorry_id){

    for (LorryProperty lorry : displayLorry) {
      if (lorry_id.equals(lorry.getVehicleId())){
        return lorry;
      }

    }
    return null;
  }
  public MiniBusProperty displayMiniBus(String miniBus_id){

    for (MiniBusProperty miniBus : displayMiniBus) {
      if (miniBus_id.equals(miniBus.getVehicleId())){
        return miniBus;
      }

    }
    return null;
  }
//  public CarProperty hireCar(String car_id,String customer_id){
//
//  }

  public static boolean hireCarToCustomer(String car_id, String customer_id) {
    int index;

    CarProperty hireCar = null;

    for (CarProperty carToHire : displayCar) {
//      System.out.println(car_id);

      if (carToHire.getVehicleId().equals(car_id)) {

        hireCar = carToHire;
      }
    }

    if (hireCar != null) {
      index = displayCar.indexOf(hireCar);
      hireCar.setHiredTo(customer_id);
      displayCar.remove(index);
      displayCar.add(hireCar);
//      System.out.println("the new user id is " + cars.get(cars.size() - 1).getHiredTo());
      addCars(displayCar);

    }
    return true;
  }
  public static boolean returnCar(String car_id) {
    int index;

    CarProperty returnCar = null;

    for (CarProperty carToReturn : displayCar) {
      if (carToReturn.getVehicleId().equals(car_id)) {

        returnCar  = carToReturn;
      }
    }
    if (returnCar != null) {
      index = displayCar.indexOf(returnCar);
      returnCar.setHiredTo("");
      System.out.println(returnCar.getHiredTo());
      System.out.println("The index of the car in arraylist is" + index);
      displayCar.remove(index);
      displayCar.add(returnCar);
      addCars(displayCar);
      return true;

    }
    return true;

  }
  public static void deleteCar(String car_id) {
    int index = -1;
    for (CarProperty deletecar : displayCar) {
      if (deletecar.getVehicleId().equals(car_id)) {
        index = displayCar.indexOf(deletecar);
      }
    }
      if (index != -1) {
      displayCar.remove(index);
      FileHandling.addCars(displayCar);
    }
  }
  public static boolean hireMiniBusToCustomer(String miniBus_id, String customer_id) {
    int index;

    MiniBusProperty hireMiniBus = null;

    for (MiniBusProperty miniBusToHire : displayMiniBus) {
      if (miniBusToHire.getVehicleId().equals(miniBus_id)) {
        hireMiniBus = miniBusToHire;
      }
    }

    if (hireMiniBus != null) {
      index = displayCar.indexOf(hireMiniBus);
      hireMiniBus.setHiredTo(customer_id);
      displayMiniBus.remove(index);
      displayMiniBus.add(hireMiniBus);
//      System.out.println("the new user id is " + cars.get(cars.size() - 1).getHiredTo());
      FileHandling.addMiniBus(displayMiniBus);
      return true;
    }
    return true;
  }
  public boolean returnMiniBus(String miniBus_id) {
    int index;

    MiniBusProperty returnMiniBus = null;

    for (MiniBusProperty miniBusToReturn : displayMiniBus) {
      if (miniBusToReturn.getVehicleId().equals(miniBus_id)) {
        returnMiniBus  = miniBusToReturn;
      }
    }
    if (returnMiniBus != null) {
      index = displayMiniBus.indexOf(returnMiniBus);
      returnMiniBus.setHiredTo("");
      System.out.println(returnMiniBus.getHiredTo());
      System.out.println("The index of the car in arraylist is" + index);
      displayMiniBus.remove(index);
      displayMiniBus.add(returnMiniBus);
      addMiniBus(displayMiniBus);
      return true;

    }
    return true;

  }
  public static void deleteMiniBus(String miniBus_id) {
    int index = -1;
    for (MiniBusProperty deleteMiniBus : displayMiniBus) {
      if (deleteMiniBus.getVehicleId().equals(miniBus_id)) {
        index = displayMiniBus.indexOf(deleteMiniBus);
      }
    }
    if (index != -1) {
      displayMiniBus.remove(index);
      FileHandling.addMiniBus(displayMiniBus);
    }
  }
  public static boolean hireLorryToCustomer(String lorry_id, String customer_id) {
    int index;

    LorryProperty hireLorry = null;

    for (LorryProperty lorryToHire : displayLorry) {
      if (lorryToHire.getVehicleId().equals(lorry_id)) {
        hireLorry = lorryToHire;
      }
    }

    if (hireLorry != null) {
      index = displayLorry.indexOf(hireLorry);
      hireLorry.setHiredTo(customer_id);
      displayLorry.remove(index);
      displayLorry.add(hireLorry);
      FileHandling.addLorry(displayLorry);
      return true;
    }
    return true;
  }
  public static boolean returnLorry(String lorry_id) {

    int index;
    LorryProperty returnLorry = null;

    for (LorryProperty lorryToReturn : displayLorry) {
      if (lorryToReturn.getVehicleId().equals(lorry_id)) {
        returnLorry = lorryToReturn;
      }
    }
    if (returnLorry != null) {
      index = displayLorry.indexOf(returnLorry);
      returnLorry.setHiredTo("");
      System.out.println(returnLorry.getHiredTo());
      System.out.println("The index of the car in arraylist is" + index);
      displayLorry.remove(index);
      displayLorry.add(returnLorry);
      addLorry(displayLorry);
      return true;

    }
    return true;

  }
  public static void deleteLorry(String lorry_id) {
    int index = -1;
    for (LorryProperty deleteLorry : displayLorry) {
      if (deleteLorry.getVehicleId().equals(lorry_id)) {
        index = displayLorry.indexOf(deleteLorry);
      }
    }
    if (index != -1) {
      displayLorry.remove(index);
      FileHandling.addLorry(displayLorry);
    }
  }

  public static boolean validateLogin(String username, String password) {
    boolean loggedIn = false;
    for (CustomerProperty customer : displayCustomer) {
      if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())) {
        loggedIn = true;
        customerDataID =customer.getCustomerId();
        customerDataName= customer.getName();
        customerDataPhone = customer.getPhoneNumber();
        customerDataEmail= customer.getEmail();
        customerDataAddress = customer.getAddress();
        break;
      }
    }
    return loggedIn;
}

  }

