package chapter4;

public class TemperatureConverter {
	public static void main(String[] args) {
		 System.out.println("Converting 21C to Fahrenheit. " +  convertTemp(21,'F'));
	     System.out.println("Converting 70F to Celsius. " +  convertTemp(70,'C'));

		
	}
	
	public static String convertTemp (float temperature, char convertTo) {
		if (convertTo=='F'){
            return "Converted Celsius to Fahrenheit| Temperature is: "
		+ (9*temperature/5 + 32) + " °F";
        } else if(convertTo=='C') {
           return "Converted Fahrenheit to Celsius| Temperature is:: "
        + (temperature - 32) * 5/9 + " °C";
       }  else{
           return "You have to enter either F or C as convertTo argument";
       }
}
}
