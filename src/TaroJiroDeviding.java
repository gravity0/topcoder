import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import create_data.CreateSetData;

/**
 * devidingの意味は割り算
 * 
 * @author greapflute
 *
 */
public class TaroJiroDeviding {

	public static void main(String[] args) {
		int result = getNumber(12, 96);
		System.out.println(result);
	}

	public static int getNumber(int A, int B){
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(A);
		while(A % 2 == 0){
			setA.add(A);
			A /= 2;
		}
		setB.add(B);
		while(B % 2 == 0){
			setB.add(B);
			B /= 2;
		}
		
		setA.retainAll(setB);
		return setA.size();
	}

}
