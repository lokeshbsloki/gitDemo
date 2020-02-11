package ImpConcepts;

import java.util.ArrayList;
import java.util.HashSet;

public class ex1 {

	public static void main(String[] args) 
	{

		HashSet hs=new HashSet();
		hs.add("lokesh");
		hs.add("test");
		hs.add("yantra");
		hs.add(10);
		hs.add(30);
		ArrayList al= new ArrayList(hs);
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
