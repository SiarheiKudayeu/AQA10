package lesson8.h_serialize;

import java.io.*;
import java.util.Arrays;

public class MainSerializeClassPerson {
    public static void main(String[] args) {
        byte[] bytePerson = null;
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)){
            Animal cat = new Animal(35, "Cat");
            Person person = new Person(22, "Sam");
            person.setAnimal(cat);
            System.out.println("before serial " + person);
            outputStream.writeObject(person);
            bytePerson = byteArrayOutputStream.toByteArray();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("after serialize" + Arrays.toString(bytePerson));

        
        //десериализация
        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytePerson);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            Person animalFromByteArray = (Person) objectInputStream.readObject();
            System.out.println("Restored animal from byte array " + animalFromByteArray);
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
