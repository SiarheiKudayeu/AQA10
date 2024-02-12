package lesson6.generate_exception;

import java.util.Scanner;

public class PersonException {

    public static class URLS{
        private static final String CONST = "url";
    }

    public void openMainPage(){
        System.out.println("Open " + URLS.CONST + " url!!!");
    }


    public static void main(String[] args) {
        PersonException person = new PersonException();
        try {
            person.setName(askName());
        } catch (SiarheiNameException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Name of person is " + person.getName());
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String askName() throws SiarheiNameException {
        System.out.println("Insert name for this person:");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Siarhei")) {
            throw new SiarheiNameException();
        }
        return name;
    }
}
