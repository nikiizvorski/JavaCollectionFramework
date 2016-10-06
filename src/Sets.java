import java.util.*;

/**
 * Created by NIKI on 10/5/2016.
 */
public class Sets {

    public static void main(String[] args) {
        Set<String> meals = new HashSet<>();
        //Monday
        meals.add("tacos");
        //Tuesday
        meals.add("tacos");
        //Wednesday
        meals.add("tacos");
        //Thursday
        meals.add("tacos");
        //Friday
        meals.add("french dip");
        //Saturday
        meals.add("burrito");
        //Sunday
        meals.add("french fries");
        //Meals for the week
        System.out.println("I have those meals all week: " + meals + "\n");

        List<String> frontEndLanguages = Arrays.asList("HTML", "CSS", "JavaScript");
        List<String> backEndLanguages = Arrays.asList("Java", "Python", "Objective-C", "PHP", "Swift", "JavaScript");

        //Create a new list to ArrayList
        List<String> allLanguages = new ArrayList<String>(frontEndLanguages);

        //Add All to the arraylist
        allLanguages.addAll(backEndLanguages);

        //You can see you have duplicates here
        System.out.println("All Languages here: " + allLanguages + "\n");

        //You can see there are no duplicates here with Sets

        Set<String> uniqueLanguages = new HashSet<>(allLanguages);
        System.out.println("All Languages here again with Sets: " + uniqueLanguages + "\n");

        //Using TreeSets those are sorted and they use branching
        Set<String> uniqueLanguagesT = new TreeSet<>(allLanguages);
        System.out.println("All Languages here again with TreeSets: " + uniqueLanguagesT + "\n");

        //Even if you add new element it will still be sorted
        uniqueLanguagesT.add("C#");

        //Example of sorted ThreeSet
        System.out.println("All Languages here again with TreeSets: " + uniqueLanguagesT + "\n");

        //You can't use headSet() and tailSet() until you have SortedSet, you will get a crash!
        SortedSet<String> uniqueLang = new TreeSet<>(allLanguages);
        System.out.println("All Languages here again with TreeSets: " + uniqueLang + "\n");
        System.out.println("Show all elements before J: " + uniqueLang.headSet("J") + "\n");
        System.out.println("Show all elements after J: " + uniqueLang.tailSet("J") + "\n");
        System.out.println("Show all that match the sentence Java: " + uniqueLang.subSet("Java", "Java" + Character.MAX_VALUE ) + "\n");

    }

}
