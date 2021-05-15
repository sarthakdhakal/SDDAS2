package model;

import java.io.Serializable;
import java.util.UUID;

abstract class VehicleProperty implements Serializable {
        public String vehicle_id ;
        private String make;
        private String model;
        private int topSpeed;
        private String registrationNumber;
        private double dailyHireRate;
        private boolean hired = false;

        VehicleProperty(String make,String model, int topSpeed, String registrationNumber, double dailyHireRate) {
            this.vehicle_id = UUID.randomUUID().toString();
            this.make= make;
            this.model = model;
            this.topSpeed = topSpeed;
            this.registrationNumber = registrationNumber;
            this.dailyHireRate = dailyHireRate;
        }
        public String getVehicleId() {
        return vehicle_id;
    }

        public String getMake() {
        return make;
        }

        public void setMake(String make) {
        this.make = make;
    }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public double getDailyHireRate() {
            return dailyHireRate;
        }

        public void setDailyHireRate(double dailyHireRate) {
            this.dailyHireRate = dailyHireRate;
        }

        public boolean isHired() {
            return hired;
        }

        public void setHired(boolean hired) {
            this.hired = hired;
        }
    }

