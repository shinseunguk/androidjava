package dbcp;

public class ConManager {
		static ConManager con ;
		
		//��ü�� ����������� üũ
		//��ü�� �ȸ���������� �������
		//��ü�� �̹� �ϳ� ������� ������ �ȸ������
		//��ü�� ����
		
		public static ConManager getInstatnce() {
			if(con == null) {
				con = new ConManager();
			}
			return con;
		}
		public void dbconnet() {
			System.out.println("db����");
		}
}
