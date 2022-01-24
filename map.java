package pp1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Tim");    
			      hm.put(2,"Mary");    
			      hm.put(3,"Catie");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Ramesh");  
			      ht.put(5,"Rakesh");  
			      ht.put(6,"Jackie");  
			      ht.put(7,"James");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"Albert");    
			      map.put(9,"Chandan");    
			      map.put(10,"karishma");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
			      
	}
}
