package varB7;

/**
 * Created by sasha_koroleva on 23.10.2016.
 */
public class IceCream extends Food{

    protected String sirup;

    public IceCream(String name) {
    }

    public IceCream(String name, String sirup) {
        super(name);
        this.sirup = sirup;
    }

    public String getSirup() {
        return sirup;
    }

    public void setSirup(String sirup) {
        this.sirup = sirup;
    }

    @Override
    public void consume() {

        if (sirup.equals("шоколадный")){
            System.out.println( name + " с шоколадным сиропом - съедено");
        }
        else{
            System.out.println( name + " с карамельным сиропом - съедено");
        }
    }

    @Override
    public String toString() {
        return super.toString()+" c "+sirup+"ным сиропом";
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
        if(this.name == ((IceCream) obj).getName() && this.sirup == ((IceCream) obj).getSirup()) {
            return true;
        }

        return false;
    }

    @Override
    public double calculateCalories() {
        if (sirup == "шоколадный") {
            return 216.0;
        }
        if (sirup == "карамельный") {
            return 260.0;
        }
        return 0;
    }
}