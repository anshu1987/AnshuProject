package arrays;

import constantpackage.ConstantClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Testclass extends ConstantClass {

    /**
     * @param stringTomanipulate
     * @param manipulationType   : palindrome, reverse a string, print a star, count number of occurences
     * @return
     */

    public static String manipulateString(String stringTomanipulate[], String manipulationType) {
        if (manipulationType.contains(PALINDROME)) {

        }


        return null;
    }

    /**
     * This function will print elements of Array
     */
    public void printElementsofArray() {
        int[] elementsToPrint = {23, 45, 10, 18};
        for (int elementToPrint : elementsToPrint) {
            System.out.println(elementToPrint);
        }
    }

    /**
     * This function will Sort Array
     */
    public void sortAnArray(int numberToFind) {
        int[] elementstoSort = {12, 78, 5, 10, 0};
        Arrays.sort(elementstoSort);
        for (int sortedelement : elementstoSort) {
            if (sortedelement == numberToFind) {

            }
            System.out.println(sortedelement);
        }
    }

    //Write a program to check whether two given Arrays are equal,
    //given both contains same data type and same length ?

    public void verifyArraysAreEqual() {
        int[] firstArray = {2, 7, 8, 9};
        int[] secondArray = {8, 10, 67, 45};
        System.out.println(Arrays.equals(firstArray, secondArray));
        int[] ThirdArray = {8, 10, 67, 45};
        System.out.println(Arrays.equals(secondArray, ThirdArray));
    }

    //Write a program to throw ArrayOutOfBoundsException
    public void verifyArrayOutofBoundException() {
        int[] testArray = {1, 2, 9, 3, 4};
        int element = testArray[9];
        for (int temp : testArray) {
            System.out.println(temp);
        }
    }

    //What is the difference between Array and ArrayList ?
    //Array is static in size i.e of fixed length.
    //Size can not be changed after declaration. ArrayList is dynamic in nature. I
    //If you add elements to an ArrayList, it will automatically increase its size.
    //Array can contain both primitive and Object data types.
    //ArrayList does not contain primitive data types. It only contains object entries.
    //You can find the 8 difference between Array and ArrayList here.

    /**
     * Array List Example
     */
    public void arrayListExample() {
        ArrayList<String> arrayListObject = new ArrayList<String>();
        arrayListObject.add("First Row of Array");
        arrayListObject.add("Second Row of Array");
        Iterator It = arrayListObject.iterator();
        System.out.println("ArrayList object output :");
        while (It.hasNext())
            System.out.println(It.next());
    }

    /**
     * Sort Array List Exmaple
     */
    public void sortArrayList() {
        ArrayList<String> sortArray = new ArrayList<String>();
        sortArray.add("USA");
        sortArray.add("Canada");
        sortArray.add("America");
        sortArray.add("Europe");
        System.out.println("Countries before Sorting");
        for (String sortCountries : sortArray) {
            System.out.println(sortCountries);
        }
        Collections.sort(sortArray);
        /* Sorted Countries List*/
        System.out.println("Countries List After Sorting:");
        for (String sortCountries : sortArray) {
            System.out.println(sortCountries);
        }
    }


    public void printArrayBackward() {
        int[] myarray = new int[]{1, 5, 3, 4};

        System.out.println(myarray.length);
        for (int i = myarray.length; i > 0; i--) {
            System.out.println(myarray[i - 1]);
        }
        System.out.println(myarray);
    }

    // Use Add All method to add into Array List
    public void addAllExample() {
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        arraylist1.add(1);
        arraylist1.add(2);
		/*for (int i=0;i<5;i++){
			arraylist1.add(i);
		}*/

        System.out.println("Elements of Array list 1");
        //Print element of array list
        for (Integer num : arraylist1) {
            System.out.println(arraylist1);
        }
        for (int i = 6; i < 10; i++) {
            arraylist2.add(i);
        }
        //Print element of array list
        for (Integer number : arraylist2) {
            System.out.println("Elements of array list" + arraylist2);
        }
        arraylist1.addAll(5, arraylist2);
        //Print element of array list
        for (Integer number : arraylist1) {
            System.out.println("Elements of array list after merge" + arraylist1);
        }
    }


}
