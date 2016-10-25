package varB7;

/**
 * Created by sasha_koroleva on 23.10.2016.
 */

public class Food implements Consumable, Nutritious {

    protected String name;

    public Food() {

    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void consume() {

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return false;
    }

    @Override
    public double calculateCalories() {
        return 0;
    }
}


