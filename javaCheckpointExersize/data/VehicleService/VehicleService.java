package javaCheckpointExersize.data.VehicleService;

import java.util.ArrayList;

import javaCheckpointExersize.models.VehicleRepository;
import javaCheckpointExersize.models.Manufacturer;
import javaCheckpointExersize.models.Vehicle;

public class VehicleService {

    public static VehicleRepository createVehicleRepo() {
        ArrayList<Manufacturer> manufacturerList = new ArrayList<Manufacturer>();

        manufacturerList.add(new Manufacturer("GM"));
        manufacturerList.add(new Manufacturer("Hyundai"));
        manufacturerList.add(new Manufacturer("Volkswagen"));
        manufacturerList.add(new Manufacturer("Audi"));
        manufacturerList.add(new Manufacturer("Mercedes"));
        manufacturerList.add(new Manufacturer("Peugeot"));

        String[][] carNames = { { "Suburban", "Malibu", "Silverado" }, { "Azera", "Sonata", "Veloster" },
                { "Golf", "Jetta", "Jetta" }, { "A4", "Q7", "R8" }, { "C 180", "C 200", "GLA 200" },
                { "206", "208", "2008" } };

        for (int i = 0; i <= carNames.length - 1; i++) {
            for (int l = 0; l < 2; l++) {
                manufacturerList.get(i).addVehicle(new Vehicle(carNames[i][l], "color", "year"));
            }
        }

        VehicleRepository repo = new VehicleRepository(manufacturerList);
        return repo;
    }

    public static ArrayList<Vehicle> searchByAutomaker(String searchTerm, VehicleRepository repo) {
        ArrayList<Vehicle> res = new ArrayList<Vehicle>();

        for (Manufacturer manufacturer : repo.getManufacturers()) {
            if (manufacturer.getName().toUpperCase().contains(searchTerm.toUpperCase())) {
                for (Vehicle vehicle : manufacturer.getVehicles()) {
                    res.add(vehicle);
                }
            }
        }

        return res;
    }

    public static ArrayList<Vehicle> searchByModel(String searchTerm, VehicleRepository repo) {
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();

        for (Manufacturer manufacturer : repo.getManufacturers()) {
            for (Vehicle vehicle : manufacturer.getVehicles()) {
                if (vehicle.getName().toUpperCase().contains(searchTerm.toUpperCase())) {
                    result.add(vehicle);
                }
            }
        }

        return result;
    }

    public void addVehicle(Vehicle vehicleToAdd, String manufacturerName, VehicleRepository repo) {
        for (Manufacturer manufacturer : repo.getManufacturers()) {
            if (manufacturer.getName().toUpperCase().contains(manufacturerName.toUpperCase())) {
                manufacturer.addVehicle(vehicleToAdd);
            }
        }
    }
}
