package task_4.example_7;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamRunner {
    public static void main(String[] args) throws IOException {
        System.out.println();
        try (FileOutputStream outputStream = new FileOutputStream("src/task_4/example_7/text.txt", true)) {
            String value = "Hello World2!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/task_4/example_7/text.txt", true))) {
            String value = "Hello World2!";
            bw.write(value);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
