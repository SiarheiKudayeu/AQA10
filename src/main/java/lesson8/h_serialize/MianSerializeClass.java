package lesson8.h_serialize;

import java.io.*;
import java.util.Arrays;

public class MianSerializeClass {
    public static void main(String[] args) {
        byte[] byteAnimal = null;
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)){
            Animal cat = new Animal(35, "Cat");
            System.out.println("before serial " + cat);
            outputStream.writeObject(cat);
            byteAnimal = byteArrayOutputStream.toByteArray();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("after serialize" + Arrays.toString(byteAnimal));


        //десериализация
        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteAnimal);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            Animal animalFromByteArray = (Animal) objectInputStream.readObject();
            System.out.println("Restored animal from byte array " + animalFromByteArray);
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
