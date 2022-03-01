package javaCheckpointExersize.data;

import java.util.ArrayList;
import java.util.stream.Stream;

import javax.management.ConstructorParameters;

import javaCheckpointExersize.models.Vehicle;

public class VehicleRepository {

    String name;
    ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

    public VehicleRepository(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name can't be empty");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle car) {
        this.cars.add(car);
    }

    public void removeVehicle(String name) {
        if(name == ""){
            throw new IllegalArgumentException("Name can't be empty");
        }

        this.cars.stream()
                .filter(car -> (car.getName().equals(name)))
                .forEach(car -> {
                    this.cars.remove(car);
                    System.out.println("Success");
                });
    }
}
