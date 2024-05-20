package task_4.example_4;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

public class ByteArrayOutputStreamRunner {

    public static void main(String[] args) {

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            String text = "Hello Wolrd!";
            byte[] buffer = text.getBytes();
            baos.write(buffer);
            // превращаем массив байтов в строку
            System.out.println(baos.toString());

            // получаем массив байтов и выводим по символьно
            byte[] array = baos.toByteArray();
            for (byte b : array) {
                System.out.print((char) b);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
        System.out.println("************************************");
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new StringReader("Hello World!"))) {
            String tmp;
            while ((tmp = br.readLine()) != null) {
                sb.append(tmp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb.toString());


    }
}
