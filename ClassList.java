import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ClassList {
 // first comitt

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassList classgrades = new ClassList();
		classgrades.printClassList();
	}
	Map<String,String> classgrades = new HashMap<String,String>();
	public ClassList() {
		classgrades.put("Bob","A");
		classgrades.put("Mary","C");
		classgrades.put("Sarah","B");
		classgrades.put("Philip","A");
		classgrades.put("Greg","F");
	}

	public void printClassList() {
	Iterator<Entry<String, String>> entries = classgrades.entrySet().iterator();
	while (entries.hasNext()) {
	Entry<String, String> entry = entries.next();
	System.out.println("Key = " +entry.getKey() + " ,Value = " + entry.getValue());
	}
	}


	public void printClassList2() {
	for(Map.Entry<String, String> entry : classgrades.entrySet()) {
	   System.out.println("Key = " +entry.getKey() + " ,Value = " + entry.getValue());
	}

	for (String key : classgrades.keySet()) {
	System.out.println("Key = " + key);
	}

	for (String value : classgrades.values()) {
	System.out.println("Values = " + value);
	}

	}
	
}
