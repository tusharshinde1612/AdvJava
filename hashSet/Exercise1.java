package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(10);
		Iterator<Integer> itr=hs.iterator();  
		while(itr.hasNext()) {
			int index=itr.next();
			for(int i=0;i<index;i++) {
				if(index==i*i) {
					//System.out.println(index);
					//hs.remove(index);
				}
			}
		}
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
}
}
