package strings;

import java.util.HashMap;

public class CountReplacement {
	public static void main(String[] args) {
		HashMap<Character,Integer> map = new HashMap<>();
		String str = "vyshnavireddy";
		for(int i=0; i<str.length(); i++) {
			int cnt = 0;
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}else {
				map.put(str.charAt(i),1);
			}
		}
		System.out.println(map);
	}
}
