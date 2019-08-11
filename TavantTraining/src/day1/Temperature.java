package day1;

public class Temperature {

	Double convertToFarenheit(Double celsius)
	{
		return ((celsius*9/5)+32);
	}
	Double convertToCelsius(Double farenheit)
	{
		return ((farenheit-32)*5/9);
	}
	public static void main(String[] args) {
		Temperature temp = new Temperature();
		System.out.println("Temp of 30\u00B0C in Farenheit is "+temp.convertToFarenheit(30.0)+"\u00B0"+"F");
		System.out.println("Temp of 50\u00B0F in Celsius is "+temp.convertToCelsius(50.0)+"\u00B0"+"C");
	}

}
