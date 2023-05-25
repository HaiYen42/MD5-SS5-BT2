package rikkei.academy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceIMPL implements IDictionaryService{
    static Map<String, String> mapList= new HashMap<>();
    static {
        mapList.put("Xin chao", "hello");
        mapList.put("Thu", "Autumn");
        mapList.put("Vuong", "rick");
        mapList.put("Chuan", "standard");
        mapList.put("Yen", "swiftlet");
        mapList.put("van", "cloud");
    }

    @Override
    public List<String> findByName(String name) {
        List<String> listKey = new ArrayList<>();
        List<String> listValue = new ArrayList<>();
        mapList.forEach((key,value)->{
            listKey.add(key);
        });
        for (int i = 0; i < listKey.size(); i++) {
            if (listKey.get(i).toLowerCase().contains(name.toLowerCase())) {
                String value = mapList.get(listKey.get(i));
                listValue.add(value);
            }
        }
        return listValue;
    }
}
