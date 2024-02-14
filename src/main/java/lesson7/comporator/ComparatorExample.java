package lesson7.comporator;

import lesson7.comparable.Consoles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<ConsolesComparator> consoles = new ArrayList<>();
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.NINTENDO, 800));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.PLAYSTATION, 1234));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.PLAYSTATION, 8030));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.XBOX, 300));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.XBOX, 900));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.NINTENDO, 800));

        //Collections.sort(consoles);
        Comparator<ConsolesComparator> comparator = new ComparatorForConsolesCost();
        consoles.sort(comparator);
        System.out.println(consoles);

        Comparator<ConsolesComparator> comparatorByName = new Comparator<ConsolesComparator>() {
            @Override
            public int compare(ConsolesComparator o1, ConsolesComparator o2) {
                return o1.getName().getName().compareTo(o2.getName().getName());
            }
        };
        System.out.println("=========");
        consoles.sort(comparatorByName);
        System.out.println(consoles);
    }
}
