package task_4.example_2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedOutputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello Java world!"; // строка для записи
        try (FileOutputStream out = new FileOutputStream("src/main/java/task_4/example_2/text.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        String newText = "Hello New Java world!"; // строка для записи
        try {
            Files.writeString(Paths.get("src/main/java/task_4/example_2/new_text.txt"), newText);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
