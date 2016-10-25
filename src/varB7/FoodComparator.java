package varB7;

import java.util.Comparator;

/**
 * Created by sasha_koroleva on 25.10.2016.
 */
public class FoodComparator implements Comparator<Food> {


    @Override
    public int compare(Food o1, Food o2) {
        return -(o1.toString().length() - o2.toString().length());
    }
}
