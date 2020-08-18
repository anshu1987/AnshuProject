package CollectionCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Important Points:
        This method works by randomly permuting the list elements
        Runs in linear time. If the provided list does not implement
        he RandomAccess interface, like LinkedList and is large,
        it first copies the list into an array, then shuffles the array copy, and
        finally copies array back into the list. This makes sure that the time remains linear.
        It traverses the list backwards, from the last element up to the second,
        repeatedly swapping a randomly selected element into the “current position”.
        Elements are randomly selected from the portion of the list that runs from the first element to
        the current position, inclusive
*/
public class CollectionSchuffleClass {

    public static void main(String args[]) {
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("Code");
        newList.add("Sample");
        newList.add("Collection");
        newList.add("Java");
        newList.add("intellij");
        System.out.println("list before schuffle" + newList);
        Collections.shuffle(newList, new Random());
        System.out.println("list after schuffle with only Random" + newList);
        Collections.shuffle(newList, new Random(3));
        System.out.println("list after schuffle with  Random 3" + newList);
        Collections.shuffle(newList, new Random(5));
        System.out.println("list after schuffle with  Random 9" + newList);
    }

}
