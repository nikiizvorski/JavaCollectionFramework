import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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

    public static void searchforWords() throws FileNotFoundException {

        String match = "add";

        List<String> words = new ArrayList(Arrays.asList("cat", "ball", "bat", "cup", "add", "ant"));
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String word: words){
            String firstChar = String.valueOf(word.charAt(0));
            if (map.get(firstChar) == null){
                map.put(firstChar, new ArrayList(Arrays.asList(word)));
            }
            else{
                map.get(firstChar).add(word);
            }
        }

        System.out.println(map + "\n");

        if (map.containsKey(String.valueOf(match.charAt(0)))){
                System.out.println("GOT KEY");
            if (map.containsValue(match)){
                System.out.println("GOT VALUE");
            }
        }
    }

    private static void searchHashForLetterKey() throws FileNotFoundException {
        Map<Character, ArrayList<String>> charCount = new HashMap<Character, ArrayList<String>>();
        Scanner scanner = new Scanner(new File("words.txt"));

        String word = "catch";

        while (scanner.hasNext()) {
            char firstChar = scanner.next().charAt(0);
            ArrayList<String> list;
            if (charCount.containsKey(firstChar)) {
                list = charCount.get(firstChar);
            } else {
                list = new ArrayList<>();
            }
            list.add(scanner.next());
            charCount.put(firstChar, list);
        }

        // Print out each of the values.
        for (Map.Entry<Character, ArrayList<String>> entry : charCount.entrySet()) {
            char character = entry.getKey();
            ArrayList<String> list = entry.getValue();
            System.out.println(character + ": " + list.size());
        }

        if (charCount.containsKey(word.charAt(0))) {
            System.out.println("KEY FOUND");
            ArrayList<String> list = charCount.get(word.charAt(0));

            System.out.println(list);

            if (list.contains(word.trim())) {
                System.out.println("Word found is: " + word);
            } else {
                System.out.println("Your word is not found in the example: " + word);
            }
        } else {
            System.out.println("Key Not Found: " + word);
        }

    }


    public static void main(String[] args) {
        System.out.println();

        //searchForStringHash 917ms
        //searchForHashSet 959ms
        //searchForName 54ms
        //searchForNamed 47ms

        try {
            searchHashForLetterKey();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        try {
//            searchHashForLetterKey();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try {
//            long startTime = System.currentTimeMillis();
//            searchHashForLetterKey();
//            long duration = System.currentTimeMillis() - startTime;
//            System.out.println();
//            System.out.println("Method '" + "' took " + duration + " milliseconds to run");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }
}
