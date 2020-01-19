public class ClassList {
	 Map<String,String> classList =new HashMap<String,String>();
	 public void ClassGrades() {
		 classList.put("Bob","A");
		 classList.put("Mary","C");
		 classList.put("Sarah","B");
		 classList.put("Philip","A");
		 classList.put("Greg","F");
		  }
	 public void printClassList() {
		 Iterator<Entry<String,String>> entries=classList.entrySet().iterator();
		while(entires.hasNext()) {
			 Entry<String,String>entry = entries.next();
			 System.out.println("key=" +entry.getKey() +",Value="+entry.getValue());
		 }
	 }
	 public void printClassList2() {
		 for(Map.Entry<String, String> entry: ClassList.entrySet()) {
			 System.out.println("key=" +entry.getKey() +",Value="+entry.getValue());
		 }
		 for (String key : classList.keySet()){
			 System.out.println("Key ="+key);
		 }
		 for (String value : classList.values()){
			 System.out.println("value ="+value );
	     }
	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassGrades myClassList= new ClassGrades();
		 myClassList.printClasslist();
        }
