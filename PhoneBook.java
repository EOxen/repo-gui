/**
 * Java Core. Homework 4.
 *
 * @author Elena Oxenhorn
 * @version 03.11.2021
 */

import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBook {
    HashMap<String, ArrayList<String>> nameAndPhone = new HashMap<>();

    public void add(String name, String phone) {
        if (nameAndPhone.get(name) == null) {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            nameAndPhone.put(name, phones);
        }
        else {
            nameAndPhone.get(name).add(phone);
        }
    }

    public ArrayList<String> get(String name) {
        return nameAndPhone.get(name);
    }
}