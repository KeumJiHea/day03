package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		int num = 10;
//		if(num%2==0) {
//			//������ ���̸� ���� ���� ����
//			System.out.println("¦��");
//		}else {// if ������ �����̸� else ����
//			System.out.println("Ȧ��");
//		}
//		System.out.println("���� ����� ����");
		
		// ���� �Է¹޾� 5�� ������� �ƴ��� �����Ͻÿ�

//		Scanner input = new Scanner(System.in);
//		System.out.print("�� �Է�: ");
//		int n = input.nextInt();
//		
//		if(n%5==0) {
//			System.out.println(n + "�� 5�� ����Դϴ�.");
//		}
//		else {
//			System.out.println(n + "�� 5�� ����� �ƴմϴ�.");
//		}
		
		// ���� �Է¹޾� 0���� ũ�� 100���� ������ ����, �ƴϸ� ���������� ���
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("�� �Է�: ");
//		int n = input.nextInt();
//		
//		if(n>0 && n<100) {
//			System.out.println("����");
//		}
//		else {
//			System.out.println("������");
//		}
		
		// ���� �Է¹޾� ¦���̸鼭 3�� ����̸� ���
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("�� �Է�: ");
//		int n = input.nextInt();
//		
//		if(n%2==0 && n%3==0) {
//			System.out.println(n + "�� ¦���̸鼭 3�� ����Դϴ�.");
//		}else {System.out.println(n + "�� 6�� ����� �ƴմϴ�.");}
//		
		// ���� �Է¹޾� ¦���̸鼭 3�� ����̸� ���
		// 3�� ����� �ƴϸ� ¦���� �ش��ϸ� ¦�� �Ǵ� Ȧ��
		// ¦���� �ƴϸ� 3�� ������� �ش��ϸ� 3�� ���
		// �ش���� ������ �ش� ���� ����
		
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�: ");
		int n = input.nextInt();
		
		if(n%6==0) {
			System.out.println(n + "�� ¦���̸鼭 3�� ����Դϴ�.");
		}
		else if(n%3!=0 && n%2==0) {
			System.out.println(n + "�� ¦���̸鼭 3�� ����� �ƴմϴ�.");
		}
		else if(n%3!=0 && n%2!=0) {
			System.out.println(n + "�� Ȧ���̸鼭 3�� ����� �ƴմϴ�.");
		}
		else if(n%3==0 && n%2!=0) {
			System.out.println(n + "�� Ȧ���̸鼭 3�� ����Դϴ�.");
		}
		else {System.out.println("�ش���� �ʽ��ϴ�.");}
		
		
		
		
		
		
		
	}
}
