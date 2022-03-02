package javaCheckpointExersize.models;

import java.util.ArrayList;

public class VehicleRepository {

    ArrayList<Manufacturer> manufacturerList = new ArrayList<Manufacturer>();;

    public VehicleRepository(ArrayList<Manufacturer> list) {
        list.stream()
                .forEach(Manufacturer -> {
                    manufacturerList.add(Manufacturer);
                });
    }

    public ArrayList<Manufacturer> getManufacturers() {
        return this.manufacturerList;
    }

    public ArrayList<Vehicle> getVehicles() {
        ArrayList<Vehicle> temp = new ArrayList<Vehicle>();

        this.manufacturerList.stream()
                .forEach(manufacturer -> {
                    manufacturer.getVehicles().stream()
                            .forEach(Vehicle -> {
                                temp.add(Vehicle);
                            });
                });
        ;

        return temp;
    }

    public void removeVehicle(String name) {
        if (name == "") {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.manufacturerList.stream()
                .filter(vehicle -> (vehicle.getName().equals(name)))
                .forEach(vehicle -> {
                    this.manufacturerList.remove(vehicle);
                    System.out.println("Success");
                });
    }

    public String toString() {
        String temp = "";

        this.manufacturerList.stream()
                .forEach(manufacturer -> {
                    System.out.print("\n Manufacturer name: " + manufacturer.getName());
                    manufacturer.getVehicles().stream()
                            .forEach(vehicle -> {
                                System.out.print(vehicle.toString());
                            });
                });
                
                return temp;
    }
}
