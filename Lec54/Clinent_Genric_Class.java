
package Lec54;

import java.util.ArrayList;
import java.util.LinkedList;

public class Clinent_Genric_Class {
public static void main(String[] args) {
	Genric_Class<Long, String> gc = new  Genric_Class<>();
	
	
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("ramu");
	list.add(new Genric_Class<>());
	System.out.println(list);
	
	
	
}
}
