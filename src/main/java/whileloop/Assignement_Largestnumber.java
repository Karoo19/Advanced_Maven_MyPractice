package whileloop;

public class Assignement_Largestnumber {

	public static void main(String[] args) {
		
		//largest 2 numbers( if..else & ternary)
		//a>b  a largest number
		//b>a  b largest number
		
		/*int a =200, b=300;
		if(a>b) {
			System.out.println("a is largest number: "+ a);
		}else if(b>a) {
			System.out.println("b is largest number: "+ b);
		}*/
		
		
		//smallest of 3 numbers (if...else)
		//a<b a smallest number
		//b< a a smallest 
		int a = 100, b = 99;
		
		if(a<b) {
			System.out.println("a is smallest number: "+ a);
		}else 
		{
			System.out.println("b is smallest number: "+ b);
		}
		
		//print month name ny taking month number1...12 using switch case
		
		int monthno=6;
		
		switch(monthno) {
			
			case 1: System.out.println("January");break;
			case 2: System.out.println("February");break;
			case 3: System.out.println("March");break;
			case 4: System.out.println("April");break;
			case 5: System.out.println("Mai");break;
			case 6: System.out.println("June");break;
			case 7: System.out.println("July");break;
			case 8: System.out.println("Aout");break;
			case 9: System.out.println("September");break;
			case 10: System.out.println("October");break;
			case 11: System.out.println("November");break;
			case 12: System.out.println("December");break;
			default: System.out.println("Invalid month number");
		}
		
		
		
		
		
		
		

	}

}
