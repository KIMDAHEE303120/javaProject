package operators;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수 
		int pencilsPerStudents = pencils / students;
		System.out.println("한 학생당 " + pencilsPerStudents +"개");
		
		//남는 연필의 수
		int pencilsLeft = pencils % students;
		System.out.println("남은 연필의 수: " + pencilsLeft);
	}

}
