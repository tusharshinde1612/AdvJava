package ListInterface;

import java.util.ArrayList;

public class Exercise5 {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("\nOriginal array list: " + c1);
		System.out.println("\nPrint using index of an element: ");
		int no_of_elements = c1.size();
		//System.out.println(no_of_elements);
		int index;
		for (index=0; index < no_of_elements; index++)
			if(index==1) {
				//c1.remove(index);
				c1.add(index, "Pink");
				System.out.println(c1.get(index));
				//index++;
			}else if(index==4) {
				//c1.remove(index);
				c1.add(index,"Blue");
				System.out.println(c1.get(index));
				//index++;
			}else {
				System.out.println(c1.get(index));
			}
			
	}
}
