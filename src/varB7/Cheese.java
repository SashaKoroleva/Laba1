package varB7;


public class Cheese extends Food {

    public Cheese(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
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
        if (this.name == ((Cheese) obj).getName()) {
            return true;
        }

        return false;
    }

    @Override
    public void consume() {
        System.out.println(name + " - съедено");
    }

    @Override
    public double calculateCalories() {
        return 146.4;
    }

}

