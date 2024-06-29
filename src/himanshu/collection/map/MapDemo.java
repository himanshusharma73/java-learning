package himanshu.collection.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","Himanshu");
        map.put("age","24");
        System.out.println(map);

        Map<Integer,Integer> map1=new HashMap<>();
        map1.put(7,-7);
        map1.put(11,-11);
        map1.put(70,-70);
        map1.put(15,-15);
        map1.put(9,-9);
        map1.put(16,-16);
        System.out.println(map1);
        System.out.println(map1.getOrDefault(71,-01));
        System.out.println(map1.get(7));
    }
}
