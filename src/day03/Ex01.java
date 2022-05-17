package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		int num = 10;
//		if(num%2==0) {
//			//조건이 참이면 종속 문장 실행
//			System.out.println("짝수");
//		}else {// if 조건이 거짓이면 else 실행
//			System.out.println("홀수");
//		}
//		System.out.println("다음 문장들 실행");
		
		// 수를 입력받아 5의 배수인지 아닌지 구분하시오

//		Scanner input = new Scanner(System.in);
//		System.out.print("수 입력: ");
//		int n = input.nextInt();
//		
//		if(n%5==0) {
//			System.out.println(n + "은 5의 배수입니다.");
//		}
//		else {
//			System.out.println(n + "은 5의 배수가 아닙니다.");
//		}
		
		// 수를 입력받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("수 입력: ");
//		int n = input.nextInt();
//		
//		if(n>0 && n<100) {
//			System.out.println("정상");
//		}
//		else {
//			System.out.println("비정상");
//		}
		
		// 수를 입력받아 짝수이면서 3의 배수이면 출력
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("수 입력: ");
//		int n = input.nextInt();
//		
//		if(n%2==0 && n%3==0) {
//			System.out.println(n + "은 짝수이면서 3의 배수입니다.");
//		}else {System.out.println(n + "은 6의 배수가 아닙니다.");}
//		
		// 수를 입력받아 짝수이면서 3의 배수이면 출력
		// 3의 배수가 아니며 짝수만 해당하면 짝수 또는 홀수
		// 짝수가 아니며 3의 배수에만 해당하면 3의 배수
		// 해당되지 않으면 해당 되지 않음
		
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력: ");
		int n = input.nextInt();
		
		if(n%6==0) {
			System.out.println(n + "은 짝수이면서 3의 배수입니다.");
		}
		else if(n%3!=0 && n%2==0) {
			System.out.println(n + "은 짝수이면서 3의 배수가 아닙니다.");
		}
		else if(n%3!=0 && n%2!=0) {
			System.out.println(n + "은 홀수이면서 3의 배수가 아닙니다.");
		}
		else if(n%3==0 && n%2!=0) {
			System.out.println(n + "은 홀수이면서 3의 배수입니다.");
		}
		else {System.out.println("해당되지 않습니다.");}
		
		
		
		
		
		
		
	}
}
