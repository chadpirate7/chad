public class TEST20210514 {

	import java.util.Scanner;

	import javax.swing.JOptionPane;

	public class Test_20210513_4 {
		public static void main(String[] args) {
			int PW = 1234;
			int tempPW;
			int menu;

			int money = 0; //�ܾ�
			int addMoney = 0; //�Ա�
			int deleteMoney = 0; //���

			while (true) {
				
				System.out.println("---JAVA ATM----");
				System.out.println("1. �Ա�");
				System.out.println("2. ���");
				System.out.println("3. �ܾ���ȸ");
				System.out.println("4. ����");

				System.out.print("���Ͻô� �޴� ��ȣ�� �����ÿ� : ");
				Scanner sc = new Scanner(System.in);
				menu = sc.nextInt();

				if (menu == 1) {
					System.out.println("----�Ա�----");
					System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ� : ");
					addMoney = sc.nextInt();
					money += addMoney;
					System.out.println(addMoney + "�� �Ա��� �Ϸ�Ǿ����ϴ�.");
					System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");

				} else if (menu == 2) {
					System.out.println("----���----");
					System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
					tempPW = sc.nextInt();
					if (tempPW == PW) {
						System.out.print("����� �ݾ��� �Է��Ͻÿ� : ");
						deleteMoney = sc.nextInt();
						if (money < deleteMoney) {
							System.out.println("�ܾ��� �����մϴ�.");
						} else {
							money -= deleteMoney;
							System.out.println(deleteMoney + "�� ����� �Ϸ�Ǿ����ϴ�.");
							System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
						}
					} else {
						System.out.println("��й�ȣ�� �߸� �Է��߽��ϴ�.");
					}
				} else if (menu == 3) {
					System.out.println("----�ܾ���ȸ----");
					System.out.println("���� �ܾ��� " + money + "�Դϴ�.");
				} else {
					System.out.println("----����----");
					break;
				}
			}
		}
	}

}
