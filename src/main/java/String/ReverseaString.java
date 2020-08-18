package String;

public class ReverseaString {

    public String reverseAString(String stringToManipulate) {


        //		stringToManipulate = "AutomationTesting";
        //Method1
        //Prerequisite : String vs StringBuilder vs StringBuffer in Java

        /**Following are some interesting facts about String and StringBuffer classes :
         1. Objects of String are immutable.
         2. String class in Java does not have reverse() method, however StringBuilder
         class has built in reverse() method.
         3. StringBuilder class do not have toCharArray() method,
         while String class does have toCharArray() method.**/

        StringBuilder builderString = new StringBuilder();
        System.out.println("String after reversing from Builder String   " + builderString.append(stringToManipulate).reverse());

        System.out.println("String to manipulate" + stringToManipulate);

        //Method 2
        /**Converting String into Bytes: getBytes() method is used to convert the input string into bytes[].
         Method:
         1. Create a temporary byte[]  of length equal to the length of the input string.
         2. Store the bytes (which we get by using getBytes() method) in reverse order into
         the temporary byte[] .
         3. Create a new String abject using byte[] to store result.**/

        byte[] strAsByteArray = stringToManipulate.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        System.out.println("String after Reversing from Byte Array   " + new String(result));

        //Method 3
        /**Converting String to character array: The user input the string to be reversed.
         Method:		**/
        String temp = null;
        char[] mystring = stringToManipulate.toCharArray();
        for (int i = mystring.length - 1; i >= 0; i--) {
            temp = temp + mystring[i];
        }
        System.out.println("String to reverse using Char Array" + temp.substring(4));

        //Method4
        //Convert the input string into character array by using the toCharArray(): Convert the input string into character array by using the toCharArray() – built in method of the String Class. Then, scan the character array from both sides i.e from the start index (left) as well as from last index(right) simultaneously.
        //Set the left index equal to 0 and right index equal to the length of the string -1.
        //Swap the characters of the start index scanning with the last index scanning
        //one by one. After that, increase the left
        //index by 1 (left++) and decrease the right
        //by 1 i.e., (right--) to move on to the next
        //characters in the character array .
        //Continue till left is less than or equal the right.

        String tempString = "Geeks For Geeks";
        char[] temparray = tempString.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
        for (left = 0; left < right; left++, right--) {
            char tempo = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = tempo;
        }
        temp = " ";
        for (char c : temparray)
            temp = temp + c;

        System.out.print("Values after swapping  " + temp.trim());

        return stringToManipulate;
    }

}
