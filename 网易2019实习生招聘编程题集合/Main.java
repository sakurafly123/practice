package 网易2019实习生招聘编程题集合;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for(int y =k+1;y<=n;y++){
	//		int a = n/y;//多少个以y为长度的分区个数
			int b = (n/y)*(y-k);//分区个数满的分区有多少个满足,因为多加了个0，所以总的分区长度为n+
			//还没填的数量又n+1-(n/y)*y
	//		int c = n+1-(n/y)*y;n=(n/y)*y+n%y;
	//		int c  =1 +n%y;//最后一个区间剩下的数[1，y]
	//最后一个区间的最后一个数n的余数为n%y;比较和k的大小;
			int rest= Math.max(n%y-k+1,0);
			count=count+b+rest;
			if(k==0)count--;
		}
		System.out.println(count);
	}

}
