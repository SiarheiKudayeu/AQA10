package lesson2.while_do;

import java.util.Scanner;

public class Exampe1 {
        /*  Пример у вас соц сеть в которую можно загружать фотографии
        у пользователя с консоли спрашивают сколько фотографий
        он хотел бы загрузить в свой альбом
        но есть ограничение по размеру альбома в 100 фотографий*/

    public static void main(String[] args) {
        int countOfPhoto = 0;
        Scanner scanner = new Scanner(System.in);
        while (countOfPhoto <= 100){
            if(countOfPhoto == 100){
                break;
            }
            System.out.println("Ho much photo do you want to download?");
            int tempCount = scanner.nextInt();

            if((countOfPhoto + tempCount) > 100){
                System.out.println("The limit is reached");
                System.out.println("You can load " + (100 - countOfPhoto));
                continue;
            }
            countOfPhoto = countOfPhoto + tempCount;
            System.out.println("You can load " + (100 - countOfPhoto));
        }
        System.out.println("Final");
        scanner.close();
    }
}
