package linked;
import java.util.LinkedList;
/*ArrayList                                                             	       LinkedList
       1) ArrayList internally uses a dynamic array to store the elements.	         1 )LinkedList internally uses a doubly linked list to store the elements.
        2) Manipulation with ArrayList is slow because it internally uses an array   2 )LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
    If any element is removed from the array, all the bits are shifted in memory
   Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list,
   so no bit shifting is required in memory.
        3) An ArrayList class can act as a list only because it implements List only.
        4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
*/


public class linkedMainClass {

    public static void main(String[] args) {
        LinkedList<String> firstList = new LinkedList<String>();
        // Step2: Add elements to LinkedList
        firstList.add("Tim");
        firstList.add("Rock");
        firstList.add("Hulk");
        firstList.add("Rock");
        firstList.add("James");
        System.out.println(firstList);

        // searchInLinkedList searchlist = new searchInLinkedList(firstList);
        // removeFromLinkedList removeFromList = new removeFromLinkedList();
        //removeFromList.removefromList(firstList,"Hulk");
        linked.reverselinkedList reverse = new linked.reverselinkedList();
        //  reverse.reverseList(firstList);
        reverse.reverseLinkedListWithLessComplexity(firstList);
        //  searchlist.searchInLinkedList();

    }


}
