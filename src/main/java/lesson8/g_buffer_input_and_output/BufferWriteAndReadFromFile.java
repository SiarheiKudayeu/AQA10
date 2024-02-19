package lesson8.g_buffer_input_and_output;

import java.io.*;

public class BufferWriteAndReadFromFile {
    public static void main(String[] args) {
        try(OutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream("C:\\Users\\anduser\\Desktop\\Java\\lesson7\\one.txt"))) {
            outputStream.write("Textany".getBytes());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


        StringBuilder resultText = new StringBuilder();
        try(InputStream inputStream = new BufferedInputStream
                (new FileInputStream("C:\\Users\\anduser\\Desktop\\Java\\lesson7\\one.txt"))) {
            int counter;
            while ((counter = inputStream.read()) != -1){
                resultText.append((char) counter);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(resultText);
    }
}
