package day03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("�� �Է�");
//		num = input.nextInt();
//		
//		if(num>100) {
//			System.out.println("100 ���� ũ��.");
//		}else if(num>70) {
//			System.out.println("70 ���� ũ��.");
//		}else if(num>40) {
//			System.out.println("40 ���� ũ��.");
//		}else {
//			System.out.println("�� ���� ��");
//		}

//		���� 1) ����, ����, ���� ������ �Է¹ް� ����� 80�� �̻��̸� "�հ�"�� ����ϼ���.
//			  - ��, �� �����̶� 60�� �̸��Ͻ� "���հ�"�� ����ϼ���.
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("���� ���� �Է�: ");
//		int kor = input.nextInt();
//		System.out.print("���� ���� �Է�: ");
//		int eng = input.nextInt();
//		System.out.print("���� ���� �Է�: ");
//		int mat = input.nextInt();
//		
//		double avg = (kor+eng+mat)/3.0;
//		
//		if(avg>=80) {
//			if(kor>60 && eng>60 && mat>60)
//				System.out.println("�հ�");
//			else
//				System.out.println("���հ�");
//		}else {
//			System.out.println("���հ�");
//		}
		
		
//		����2
//		- ���̸� �Է¹޾Ƽ� ���ΰ� �̼����ڷ� �����ϼ���.
//		- ������ ��쿡 20 ~ 39����� 'û��', �� �̻��̸� '�����'���� �����մϴ�.
//		- �̼����� ��쿡�� 14 ~ 19���� 'û�ҳ�', 14�� �̸��� '���'�� �и��Ѵ�.
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("���� �Է�: ");
//		int age = input.nextInt();
//		
//		if(age>=20) {
//			System.out.print(age + "���� ����, ");
//			if(age<40)
//				System.out.print("û���Դϴ�.");
//			else
//				System.out.print("������Դϴ�.");
//		}else {
//			System.out.print(age + "���� �̼�����, ");
//			if(age<14)
//				System.out.print("����Դϴ�.");
//			else
//				System.out.print("û�ҳ��Դϴ�.");
//		}
		
// 		1. �� �б��� ���� 6�� �ִ�. �� �л� ���� �Է��ϰ� 
//  	   �� �� �ִ� �ο����� ���� �л� ���� �� ä�����ٸ� "�б� ����", 
//  	   �� ä������ ���ߴٸ� "�б��� �����մϴ�. ���� �л��� n���Դϴ�"��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//  	   (�� �� �� �ִ� �ο����� ���� �ο��� ���� ���� ���� ���;��Ѵ�.)
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("�� �л� �� �Է�: ");
//		int student = input.nextInt();
//		
//		int max_student = student/6;
//		
//		if(student%6==0) {
//			System.out.println("�� �� �ִ� �ο���: " + max_student);
//			System.out.println("�б� ����");
//		}else {
//			System.out.println("�� �� �ִ� �ο���: " + max_student);
//			System.out.println("�б��� �����մϴ�. ���� �л��� " + student%6 + "���Դϴ�.");
//		}
		
		
		
// 		2. ���� ��� ������ 70���� ���� ���ϸ� ���� ������ ���� �Ѵ�.
// 	       ���� ���� 2���� �Է��ϰ� 3��° ������ �� �� �̻��� �޾ƾ� ���� ������ ���� �ʴ��� ������ִ� ���α׷��� �ۼ��Ͻÿ�. 
//		   (3��° ���� ����� 100���� �Ѿ�� ��� ���� 70���� �ѱ� ��� "���� ���� Ȯ��"�� ����Ͻÿ�".
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("���� ���� 2�� �Է�: ");
//		int score1 = input.nextInt();
//		int score2 = input.nextInt();
//		
//		int score3 = 210-(score1+score2);
//		
//		if(score3>100) {
//			System.out.println("���� ���� Ȯ��!");
//		}else {
//			System.out.println(score3 + "�� �̻��� �޾ƾ� �н�!");
//		}
		
		
		//���� 5) ��â�� ���� Ű ������ ������� ���� ������� �Ѵ�.
		//170cm �̻��� '4��° ��', 160cm �̻��� '3��° ��', 150cm �̻��� '2��° ��', 150cm �̸��� '1��° ��'�� ����ϼ���.

//		Scanner input = new Scanner(System.in);
//		System.out.println("Ű �Է�: ");
//		double height = input.nextDouble();
//		
//		if(height>=170) {
//			System.out.println("4��° ��");
//		}else if(height>=160) {
//			System.out.println("3��° ��");
//		}else if(height>=150) {
//			System.out.println("2��° ��");
//		}else if(height<150) {
//			System.out.println("1��° ��");
//		}
		
		
		//���� 6) ����, ����, ���� ������ �Է��Ͽ� ��� 90�� �̻��̸� 'A', 80�� �̻��̸� 'B', 70�� �̻��̸� 'C',
			//�� �̿ܿ��� 'D'�� ����ϼ���.

//		Scanner input = new Scanner(System.in);
//		System.out.print("���� ���� �Է�: ");
//		int kor = input.nextInt();
//		System.out.print("���� ���� �Է�: ");
//		int eng = input.nextInt();
//		System.out.print("���� ���� �Է�: ");
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
