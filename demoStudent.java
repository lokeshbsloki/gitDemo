package ImpConcepts;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class demoStudent {

	private static final int TreeSet = 0;

	public static void main(String[] args) 
	{
     Scanner s=new Scanner(System.in);
    
      Comparator sort=null;
     System.out.println("1--->sort by id");
     System.out.println("2--->sort by name");
     System.out.println("3--->sort by percentage");
     switch (s.nextInt()) 
     {
	case 1: sort=Student.sortById;
		break;
	case 2:
		sort=Student.sortByName;
        break;
	case 3:
		sort=Student.sortByPer;
        break;

	default:System.out.println("muchkond correct number enter madu");
		break;
	}
     TreeSet<Student> ts=new TreeSet<Student>(sort);
     ts.add(new Student(1, "lokesh",80));
     ts.add(new Student(2, "mallesh",90));
     ts.add(new Student(3, "charu",99));
     ts.add(new Student(4, "prakash",100));
     ts.add(new Student(5, "anusha",35));
     System.out.println(ts);
     
	}

}
