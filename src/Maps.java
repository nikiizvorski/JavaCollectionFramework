import java.util.*;

/**
 * Created by NIKI on 10/5/2016.
 */
public class Maps {

    public static void main(String[] args) {

        //Create Map of Acronyms
        Map<String, String> acronyms = new HashMap<String, String>();

        //Put acronyms inside of the Map
        acronyms.put("yagni", "You Ain't Gonna Need It");
        acronyms.put("dry","Don't Repeat Yourself");
        acronyms.put("yolo", "You Only Live Once");

        //Check for Key
        System.out.println("Do you have a kiss key? : " + acronyms.containsKey("kiss") + "\n");

        //Get a Key
        System.out.println("Is key kiss in there? : " + acronyms.get("kiss") + "\n");

        //Provide the Key Kiss
        acronyms.put("kiss", "Keep It Simple Stupid");
        System.out.println("Do you have a kiss key? : " + acronyms.containsKey("kiss") + "\n");

        //When you remove a key it returns the value so you can use it to pop it with
        System.out.println("Do you have a yolo key? : " + acronyms.remove("yolo") + "\n");

        //You can have a Set of all acronyms
        Set<String> allAcronyms = acronyms.keySet();
        System.out.println("All acronyms keys? : " + allAcronyms + "\n");

        //Map have a Map.Entry and it can be used only in that context
        // with the entrySet() you get both keys and values!
        for (Map.Entry entry : acronyms.entrySet()){
            System.out.printf("%s stands for %s %n", entry.getKey(), entry.getValue());
        }

    }

}
