package 网易2019实习生招聘编程题集合;
import java.util.Scanner;

public class FaceToNouth2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c={'N','E','S','W'};
		int b = sc.nextInt();
		int index=0;
		String s = sc.next();
		for (int i = 0; i <b; i++) {
			char ch = s.charAt(i);
			if(ch=='L'){
				index=(index+4-1)%4;
			}else{
				index=(index+1)%4;
			}
		}
		System.out.println(c[index]);
	}

}
