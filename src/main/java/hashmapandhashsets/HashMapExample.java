package hashmapandhashsets;

import java.util.HashMap;

public class HashMapExample {


    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "AA");
        hmap.put(1, "AA");
        hmap.put(1, "AA");
        hmap.put(1, "AB");
        hmap.put(2, "ABC");
        System.out.println("Hash Map Elements" + hmap.get(1));

    }

}
