package sorter;

public class Student {

	private String name;
	private int id;
	
	public Student(int i, String n ){
		this.name = n;
		this.id = i;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return id + " " + name;
	}
	
	
}
