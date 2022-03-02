package javaCheckpointExersize.models;

import java.util.ArrayList;

public class Manufacturer {
    String name;

    ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>();

    public Manufacturer(String name) throws IllegalArgumentException{
        if (name == null) {
            throw new IllegalArgumentException("Name can't be empty");
        } else {
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Vehicle> getVehicles(){
        return vehiclesList;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehiclesList.add(vehicle);
    }
}