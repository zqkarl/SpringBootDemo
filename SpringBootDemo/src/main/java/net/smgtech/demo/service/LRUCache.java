package net.smgtech.demo.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{
	
	private int cacheSize;

	public LRUCache(int cacheSize) {
		super(16, 0.75f, true);
		this.cacheSize = cacheSize;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
	    return size() >= cacheSize;
	}
	
	public static void main(String[] args) {
		// 直接linkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(5, 0.75f, true);
		for(int i = 0; i<=10; i++) {
			linkedHashMap.put(Integer.toString(i), i);
		}
		Iterator<Map.Entry<String, Integer>> iterator = linkedHashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) iterator
					.next(); 
		    System.out.println(entry.getKey()+":"+entry.getValue()); 
		}
	}
}
