package class1;

public class ClassStart2 {
	public static void main(String[] args) {
		
		/*
		 배열을 사용하여 코드를 다시 작성하였을 때,
		 1. 학생이 추가되어도 배열에 데이터만 추가하면 되기에 변수추가를 안해도된다.
		 2. 출력을 반복문을 통해 배열을 순차적으로 탐색하므로,
	 	  학생이 추가되어도 출력 코드를 추가할 필요가 없음.
	 	  
	 	  단점 /
	 	  	코드 변경은 최소화되었으나,
	 	  	한 학생의 데이터가 3개의 배열로 나눠서 관리가 된다.
	 	  	데이터를 변경, 삭제할 때 매우 조심히 작업을 해야한다.
	 	  	따라서 위와 같은 코드는 컴퓨터가 볼 때는 전혀 문제가 없지만,
	 	  	사람이 관리하기에는 좋은 코드가 아니다.
	 	  	
	 	  그리하여 클래스를 도입을 하였다.
	 	  클래스를 사용해 학생이라는 개념을 만들고,
	 	  각각의 학생별로 본인의 이름, 나이, 성적을 관리한다.
		 */
		String[] stuNames = {"홍길동", "장발장", "임꺽정"};
		int[] stuAges = {15, 16, 17};
		int[] stuGrades = {90, 80, 99};
		
		for(int i=0; i<stuNames.length; i++) {
			System.out.println("이름:" + stuNames[i] + " 나이:" + stuAges[i] + "세 성적:" + stuGrades[i] + "점");
			
		}
	}
}
