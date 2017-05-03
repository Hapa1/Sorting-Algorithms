package sorter;

public class InsertionSort {
	
	public Student[] iSort(Student[] studentList){
		Student temp = new Student(0,"");
		
		for(int i = 1; i < studentList.length; i++){
			
			for( int j = i; j > 0; j--){
				
				if(studentList[j].getId() < studentList[j-1].getId()){
					temp = studentList[j];
					studentList[j] = studentList[j-1];
					studentList[j-1] = temp;
					
				}
			}
		}
		
		return studentList;
		
	}	
}