package class1;

public class ClassStart5 {
	public static void main(String[] args) {
		/*
		 리팩토링
		 1. 선언 단일화(배열로만 접근)
		 2. 출력문구를 반복문을 통해 심플하게 변경
		 */
		
		Student[] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();
		
		students[0].stuName = "홍길동";
		students[0].stuAge = 15;
		students[0].stuGrade = 90;
		
		students[1].stuName = "장발장";
		students[1].stuAge = 16;
		students[1].stuGrade = 80;
		
		for(Student stu : students) {
			System.out.println("이름:"+stu.stuName+" 나이:"+stu.stuAge+"세 점수:"+stu.stuGrade+"점");
		}
	}
}
