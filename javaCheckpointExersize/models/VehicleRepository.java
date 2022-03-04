package javaCheckpointExersize.models;

import java.util.ArrayList;

public class VehicleRepository {

    Manufacturer[] manufacturerList;

    public VehicleRepository(Manufacturer[] list) {
        this.manufacturerList = list;
    }

    public VehicleRepository(ArrayList<Manufacturer> list) {
        this.manufacturerList = new Manufacturer[6];
        int index = 0;
        for(Manufacturer manufacturer : list){
            this.manufacturerList[index] = manufacturer;
        }
    }

    public Manufacturer[] getManufacturers() {
        return this.manufacturerList;
    }

    public ArrayList<Vehicle> getVehicles() {
        ArrayList<Vehicle> temp = new ArrayList<Vehicle>();

        for(Manufacturer manufacurer : this.manufacturerList){
            for(Vehicle vehicle : manufacurer.getVehicles()){
                temp.add(vehicle);
            }
        }

        return temp;
    }

    public void removeVehicle(String name) {
        if (name == "") {
            throw new IllegalArgumentException("Name can't be empty");
        }

        for (Manufacturer manufacturer : this.manufacturerList) {
            for (Vehicle vehicle : manufacturer.getVehicles()){
                if(vehicle.getName() == name){
                    manufacturer.removeVehicle(name);
                }
            }
        }
    }

    public String toString() {
        String temp = "";

                for (Manufacturer manufacturer : this.manufacturerList) {
                    temp += ("\n Manufacturer name: " + manufacturer.getName());
                    for (Vehicle vehicle : manufacturer.getVehicles()){
                                temp += (vehicle.toString());
                        }
                    
                }

        return temp;
    }
}
