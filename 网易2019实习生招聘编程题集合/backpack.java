package 网易2019实习生招聘编程题集合;

import java.util.Arrays;
import java.util.Scanner;

public class backpack {
		static long v[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//零食数量
		long n = sc.nextInt();//背包容量
		v = new long[a];
		long h=0;
		for (int i = 1; i <=a; i++) {
			int c=sc.nextInt();
			v[i]=c;
			h=h+c;
		}
		if(h<=n)
		{
			System.out.println((int)Math.pow(2, a));
		//	System.out.println("--");
			return;
		}
		Arrays.sort(v);		
		int num = func(a,n);
		System.out.println(num);

	}

	private static int func(int a, long n) {
		if(n<0)return 0;
		if(a==1&&v[1]<=n) return 2;
		else if(a==1&&v[1]>n) return 1;
		return func(a-1,n)+func(a-1,n-v[a]);
	}

}
