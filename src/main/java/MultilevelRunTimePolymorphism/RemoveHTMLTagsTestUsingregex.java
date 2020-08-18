package MultilevelRunTimePolymorphism;

public class RemoveHTMLTagsTestUsingregex {

    public static void main(String[] args) {
        String str = "<p><b>Welcome to Tutorials Point<b></p>";

        System.out.println("Before removing HTML Tags: " + str);

        str = str.replaceAll("\\<.*?\\>", "");

        System.out.println("After removing HTML Tags: " + str);

    }

}