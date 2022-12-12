package testExample;

public class FizzBuzz {
	
public String convertNumber(int number) {
	
	String s= "";
		if (number%5==0) {s="Fizz";}
		if(number%7==0) {s="Buzz";} 
		if(number%7==0 && number%5==0) {s="FizzBuzz";}
	return s;
	}
}

		
		
		



