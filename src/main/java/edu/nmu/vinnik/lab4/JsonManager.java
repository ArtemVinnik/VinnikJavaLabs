package edu.nmu.vinnik.lab4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.nmu.vinnik.lab4.models.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    public static void writeToJsonFile(Object object, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(object, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readFromJsonFile(String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        University result = null;
        try (FileReader reader = new FileReader(filePath)) {
            result = gson.fromJson(reader, University.class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
