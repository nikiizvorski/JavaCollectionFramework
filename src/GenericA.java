import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIKI on 10/26/2016.
 */
public class GenericA {

    /**
     * Two important things to understand: type safety and type erasure
     *
     * Type Safety
     * in Generics Java means that the guaranteed types are used where they are supposed to.
     * A usecase can be list of Integer i.e. List<Integer>. If you declare a list in java like List<Integer>,
     * then java guarantees that it will detect and report you any attempt to insert any non-integer type into above list.
     *
     * Type Erasure
     * in Generics Java means that when all the info that is added by the generics will be removed from the code generated from it.
     *
     * Type Inference
     * Java compiler is smart enough to determine the type of variable to be used, this facility is called as type inference
     *
     * The idea is that all of the JCF is re-write to use Generics for the type safety feature of Java 5 and removing risk of ClassCastException while
     * compile
     *
     * Generic Types Namings Convention
     *
     * E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
     * K – Key (Used in Map)
     * N – Number
     * T – Type
     * V – Value (Used in Map)
     * S,U,V etc. – 2nd, 3rd, 4th types
     *
     * Generics and Inheritance - compilation error since Class<String> is not a Class<Object>
     *
     * Generics Wildcards - Question Mark ? - unknown type
     * The wildcard can be used as the type of a parameter, field, or local variable and sometimes as a return type
     *
     */

    //Generics in method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }


    public static void main(String[] args) {

        //Specify the Type of the List on creation so you are type safety!
        List<String> stringList = new ArrayList<String>();
        stringList.add("Deal");

        //Since Java 7 you can use a empty generic for ArrayList
        List<String> stringa = new ArrayList<>();

        for (String str : stringa){
            //for loop you dont need to specify the type!
        }

        //OLD WAY
        GenericsTypeOld typeOld = new GenericsTypeOld();
        //Set
        typeOld.set("Deal");
        //String
        String s = (String) typeOld.get(); // That cast here can throw ClassCastException

        //New Way
        GenericsType<String> stringGenericsType = new GenericsType<>();
        stringGenericsType.set("Deal");


        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Deal");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Deal");

        GenericsType<Integer> g3 = new GenericsType<>();
        g3.set(1);
        

        boolean isEqual = GenericA.isEqual(g1, g2);
        //above statement can be written simply as

        //Next One
        GenericsType genericsType = new GenericsType(); //Raw Type need to add annotation for this one in order to not show runtime exception
        genericsType.set("Deal");


    }

    //Example of two classes showing usage of Generics

    public static class GenericsTypeOld {

        private Object t;

        public Object get() {
            return t;
        }

        public void set(Object t) {
            this.t = t;
        }
    }

    public static class GenericsType<T> {

        private T t;

        public T get(){
            return this.t;
        }

        public void set(T t1){
            this.t=t1;
        }
    }

    //Example Interface of Generic Types Comparable Excelent
    public interface Comparable<T> {
        public int compareTo(T o);
    }

    //Example of new HashMap<String, List<String>>();

}
