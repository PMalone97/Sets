//Paris Malone 


import java.util.Arrays;
import java.util.HashSet;

public class mainClass {

    public static void main(String[] args) {

        Character[] arrayA = {'a','b','c','d', 'e'};
        Character[] arrayB = {'a','b','c','d','e','f','g','h'};

        HashSet<Character> arrA = new HashSet(Arrays.asList(arrayA));
        HashSet<Character> arrB = new HashSet(Arrays.asList(arrayB));

        //union
        HashSet<Character> unionSet = new HashSet(arrA);
        unionSet.addAll(arrB);
        System.out.println("Union");
        System.out.println(unionSet);

        //intersection
        HashSet<Character> intersectionSet = new HashSet(arrA);
        intersectionSet.retainAll(arrB);
        System.out.println("Intersection");
        System.out.println(intersectionSet);

        //difference of A-B
        HashSet<Character> differenceSetA = new HashSet(arrA);
        differenceSetA.removeAll(arrB);
        System.out.println("Difference of A - B");
        System.out.println(differenceSetA);

        //difference of B-A
        HashSet<Character> differenceSetB = new HashSet(arrB);
        differenceSetB.removeAll(arrA);
        System.out.println("Difference of B - A");
        System.out.println(differenceSetB);
    }

}

