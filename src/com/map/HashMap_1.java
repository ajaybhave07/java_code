package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_1 {
	
		public static void main(String []	args)
		{
			HashMap<String,String> studentMap = new HashMap<String,String>();
			
			studentMap.put("nitin", "jabalpur");
			studentMap.put("john", "delhi");
			studentMap.put("kartik", "indore");
			studentMap.put("jatin", "jabalpur");
			studentMap.put("ishan", "kochi");
			studentMap.put("tanmay", "pune");
			studentMap.put("mayan", "kolhapur");
			
			
			// to get the values we need to pass key
			System.out.println(studentMap.get("john")); //delhi
			System.out.println(studentMap.get("amit")); //null (specified key is not present)
			
			//updating value
			studentMap.put("tanmay", "banglore"); //re assigning value as banglore
			
			System.out.println(studentMap.get("tanmay"));//banglore
			
			studentMap.put(null, "vinay"); //valid
			System.out.println(studentMap.get(null)); //vinay
			
			//we can have multiple null value , but only 1 null key
			
			//Iterator over keys
			Iterator<String> it = studentMap.keySet().iterator();
			
			while(it.hasNext())
			{
				String key = it.next();
				String value = studentMap.get(key);
				System.out.println(key +" - "+value);
			}
			
			//getting each entry
			Iterator<Entry<String,String>> itr	=studentMap.entrySet().iterator();
			
			while(itr.hasNext())
			{
				Entry<String,String> entry =itr.next();
				System.out.println(entry.getKey()+" == "+entry.getValue());
				
			}
				
			//using lambda expression
			
			studentMap.forEach((k,v)->System.out.println(k+" ~ ~ "+v));
			
			
			
			
			
		}
		//hashmap in not synchronized
		}
