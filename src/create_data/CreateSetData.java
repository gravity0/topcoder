package create_data;

import java.util.HashSet;
import java.util.Set;

public class CreateSetData {
	
	
	public static Set createData(Set<Integer> set, int count){
		for(int i=0; i < count; i++){
			set.add(i);
		}
		
		return set;
	}
	
	public static Set createData(Set<Integer> set, int from, int to){
		if(from > to){
			return null;
		}
		for(int i=from; i < to; i++){
			set.add(i);
		}
		
		return set;
	}

}
