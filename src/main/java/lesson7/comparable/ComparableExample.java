package lesson7.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Consoles> consoles = new ArrayList<>();
        consoles.add(new Consoles(Consoles.Name.NINTENDO, 800));
        consoles.add(new Consoles(Consoles.Name.PLAYSTATION, 1234));
        consoles.add(new Consoles(Consoles.Name.PLAYSTATION, 8030));
        consoles.add(new Consoles(Consoles.Name.XBOX, 300));
        consoles.add(new Consoles(Consoles.Name.XBOX, 900));
        consoles.add(new Consoles(Consoles.Name.NINTENDO, 800));

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
        integers.add(424);
        integers.add(0);
        integers.add(-4);

        Collections.sort(integers);
        System.out.println(integers);

        Collections.sort(consoles);
        System.out.println(consoles);

    }
}
