public class TEST20210514 {

	import java.util.Scanner;

	import javax.swing.JOptionPane;

	public class Test_20210513_4 {
		public static void main(String[] args) {
			int PW = 1234;
			int tempPW;
			int menu;

			int money = 0; //잔액
			int addMoney = 0; //입금
			int deleteMoney = 0; //출금

			while (true) {
				
				System.out.println("---JAVA ATM----");
				System.out.println("1. 입금");
				System.out.println("2. 출금");
				System.out.println("3. 잔액조회");
				System.out.println("4. 종료");

				System.out.print("원하시는 메뉴 번호를 누르시오 : ");
				Scanner sc = new Scanner(System.in);
				menu = sc.nextInt();

				if (menu == 1) {
					System.out.println("----입금----");
					System.out.print("입금할 금액을 입력하시오 : ");
					addMoney = sc.nextInt();
					money += addMoney;
					System.out.println(addMoney + "원 입금이 완료되었습니다.");
					System.out.println("현재 잔액은 " + money + "원 입니다.");

				} else if (menu == 2) {
					System.out.println("----출금----");
					System.out.print("비밀번호를 입력하시오 : ");
					tempPW = sc.nextInt();
					if (tempPW == PW) {
						System.out.print("출금할 금액을 입력하시오 : ");
						deleteMoney = sc.nextInt();
						if (money < deleteMoney) {
							System.out.println("잔액이 부족합니다.");
						} else {
							money -= deleteMoney;
							System.out.println(deleteMoney + "원 출금이 완료되었습니다.");
							System.out.println("현재 잔액은 " + money + "원 입니다.");
						}
					} else {
						System.out.println("비밀번호를 잘못 입력했습니다.");
					}
				} else if (menu == 3) {
					System.out.println("----잔액조회----");
					System.out.println("현재 잔액은 " + money + "입니다.");
				} else {
					System.out.println("----종료----");
					break;
				}
			}
		}
	}

}
