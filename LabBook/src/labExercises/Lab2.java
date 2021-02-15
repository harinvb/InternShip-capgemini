package labExercises;
import java.util.*;
public class Lab2 {

	public static void main(String[] args) {
		int[] ar1 = {4,3,5,1,2};
		
		String[] ar2 = {"efg","Abc"};
		
		int[] ar3 = {1234,9821};
		
		int[] ar4 = {1,1,2,6,4,5};
		
		System.out.println(getSecondSmallest(ar1));
		
		for(String sIterator:sortStrings(ar2))System.out.println(sIterator);
		
		for(int iIterator :getSorted(ar3))System.out.println(iIterator);
		
		for(int iIterator :modifyArray(ar4))System.out.println(iIterator);
	}
	
	static int getSecondSmallest(int[] ar) {
		Arrays.sort(ar);
		return ar[1];
	}
	
	static String[] sortStrings(String[] ar) {
		Arrays.sort(ar);
		int len = ar.length%2==0 ? ar.length/2 : ar.length/2+1;
		for(int i=0;i<len;i++)ar[i]=ar[i].toUpperCase();
		return ar;
	}
	static int[] getSorted(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int tempSum=0;
			while(ar[i]!=0) {
				tempSum *=10;
				tempSum +=ar[i]%10;
				ar[i] /=10;
			}
			ar[i]=tempSum;
		}
		Arrays.sort(ar);
		return ar;
	}
	
	static int[] modifyArray(int[] ar) {
		HashSet<Integer> hashSet =new HashSet<>();
		for(int i : ar)hashSet.add(i);
		int sz= hashSet.size();
		int[] newar =new int[sz--];
		for(int i:hashSet)newar[sz--]=i;
		return newar;
	}
}
