package ũ�Ѹ�;

import java.io.FileWriter;

public class ���̹�����UI {

	public static void main(String[] args) {
		//005930 �Ｚ���� 293490 īī��������  019170 ��ǳ���� 253840 ������ 047820 �ʷϹ�
		
		String[] codes= {"005930","293490","019170","253840","047820"};
		String[] names= {"�Ｚ����","īī��������","��ǳ����","������","�ʷϹ�"};
		
		���̹�����ũ�Ѹ� naver = new ���̹�����ũ�Ѹ�();
		for (int i = 0; i < codes.length; i++) {
			
			String[] result = naver.crawl(codes[i]);
			
			try {
				FileWriter file = new FileWriter(result[0]+".txt");
				file.write(result[0]+"\n"); //�̸�
				file.write(result[1]+"\n"); // �ڵ�
				file.write(result[2]+"\n"); // ���簡
				file.write(result[3]+"\n"); // �������� ����
				file.write(result[4]+"\n"); // ��������
				file.write(result[5]+"\n"); // ����
				file.write(result[6]+"\n"); // ��
				file.close();
			} catch (Exception e) {
				System.out.println("���� ���� �� �����߻���!");
			}
		}
		
		
		
	}

}
