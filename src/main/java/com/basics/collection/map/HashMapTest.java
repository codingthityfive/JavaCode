package com.basics.collection.map;

import java.util.HashMap;

/**
 * @ClassName HashMapTest
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-04-24 22:30
 **/
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(16);
        hashMap.put("Cc",1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(1<<30);
        int i = 2147483647;
        int count =  Math.max(2*8, 11);
        System.out.println(count);

    }
}
