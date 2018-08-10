package practice;

import java.util.Scanner;

public class FaceToSouth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int num_l=0;
		int num_r=0;
		
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if(c=='L') num_l++;
			else num_r++;
		}
		if(num_l==num_r)System.out.println('N');
		else if(num_l>num_r){
			int num1 = num_l-num_r;
			int rest=num1%4;
			switch (rest) {
			case 1:
				System.out.println('W');
				break;
			case 2:
				System.out.println('S');
				break;	
			case 3:
				System.out.println('E');	
				break;	
			case 0:
				System.out.println('N');		
				break;
			default:
				break;
			}
		}else{
			int num1 = num_r-num_l;
			int rest=num1%4;
			switch (rest) {
			case 1:
				System.out.println('E');
				break;
			case 2:
				System.out.println('S');
				break;	
			case 3:
				System.out.println('W');	
				break;	
			case 0:
				System.out.println('N');		
				break;
			default:
				break;
			}
		}
		
	}

}
