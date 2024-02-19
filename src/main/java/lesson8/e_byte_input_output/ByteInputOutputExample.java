package lesson8.e_byte_input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteInputOutputExample {
    public static void main(String[] args) {
        //InputStream для чтения стрима
        byte[] array = {12, 44, -55};  //-127 till 128;  0 till 255
        ByteArrayInputStream byteStream = new ByteArrayInputStream(array);
        int x;
        while ((x = byteStream.read()) != -1){
            System.out.print( x + " ");
        }
        System.out.println("\n===================");

        //OutputStream для записи в стрим
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        byteOutput.write(23);
        byteOutput.write(232);
        byteOutput.write(2);
        byte[] arrayFromOutput = byteOutput.toByteArray();
        System.out.println(Arrays.toString(arrayFromOutput));
    }
}

