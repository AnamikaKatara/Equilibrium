package collectionpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HshMapPractice {

	public static void main(String[] args) {
		Map <String, Integer> Student =new  HashMap<>();
		
		Student.put("Anamika",1);
		Student.put("Goldy",2);
		System.out.println(Student);
	
		Set <String> colour =new  HashSet<>();
		
		colour.add("Blue");
		colour.add("yellow");
		
		System.out.println(colour.toString());
		
	}

}
