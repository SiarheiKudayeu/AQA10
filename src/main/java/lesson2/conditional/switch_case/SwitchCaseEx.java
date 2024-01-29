package lesson2.conditional.switch_case;

import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert profession:");
        String profession = scanner.nextLine();

        switch (profession.toUpperCase()) {
            case ("AQA"):
            case ("QA"):
                System.out.println("Do you use mobile?");
                String mobile = scanner.nextLine();
                switch (mobile) {
                    case ("yes"):
                        System.out.println("Hello Mobile Tester");
                        break;
                    case ("no"):

                        System.out.println("Hello Tester!!!");
                        break;
                }
                break;
            case ("DEVELOPER"):
                System.out.println("Hello Dev!!!");
                break;
            case ("DEVOPS"):
                System.out.println("Hello DevOps");
                break;
            default:
                System.out.println("There is no such profession :(");
                break;
        }

    }
}
