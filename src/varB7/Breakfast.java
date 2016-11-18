package varB7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.SourceTree;
import varB7.Apple;
import varB7.IceCream;
import varB7.Food;

import javax.xml.bind.SchemaOutputResolver;



public class Breakfast {

    private ArrayList myList;
    private boolean flagCalories = false;
    private boolean flagSort = false;

    public Breakfast(String[] args) {

        myList = new ArrayList(0);

        for(int i=0; i < args.length; i++){

            if (args[i].equals("Сыр")) {
                myList.add(new Cheese("Сыр") );
            }
            if (args[i].equals("Яблоко большое")) {
                myList.add(new Apple("Яблоко", "большое"));
            }
            if (args[i].equals("Яблоко маленькое")) {
                myList.add(new Apple("Яблоко", "маленькое"));
            }
            if (args[i].equals("Яблоко среднее")) {
                myList.add(new Apple("Яблоко", "среднее"));
            }
            if (args[i].equals("Мороженое с шоколадным сиропом")) {
                myList.add(new IceCream("Мороженое", "шоколадный"));
            }
            if (args[i].equals("Мороженое с карамельным сиропом")) {
                myList.add(new IceCream("Мороженое", "карамельный"));
            }
            if(args[i].equals("-calories")){
                flagCalories = true;
                outputCalories();
            }
            if(args[i].equals("-sort")) {
                flagSort = true;
                sortOfList();

            }
        }

    }



    public ArrayList<Food> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Food> myList) {
        this.myList = myList;
    }

    public boolean isFlagCalories() {
        return flagCalories;
    }

    public void setFlagCalories(boolean flagCalories) {
        this.flagCalories = flagCalories;
    }

    public boolean isFlagSort() {
        return flagSort;
    }

    public void setFlagSort(boolean flagSort) {
        this.flagSort = flagSort;
    }

    public double sumOfCalories(){

        double sum = 0;

        for(int i=0; i<myList.size(); i++){
            sum += ((Food)myList.get(i)).calculateCalories();
        }

        return sum;
    }

    private void outputCalories() {

        System.out.println("Сумма каллорий завтрака: " + sumOfCalories());
    }

    public void sortOfList(){
        Collections.sort(myList, new FoodComparator());
    }

    public int recount (Food a){
        int count = 0;
        for (int i = 0; i < this.myList.size(); i++){
            if(a.equals(this.myList.get(i))){
                count ++;
            }
        }

        return count;

    }

    public void outputRecount(Food a) {
        int c = recount(a);
        if (c == 1) {
            System.out.println("Было съеден " + c + " продукт заданного типа");
        }
        if (c > 1 && c <= 5) {
            System.out.println("Было съедено " + c + " продукта заданного типа");
        }
        if (c > 5) {
            System.out.println("Было съедено " + c + " продуктов заданного типа");
        }
        ;
    }
}
