package while_;

import java.util.Scanner;

public class TestClass05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.print("수 입력: ");
		i=input.nextInt();
		
		boolean bool= true;
		while(bool) {
			temp=i%10;
			i /= 10;
			System.out.println(temp+", ");
			if(i==0) {
				//break;
				bool=false;
			}
		}
		System.out.println("next");

	}

}
