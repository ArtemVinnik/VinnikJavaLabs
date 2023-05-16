package edu.nmu.vinnik.lab4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.nmu.vinnik.lab4.models.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonManager {
    public static void writeToJsonFile(Object object, String filePath) {
        String path = getNormalizePath(filePath);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(object, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readFromJsonFile(String filePath) {
        University result = null;

        String path = getNormalizePath(filePath);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader(path)) {
            result = gson.fromJson(reader, University.class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String getNormalizePath(String filePath) {
        Path path = Paths.get(filePath);

        return path.normalize().toString();
    }
}
