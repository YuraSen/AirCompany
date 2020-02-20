package ua.mycompany.util.parse;

import com.opencsv.CSVReader;
import ua.mycompany.model.CargoPlane;
import ua.mycompany.model.PassengerPlane;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    public static List<PassengerPlane> parseCSVPassengerPlaneFile(String passengerPlaneFileName) {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(passengerPlaneFileName));
            String[] line;
            while ((line = reader.readNext()) != null) {
                passengerPlanes.add(new PassengerPlane(Double.valueOf(line[0]), Double.valueOf(line[1]), Double.valueOf(line[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passengerPlanes;
    }

    public static List<CargoPlane> parseCSVCargoPlaneFile(String cargoPlaneFileName) {
        List<CargoPlane> cargoPlanes = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(cargoPlaneFileName));
            String[] line;
            while ((line = reader.readNext()) != null) {
                cargoPlanes.add(new CargoPlane(Double.valueOf(line[0]), Double.valueOf(line[1]), Double.valueOf(line[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cargoPlanes;
    }
}
