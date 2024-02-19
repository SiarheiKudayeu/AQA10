package lesson8.f_file_input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExample {
    public static void main(String[] args) {
        String text = "Try to write to file!";
        byte[] textToWrite = text.getBytes();

        try(FileOutputStream outputStream =
                    new FileOutputStream("C:\\Users\\anduser\\Desktop\\Java\\lesson7\\test.txt")) {
            outputStream.write(textToWrite);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("=================");

        byte[] bufferByte = new byte[10];
        StringBuilder textToRead = new StringBuilder();
        try (FileInputStream fileInput =
                     new FileInputStream("C:\\Users\\anduser\\Desktop\\Java\\lesson7\\test.txt")){
            int count;
            while ((count = fileInput.read(bufferByte)) > 0){
                for(int i = 0; i < count; i++){
                    textToRead.append((char) bufferByte[i]);
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(textToRead);

    }
}
