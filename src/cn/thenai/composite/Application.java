package cn.thenai.composite;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"哈哈");


        Map<Integer, String> map = new HashMap<>();
        map.put(1,"嘿嘿");
        map.put(2,"咯咯");

        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}