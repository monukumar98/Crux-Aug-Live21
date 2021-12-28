package Lec56;

public class Client_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String, Integer> map = new Hashmap<>();
		map.put("Ram", -99);
		map.put("Ram", 90);
		map.put("Rohan", 87);
		map.put("Pooja", 85);
		map.put("Kamal", 90);
		map.put("Amisha", 95);
		map.put("Karan", 89);
		map.put("Puneet", 79);
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get("Amisha"));
		System.out.println(map.get("Kunal"));
		System.out.println(map.ContainsKey("Kunal"));
		// System.out.println(map.remove("Amisha"));
		System.out.println(map);
		System.out.println(map.remove("Kunal"));
		System.out.println(map.size());

	}

}
