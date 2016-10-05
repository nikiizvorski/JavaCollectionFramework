import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by NIKI on 10/5/2016.
 */
public class Search {

    //We will Implement as soon as possible the BIG-O

    private static void searchForName() throws FileNotFoundException {
        File file = new File("words.txt");
        String name = "all";

        final Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(name)) {
                // a match!
                System.out.println("I found " + name + " in file " + file.getName());
            } else {
                System.out.println("No Match");
                break;
            }
        }
    }

    private static void searchForNamed() throws FileNotFoundException {
        File file = new File("words.txt");
        String name = "all";

        final Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.matches(name)) {
                // a match!
                System.out.println("I found " + name + " in file " + file.getName());
            } else {
                System.out.println("No Match");
                break;
            }
        }
    }

    private static void searchforStringHash() throws FileNotFoundException {
        Scanner file = new Scanner(new File("words.txt"));

        String search = "all";

        Set<String> crime = new HashSet<>();
        // For each word in the input
        while (file.hasNext()) {
            // Convert the word to lower case, trim it and insert into the set
            // In this step, you will probably want to remove punctuation marks
            crime.add(file.next().trim().toLowerCase());
        }

        // Check if the set contains the search string
        if (crime.contains(search)) {
            System.out.println("I found " + search + " in file ");
        } else {
            System.out.println("No");
        }
    }

    private static void searchHashSet() throws FileNotFoundException {
        // Read the file using whitespace as a delimiter (default)
        // so that the input will be split into words
        Scanner file = new Scanner(new File("words.txt"));

        String search = "all";

        Set<String> crime = new HashSet<>();
        // For each word in the input
        while (file.hasNext()) {
            // Convert the word to lower case, trim it and insert into the set
            // In this step, you will probably want to remove punctuation marks
            crime.add(file.next().trim().toLowerCase());
        }

        // Check if the set contains the search string
        if (crime.contains(search)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        System.out.println();

        //searchForStringHash 917ms
        //searchForHashSet 959ms
        //searchForName 54ms
        //searchForNamed 47ms

        try {
            long startTime = System.currentTimeMillis();
            searchForName();
            long duration = System.currentTimeMillis() - startTime;
            System.out.println();
            System.out.println("Method '" + "' took " + duration + " milliseconds to run");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
