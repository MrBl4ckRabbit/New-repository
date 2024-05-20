package task_4.example_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderRunner {
    public static void main(String[] args) {
        readAllBytes();
        System.out.println("--------------------");
        readEachByte();
    }

    private static void readAllBytes() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/task_4/example_6/text.txt"))) {
            StringBuilder sb = new StringBuilder();
            String tmp;
            while ((tmp = br.readLine()) != null) {
                sb.append(tmp);
            }
            System.out.println(sb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readEachByte() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/task_4/example_6/text.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
