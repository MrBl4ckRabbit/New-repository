package task_4.example_5;

import java.io.*;

public class MyDataIoStreamRunner {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        writeDataToFile(tom);
        readDataFromFile();
    }

    private static void writeDataToFile(Person person) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/task_4/example_5/text_to.txt"))) {
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
        try (BufferedReader br = new BufferedReader(new FileReader("src/task_4/example_5/text_from.txt"))) {
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

}


