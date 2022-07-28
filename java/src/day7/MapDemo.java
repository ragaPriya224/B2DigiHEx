package io.practice.demo456;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap foodMap = new HashMap();
		foodMap.put("tea",15);
		foodMap.put("coffee",20);
		System.out.println(foodMap);
//		foodMap.clear();
		System.out.println(foodMap.containsKey("boost"));
		System.out.println(foodMap.containsValue(20));
		System.out.println(foodMap.get("tea"));
		System.out.println(foodMap.put("tea", 50));
		System.out.println(foodMap.putIfAbsent("tea", 100));
		System.out.println(foodMap.putIfAbsent("horlicks", 100));
		System.out.println(foodMap.remove("tea"));
		System.out.println(foodMap.replace("coffee", 20));
		System.out.println(foodMap.put("bournvita", 20));
		System.out.println(foodMap.size());
		System.out.println("keys are " + foodMap.keySet());
		System.out.println("values are " +foodMap.values());
		System.out.println(foodMap.entrySet());
		System.out.println(foodMap);
	}

}
