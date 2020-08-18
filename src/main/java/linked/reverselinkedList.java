package linked;

import java.util.LinkedList;

public class reverselinkedList {
    public void reverseList(LinkedList<String> firstList) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = firstList.size() - 1; i >= 0; i--) {
            revLinkedList.add(firstList.get(i));
        }
        System.out.println("Elements after reversing" + revLinkedList);

    }

    public void reverseLinkedListWithLessComplexity(LinkedList<String> firstList) {
        String temp = null;
        for (int i = firstList.size() - 1 / 2; i > 0; i--) {
            temp = firstList.get(firstList.size() - 1);

        }
        System.out.println(temp);
    }


}
