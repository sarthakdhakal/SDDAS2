package model;

public class LorryProperty extends VehicleProperty {
    private double loadingCapacity;


    public LorryProperty(String make, String model, int topSpeed, String registrationNumber, double dailyHireRate, double loadingCapacity) {
        super(make, model, topSpeed, registrationNumber, dailyHireRate);
        this.loadingCapacity = loadingCapacity;

    }

    public double getLoadingCapacity() {
        return loadingCapacity;
    }


    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}

