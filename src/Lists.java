import java.util.*;
import java.util.ArrayList;

/**
 * Created by NIKI on 10/5/2016.
 */
public class Lists {

    public static void main(String[] args) {
        //Add ArrayList of fruits
        List<String> fruit = new ArrayList<String>();

        //Add Elements in the Array
        fruit.add("Cherry");
        fruit.add("Banana");
        fruit.add("Apple");

        //Add Element with Index
        fruit.add(1, "Watermellon");

        //Sorting the List with CollectionA by Using Comparator
        fruit.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("All fruits in stock sorted with comparator: " + fruit + "\n");

        //Sorting the List with Collections
        Collections.sort(fruit);

        System.out.println("All fruits in stock sorted with Collections: " + fruit + "\n");

        //Sorting the List with Lambdas
        fruit.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println("All fruits in stock sorted with Lambdas: " + fruit + "\n");

        //Sorting the List with Lambdas and Method References
        fruit.sort(String::compareTo);

        System.out.println("All fruits in stock sorted with Lambdas and Method References: " + fruit + "\n");

        //Using List<E> Methods to show examples of fruit
        System.out.println("Is Fruit List Empty: " + fruit.isEmpty());
        System.out.println("How many items are in fruit? : " + fruit.size());
        System.out.println("First Element in fruit is? : " + fruit.get(0));
        System.out.println("Do you have a cherry fruit? : " + fruit.contains("Cherry"));
        System.out.println("All fruits in stock: " + fruit);

        //Removing Elements by index in the array
        fruit.remove(2);

        //Example all in the list after element removed
        System.out.println("All fruits in stock: " + fruit);

        //Removing Elements by name
        fruit.remove("Apple");

        //Example all list after removed element by name
        System.out.println("All fruits in stock: " + fruit);

        //New List to Array
        List<String> vegetables = Arrays.asList("broccoli", "corn", "kale");

        System.out.println("Do you have a vegetables Array? : " + vegetables + "\n");

        //String Array from List
        String[] veggieArray = vegetables.toArray(new String[0]);

        //getting That Array to List again
        List<String> vegetable = Arrays.asList(veggieArray);

        System.out.println("Do you have a vegetables List again? : " + vegetable + "\n");

    }

}
