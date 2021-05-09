class Truck {
	boolean overWeight; //중량초과여부
	int weight; //총중량
	int load; //적재가능중량
	 
	void printTruck() {
		System.out.println("적재가능중량 : " + load);
		System.out.println("총중량 : " + weight);
		System.out.println("허용중량 초과여부  : " + overWeight);
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
