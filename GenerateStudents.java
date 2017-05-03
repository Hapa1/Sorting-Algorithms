package sorter;

import java.util.ArrayList;

public class GenerateStudents {
	
	
	public Student[] getStudents(ArrayList<String> al){
		Student[] sl = new Student[al.size()];
		for(int i = 0; i < al.size(); i++){
			String tempString = al.get(i);
			tempString = tempString.replace('|', ',');
			String[] str = tempString.split(",");
			int id = Integer.parseInt(str[0]);
			Student s = new Student(id,str[1]);
			sl[i] = s;
		}
		return sl;
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("88|Me m");
		al.add("23|Jo");
		al.add("323|R a nd");
		
		GenerateStudents g = new GenerateStudents();
		Student[] sl = g.getStudents(al);
		
		
		for(int i = 0; i < sl.length; i++){
			System.out.println(sl[i].toString());
			
		}
		
		
		
		
		
		
	}
	
}
