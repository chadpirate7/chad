class Truck {
	boolean overWeight; //�߷��ʰ�����
	int weight; //���߷�
	int load; //���簡���߷�
	 
	void printTruck() {
		System.out.println("���簡���߷� : " + load);
		System.out.println("���߷� : " + weight);
		System.out.println("����߷� �ʰ�����  : " + overWeight);
	}
	
	void overWightYN() {
		if(weight>load) {
			overWeight = true;
		} else {
			overWeight = false;
		}
	}
}
public class Test_20210419_1 {

	public static void main(String[] args) {
		Truck tr = new Truck();
		
		tr.weight =1500;
		tr.load = 1000;

		tr.overWightYN();
		tr.printTruck();	
	}
}
