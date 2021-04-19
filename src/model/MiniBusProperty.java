package model;

public class MiniBusProperty extends VehicleProperty {


    private int seatingCapacity;

    public MiniBusProperty(String make,String model, int topSpeed, String registrationNumber, double dailyHireRate, int seatingCapacity) {
        super(make, model, topSpeed, registrationNumber, dailyHireRate);
        this.seatingCapacity = seatingCapacity;

    }

    public double getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}


