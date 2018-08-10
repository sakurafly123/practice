package practice;

import java.util.Scanner;

public class streetLamp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int num =0;
			int b = sc.nextInt();
			String s = sc.next();
//			System.out.println(s);
			for (int j = 0; j < b;) {
				char c = s.charAt(j);
		//		System.err.println(j);
				if(c=='.'){
					j+=3;
					num++;
				}else{
					j++;
				}
			//	System.err.println(j);
			}
			System.out.println(num);
		}
		sc.close();
		
	}
	
}
