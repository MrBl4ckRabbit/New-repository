package task_4.example_5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MyDataIoStreamRunner {
    public static void main(String[] args) throws FileNotFoundException {

        Person tom = new Person("Tom", 34, 1.68, false);
        writeDataToFile(tom);
        readDataFromFile();
//        File file = new File("src/main/java/task_4/example_5/text_from.txt");
//        Scanner scanner = new Scanner(file);
//
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }

    }

    private static void writeDataToFile(Person person) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/task_4/example_5/text_to.txt"))) {
            bw.write(person.name + " ");
            bw.write(person.age + " ");
            bw.write(person.height + " ");
            bw.write(person.married + " ");
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readDataFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/task_4/example_5/text_from.txt"))) {
            String line = br.readLine();
            String[] data = line.split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            double height = Double.parseDouble(data[2]);
            boolean married = Boolean.parseBoolean(data[3]);
            System.out.printf("Name: %s  Age: %d  Height: %.2f  Married: %b",
                    name, age, height, married);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

//    private static void readDataFromFile(){
//        Path filePath = Paths.get("src/main/java/task_4/example_5/text_from.txt");
//        try {
//            String line = Files.readString(filePath);
//            String[] values = line.split(" ");
//
//            String name = values[0];
//            int age = Integer.parseInt(values[1]);
//            double height = Double.parseDouble(values[2]);
//            boolean married = Boolean.parseBoolean(values[3]);
//
//            System.out.printf("Name: %s  Age: %d  Height: %.2f  Married: %b",
//                    name, age, height, married);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

//    private static void writeDataToFile(Person person) {
//        Path filePath = Paths.get("src/main/java/task_4/example_5/text_to.txt");
//
//        try {
//            Files.writeString(filePath, "");
//            String data = String.format("%s %d %.2f %b%n",
//                    person.name, person.age, person.height, person.married);
//
//            Files.writeString(filePath, data, StandardOpenOption.APPEND);
//            System.out.println("File has been written");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}


