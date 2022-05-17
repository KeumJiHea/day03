package day03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("수 입력");
//		num = input.nextInt();
//		
//		if(num>100) {
//			System.out.println("100 보다 크다.");
//		}else if(num>70) {
//			System.out.println("70 보다 크다.");
//		}else if(num>40) {
//			System.out.println("40 보다 크다.");
//		}else {
//			System.out.println("그 외의 값");
//		}

//		문제 1) 국어, 영어, 수학 점수를 입력받고 평균이 80점 이상이면 "합격"을 출력하세요.
//			  - 단, 한 과목이라도 60점 미만일시 "불합격"을 출력하세요.
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("국어 점수 입력: ");
//		int kor = input.nextInt();
//		System.out.print("영어 점수 입력: ");
//		int eng = input.nextInt();
//		System.out.print("수학 점수 입력: ");
//		int mat = input.nextInt();
//		
//		double avg = (kor+eng+mat)/3.0;
//		
//		if(avg>=80) {
//			if(kor>60 && eng>60 && mat>60)
//				System.out.println("합격");
//			else
//				System.out.println("불합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		
//		문제2
//		- 나이를 입력받아서 성인과 미성년자로 구분하세요.
//		- 성인인 경우에 20 ~ 39세라면 '청년', 이 이상이면 '중장년'으로 구분합니다.
//		- 미성년인 경우에는 14 ~ 19세는 '청소년', 14세 미만은 '어린이'로 분리한다.
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("나이 입력: ");
//		int age = input.nextInt();
//		
//		if(age>=20) {
//			System.out.print(age + "살은 성인, ");
//			if(age<40)
//				System.out.print("청년입니다.");
//			else
//				System.out.print("중장년입니다.");
//		}else {
//			System.out.print(age + "살은 미성년자, ");
//			if(age<14)
//				System.out.print("어린이입니다.");
//			else
//				System.out.print("청소년입니다.");
//		}
		
// 		1. 한 학교에 반이 6개 있다. 총 학생 수를 입력하고 
//  	   반 당 최대 인원수와 남은 학생 없이 다 채워졌다면 "학기 시작", 
//  	   다 채워지지 못했다면 "학급이 부족합니다. 남은 학생은 n명입니다"라고 출력하는 프로그램을 작성하시오. 
//  	   (단 반 당 최대 인원수는 남은 인원이 가장 적은 경우로 나와야한다.)
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("총 학생 수 입력: ");
//		int student = input.nextInt();
//		
//		int max_student = student/6;
//		
//		if(student%6==0) {
//			System.out.println("반 당 최대 인원수: " + max_student);
//			System.out.println("학기 시작");
//		}else {
//			System.out.println("반 당 최대 인원수: " + max_student);
//			System.out.println("학급이 부족합니다. 남은 학생은 " + student%6 + "명입니다.");
//		}
		
		
		
// 		2. 시험 평균 점수가 70점을 넘지 못하면 보충 수업을 들어야 한다.
// 	       시험 점수 2개를 입력하고 3번째 시험은 몇 점 이상을 받아야 보충 수업을 듣지 않는지 출력해주는 프로그램을 작성하시오. 
//		   (3번째 시험 결과가 100점이 넘어야 평균 점수 70점을 넘길 경우 "보충 수업 확정"을 출력하시오".
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("시험 점수 2개 입력: ");
//		int score1 = input.nextInt();
//		int score2 = input.nextInt();
//		
//		int score3 = 210-(score1+score2);
//		
//		if(score3>100) {
//			System.out.println("보충 수업 확정!");
//		}else {
//			System.out.println(score3 + "점 이상을 받아야 패스!");
//		}
		
		
		//문제 5) 합창을 위해 키 순으로 사람들을 줄을 세우려고 한다.
		//170cm 이상은 '4번째 줄', 160cm 이상은 '3번째 줄', 150cm 이상은 '2번째 줄', 150cm 미만은 '1번째 줄'로 출력하세요.

//		Scanner input = new Scanner(System.in);
//		System.out.println("키 입력: ");
//		double height = input.nextDouble();
//		
//		if(height>=170) {
//			System.out.println("4번째 줄");
//		}else if(height>=160) {
//			System.out.println("3번째 줄");
//		}else if(height>=150) {
//			System.out.println("2번째 줄");
//		}else if(height<150) {
//			System.out.println("1번째 줄");
//		}
		
		
		//문제 6) 국어, 영어, 수학 점수를 입력하여 평균 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C',
			//그 이외에는 'D'를 출력하세요.

//		Scanner input = new Scanner(System.in);
//		System.out.print("국어 점수 입력: ");
//		int kor = input.nextInt();
//		System.out.print("영어 점수 입력: ");
//		int eng = input.nextInt();
//		System.out.print("수학 점수 입력: ");
//		int mat = input.nextInt();
//		
//		double avg = (kor+eng+mat)/3.0;
//		
//		if(avg>=90) {
//			System.out.println("A");
//		}else if(avg>=80) {
//			System.out.println("B");
//		}else if(avg>=70) {
//			System.out.println("C");
//		}else {
//			System.out.println("D");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
