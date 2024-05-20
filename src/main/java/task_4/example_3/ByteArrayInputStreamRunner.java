package task_4.example_3;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;

public class ByteArrayInputStreamRunner {

    public static void main(String[] args) {

        readAllBytes();
        readFiveChars();
        System.out.println("************************");
        readAllBytesNew();
        readFiveCharsNew();
    }

    private static void readAllBytes() {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    private static void readFiveChars() {
        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {
            System.out.print((char) c + " ");
        }
        System.out.println();
    }

    private static void readAllBytesNew() {
        byte[] array = new byte[]{1, 3, 5, 7};
        String str = new String(array);
        try (BufferedReader br = new BufferedReader(new StringReader(str))) {
            int b;
            while ((b = br.read()) != -1) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void readFiveCharsNew() {
        String text = "Hello world!";
        try (BufferedReader br = new BufferedReader(new StringReader(text))) {
            char[] charsBuffer = new char[5];
            br.read(charsBuffer, 0, 5);
            for (char c : charsBuffer) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
