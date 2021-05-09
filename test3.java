package javatest;

class Weather {
	String day;
	int temperature;
	double rain;
	
	void setDay(String d) {
		day = d;
	}
	void setTemperature(int t) {
		temperature = t;
	}
	void setRain(double r) {
		rain = r;
	}
	
	void printWeather() {
		System.out.println("날짜 : " + day + ", 온도 : " + temperature
				+ ", 강수확률 : " + rain);
	}
	
	void changeWeather(String d, int t, double r) {
		day = d;
		temperature = t;
		rain = r;
	}
	void changeWeather(int t, double r) {
		temperature = t;
		rain = r;
	}
	void changeWeather(String d, int t) {
		day = d;
		temperature = t;
	}
	void changeWeather(int t) {
		temperature = t;
	}
}

public class Test_20210416_2 {
	public static void main(String[] args) {
		Weather w = new Weather();

		w.setDay("2021/04/16");
		w.setTemperature(26);
		w.setRain(22.5);

		w.printWeather();

		w.changeWeather(30);
		w.changeWeather("2021/04/20", 36, 61.7);
		w.changeWeather(19, 83.3);

		w.printWeather();
	}

}
