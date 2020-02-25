package programsForInterview;

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {

		String str="programming";
		String[] split=str.split("");
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0;i<split.length;i++){
			if(map.containsKey(split[i])){
				int count=map.get(split[i]);
				map.put(split[i], count+1);
			}
			else{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}
