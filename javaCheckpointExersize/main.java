package javaCheckpointExersize;

import java.util.Scanner;

import javaCheckpointExersize.data.VehicleService.VehicleService;
import javaCheckpointExersize.models.*;

public class main {

    public static void main(String[] args) {
        VehicleRepository repo = VehicleService.createVehicleRepo();
        System.out.println(repo.toString());
        switch (aksUserInput()) {
            case 1:
                Application.searchDemoModel(repo);
                break;
            case 2:
                Application.searchDemoManufacturer(repo);
                break;

            default:
                break;
        }

    }

    public static int aksUserInput() {
        Scanner scan = new Scanner(System.in);
        String res = "";

        while (true) {
            System.out.println("Would you like to search by 1.model or 2.manufacturer? (type 1 or 2)");
            res = scan.nextLine();

            if(res != "1" || res != "2"){
                break;
            }
        }

        return Integer.parseInt(res);
    }
}