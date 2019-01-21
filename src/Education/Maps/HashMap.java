package Education.Maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by Vishwa on 1/21/2019.
 */
public class HashMap {


    public static void main(String[] args) {

        Map<String, String> phonebook = new Hashtable<>();

        phonebook.put("Vishwa", "1212121");
        phonebook.put("Shagun", "1212125");
        phonebook.put("Neelu", "1212124");
        phonebook.put("Chunky", "1212123");
        phonebook.put(" ", "1212122");

        System.out.println(phonebook.get("Vishwa"));

        Set<String> set = phonebook.keySet();
        System.out.println(set.size());

        for (String i : set) {
            System.out.println(i + " : " + phonebook.get(i));
        }

        Set<Map.Entry<String, String>> entrySet = phonebook.entrySet();

        System.out.println(entrySet.size());

        for (Map.Entry<String, String> e : entrySet) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }


    }
}
