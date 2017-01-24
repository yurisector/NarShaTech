package taskSujeong;

class operator<T extends Number>{
	private double num1;
	private double num2;
	public 
	 operator(){}
	 operator(T number1, T number2)
	 {
		 this.num1 = (double) number1;
		 this.num2 = (double) number2;
	 }
	    double add(T number1, T number2) {
	       // code omitted 
	    	return num1 + num2;
	    }
	    
	    double sub(T number1, T number2) {
		       // code omitted 
		    	return num1 - num2;
		    }
	    double mul(T number1, T number2) {
		       // code omitted 
		    	return num1 * num2;
		    }
	    double div(T number1, T number2) {
		       // code omitted 
		    	return num1 / num2;
		    }
	
	
}

public class calculator{
	public static void main(String[] args)
	{
		
	}
}