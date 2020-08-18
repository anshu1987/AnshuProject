package linked;

import java.util.LinkedList;

public class searchInLinkedList {

    public searchInLinkedList(LinkedList<String> firstList) {
    }

    public void searchInLinkedList(LinkedList<String> firstList) {

        //Searching first occurrence of element
        int firstIndex = firstList.indexOf("Rock");
        System.out.println("First Occurrence: " + firstIndex);

        //Searching last occurrence of element
        int lastIndex = firstList.lastIndexOf("Rock");
        System.out.println("Last Occurrence: " + lastIndex);
    }

}
