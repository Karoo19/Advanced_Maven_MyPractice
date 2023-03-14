package whileloop;

public class Add_Numbers {

	public static void main(String[] args) {
		//1+2+3+4+5+6+7+8+9+10= ??
		
		int i=1;
		int sum = 0;
		
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println("the sum of the first 10 nos is: "+sum);

	}

}
