package model;

public class CarProperty extends VehicleProperty {

        private String typeOfFuel;
        private int noOfDoors;

        public CarProperty(String make,String model, int topSpeed, String registrationNumber, double dailyHireRate, String typeOfFuel, int noOfDoors) {
            super(make, model, topSpeed, registrationNumber, dailyHireRate);
            this.typeOfFuel = typeOfFuel;
            this.noOfDoors = noOfDoors;
        }

        public String getTypeOfFuel() {
            return typeOfFuel;
        }

        public int getNoOfDoors() {
            return noOfDoors;
        }

        public void setTypeOfFuel(String typeOfFuel) {
            this.typeOfFuel = typeOfFuel;
        }

        public void setNoOfDoors(int noOfDoors) {
            this.noOfDoors = noOfDoors;
        }
    }


