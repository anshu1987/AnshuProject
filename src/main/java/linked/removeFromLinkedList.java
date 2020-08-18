package linked;

import java.util.LinkedList;

public class removeFromLinkedList {

    public void removefromList(LinkedList firstList, String paramToremove) {

        System.out.println("List before removal" + firstList);
        firstList.remove(paramToremove);
        firstList.removeFirst();
        System.out.println("List after removal" + firstList);
    }

}
