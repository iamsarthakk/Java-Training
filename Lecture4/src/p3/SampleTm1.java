package p3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SampleTm1 {
		public static void main(String[] args) {
			TreeMap<String, Double> tm = new TreeMap<String, Double>();
			tm.put("John Doe", 3434.34);
			tm.put("Tom Smith", 3434.34);
			tm.put("Jone Baker", 1378.00);
			tm.put("Tod Hall", 99.22);
			tm.put("Ralph Smith",99.22);
			
			Set<Map.Entry<String, Double>> set = tm.entrySet(); //TreeMap is subclass of Map.Entry
			
			for(Map.Entry<String, Double> me: set) {
				System.out.println(me.getKey()+".");
				System.out.println(me.getValue());
				System.out.println();
			}
			
			double balance = tm.get("John Doe");
			tm.put("John Doe", balance+1000);
			System.out.println("John Doe's new balance: "+tm.get("John Doe"));
		}
}
