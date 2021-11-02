/**
 * Java Core. Homework 4.
 *
 * @author Elena Oxenhorn
 * @version 03.11.2021
 */

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Color collection:");
        String[] words = {"red", "orange", "yellow", "green", "blue", "purple", "yellow",
        "blue", "red", "yellow", "green", "purple", "yellow"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (String w: words) {
            hm.put(w, 0);
        }
        for (Map.Entry<String, Integer> o : hm.entrySet()) {
            System.out.print(o.getKey()+" ");
        }
        System.out.println();

        for (String w: words) {
            if (hm.get(w) == null) {
                hm.put(w, 1);
            }
            else {
                hm.put(w, hm.get(w)+1);
            }
        }
        System.out.println(hm);
        System.out.println();
        System.out.println("Pnone book:");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "1234567");
        phoneBook.add("Ivanov", "5658424");
        phoneBook.add("Ivanov", "5188985");
        phoneBook.add("Petrov", "6849852");
        phoneBook.add("Petrov", "6589855");
        phoneBook.add("Sidorov", "8515713");
        
        System.out.println("Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov: " + phoneBook.get("Sidorov"));
    }
}