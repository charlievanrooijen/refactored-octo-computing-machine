package javaCheckpointExersize.models;

import java.util.ArrayList;
import java.util.Scanner;

import javaCheckpointExersize.data.VehicleService.VehicleService;

public class Application {

    public static void searchDemoModel(VehicleRepository repo) {
        Boolean stopSearch = false;
        String response = "";
        while (!stopSearch) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n what model are you looking for?");
            response = scan.nextLine();
            ArrayList<Vehicle> searchRes = VehicleService.searchByModel(response, repo);

            System.out.println("\n results:");
            searchRes.stream()
                    .forEach(result -> System.out.println(result.toString()));

            System.out.println("\n search again?");
            response = scan.nextLine();
            if (response.equals("no")) {
                stopSearch = true;
            }
        }

    }

    public static void searchDemoManufacturer(VehicleRepository repo) {
        Boolean stopSearch = false;
        String response = "";
        while (!stopSearch) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n what manufacturer are you looking for?");
            response = scan.nextLine();
            ArrayList<Vehicle> searchRes = VehicleService.searchByAutomaker(response, repo);

            searchRes.stream()
                    .forEach(result -> System.out.println(result.toString()));
            System.out.println("\n search again?");
            response = scan.nextLine();
            if (response.equals("\n no")) {
                stopSearch = true;
            }
        }
    }
}
