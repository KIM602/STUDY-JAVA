package com.kyk.ch02Project5;

public class MainClass {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		//e�� ������ ��Ÿ���� 10�� ����� ǥ�ý� ���
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("fi=%f, %e, %g%n", f1, f1, f1);
		//f1���� %f, %e, %g������� �����
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		//���� d���� %f�� ���
		System.out.printf("d=%14.10f%n", d);
		//���� d���� %f�������� ����ϵ� �Ҽ��� ���� ���ڸ��� 14������ �Ҽ����� 10�ڸ�, ���ڸ��� ����
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		//url������ ���ڿ��� ǥ���ϵ� ���ڸ����� 20�̸� ������ ����(+)
		System.out.printf("[%-20s]%n", url); //���� ����(-)
		System.out.printf("[%.8s]%n", url); //���ʿ��� 8���ڸ� ���
	}

}