package model;

import java.io.*;
import java.util.ArrayList;

public class FileHandling {

  static ObjectInputStream ois;
  static ArrayList<CarProperty> carProperties = new ArrayList<>();
  static ArrayList<LorryProperty> lorryProperties = new ArrayList<>();
  static ArrayList<MiniBusProperty> miniBusProperties = new ArrayList<>();
  static ArrayList<CustomerProperty> customerProperties = new ArrayList<>();

  public static void addCars(CarProperty carProperty) {

//  try{
//    carProperties = (ArrayList<CarProperty>) loadCars();
//     carProperties.add(carProperty);
//  }catch (NullPointerException e){
//    carProperties.add(carProperty);
//  }

    carProperties = (ArrayList<CarProperty>) loadCars();

    if (carProperties==null){
      carProperties =new ArrayList<>();
    }
    carProperties.add(carProperty);
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

  public static void addLorry(LorryProperty lorryProperty) {
    lorryProperties = (ArrayList<LorryProperty>) loadLorry();

    if (lorryProperties==null){
      lorryProperties =new ArrayList<>();
    }
    lorryProperties.add(lorryProperty);

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
    customerProperties = (ArrayList<CustomerProperty>) loadCustomer();

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
  public static void addMiniBus(MiniBusProperty miniBusProperty) {

    miniBusProperties = (ArrayList<MiniBusProperty>) loadMiniBus();
    if (miniBusProperties==null){
      miniBusProperties =new ArrayList<>();
    }
    miniBusProperties.add(miniBusProperty);

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
    ArrayList<CarProperty> displayCar = (ArrayList<CarProperty>) FileHandling.loadCars();
    for (CarProperty car : displayCar) {
      if (car_id.equals(car.getVehicleId())){
        return car;
      }

    }
    return null;
  }
}
