import java.util.*;

/**
 * Created by NIKI on 10/5/2016.
 */
public class CollectionA {

    //diffrent types of Collections
    public static void main(String[] args) {

        //Linked List Collection allows null
        List linked = new LinkedList();
        linked.add("one");
        linked.add("two");
        linked.add("tree");
        linked.add("four");

        //print collection
        showMe(linked);

        //print shuffle collection
        Collections.shuffle(linked);

        showMe(linked);

        //print Reversed collection
        Collections.reverse(linked);

        showMe(linked);

        //ArrayList Collection
        List arraylist = new ArrayList();
        arraylist.add("a-one");
        arraylist.add("a-two");
        arraylist.add("a-tree");
        arraylist.add("a-four");

        //print collection
        showMe(arraylist);

        //HashSet Collection
        Set hashset = new HashSet();
        hashset.add("h-one");
        hashset.add("h-two");
        hashset.add("h-tree");
        hashset.add("h-four");

        //print collection
        showMe(hashset);

        //SortedSet Collection
        SortedSet treeSet = new TreeSet();
        treeSet.add("t-one");
        treeSet.add("t-two");
        treeSet.add("t-tree");
        treeSet.add("t-four");

        //print SortedHash Collection
        showMe(treeSet);

        //Linked Hash Set Collection
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");

        //print LinkedHashSet Collection
        showMe(linkedHashSet);

        //HashMap Collection
        Map hashMap = new HashMap();
        hashMap.put("h1", "one");
        hashMap.put("h2", "two");
        hashMap.put("h3", "tree");
        hashMap.put("h4", "four");

        //print Map Collection
        showMe(hashMap.keySet());
        showMe(hashMap.values());

        //Sorted Map Collection
        SortedMap sortedMap = new TreeMap();
        sortedMap.put("s1", "one");
        sortedMap.put("s2", "two");
        sortedMap.put("s3", "tree");
        sortedMap.put("s4", "four");

        //print SortedMap Collection
        showMe(sortedMap.keySet());
        showMe(sortedMap.values());

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("l1", "one");
        linkedHashMap.put("l2", "two");
        linkedHashMap.put("l3", "tree");
        linkedHashMap.put("l4", "four");

        //print LinkedMap Collection
        showMe(linkedHashMap.keySet());
        showMe(linkedHashMap.values());

    }

    //printing the diffrent collections
    private static void showMe(Collection collection){
        //Iterator for the collection
        Iterator iterator = collection.iterator();

        //while loop on each element
        while (iterator.hasNext()){
            //get next
            String string = (String) iterator.next();
            //show me
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
