package whileloop;

public class LargestofNumbers {

	public static void main(String[] args) {
		// 
		
		int a =100, b=800, c=500;
		
		if(a>b && a>c) {
			System.out.println("a is largest number:"+ a);
		}else if(b>a && b>c){
			System.out.println("b is greater:"+ b);
		}else {
			System.out.println("c is largest number: "+ c);
		}

	}

}
