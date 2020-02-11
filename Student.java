package ImpConcepts;

import java.util.Comparator;

public class Student {

	int id;
	String name;
	double per;
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public Student(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.per = d;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private double getPer() {
		return per;
	}
	private void setPer(float per) {
		this.per = per;
	}
	public static Comparator sortById = new Comparator<Student>() {
		public int compare(Student o1,Student o2)
		{
			return o1.getId()-o2.getId();
		}
		
	};
	public static Comparator<Student> sortByName = new Comparator<Student>() {
		public int compare(Student o1,Student o2)
		{
			return o1.getName().compareTo(o2.getName());
		}
		
	};
	public static Comparator sortByPer = new Comparator<Student>() {
		public int compare(Student o1,Student o2)
		{
			return (int) (o1.getPer()-o2.getPer());
		}
		
	};
	
	public String toString()
	{
		return this.getId()+this.getName()+this.getPer();
		
	}
	
	}

