package JavaAdvanced.DefiningClasesExercises.StreamFilesAndDirectories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeCustomObject {
    static class Cube implements Serializable {
        String color;
        double width;
        double height;
        double depth;

        public Cube(String color, double width, double height, double depth) {
            this.color = color;
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
    }

    public static void main(String[] args) {
        String path = "D:\\bobi\\Java\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Serialization\\save.ser";
        Cube cube = new Cube("green", 15.3d, 12.4d, 3d);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
