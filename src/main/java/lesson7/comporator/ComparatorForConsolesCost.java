package lesson7.comporator;

import java.util.Comparator;

public class ComparatorForConsolesCost implements Comparator<ConsolesComparator> {
    @Override
    public int compare(ConsolesComparator o1, ConsolesComparator o2){
        return o1.getCost() - o2.getCost();
    }
}
