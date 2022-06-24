package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_2 {
	
	public static void main(String [] args)
	{
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("delhi", "india");
		map1.put("london", "UK");
		
		
		Set<String> set_1 = map1.keySet();
		Collection<String> set_2 = map1.values();
		
		Set<Entry<String,String>> entry_set = map1.entrySet();
		
		for(Entry<String,String> entry:entry_set)
		{
			System.out.println(entry.getKey()+"  ++  "+entry.getValue());
		}
		
		
	}

}
