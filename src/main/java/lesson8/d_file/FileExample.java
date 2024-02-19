package lesson8.d_file;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File test = new File("C:\\Users\\anduser\\Desktop\\Java\\lesson7\\test.txt");
        System.out.println(test.length());
        System.out.println(test.getName());
        System.out.println(test.canWrite());
        System.out.println(test.canRead());
        System.out.println(test.isFile());
        System.out.println(test.isDirectory());
        System.out.println("===========");

        File lesson7Folder = new File("C:\\Users\\anduser\\Desktop\\Java\\lesson7");
        System.out.println(lesson7Folder.isDirectory());
        File[] listOfFiles = lesson7Folder.listFiles();
        int counter = 1;
        for(File file: listOfFiles){
            System.out.println(counter + ") " + file.getName());
            counter++;
        }
    }
}
