package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];//以分钟数排序的
		for(int i=0;i<n;i++){
			 a[i] = sc.nextInt()*60;//时
			 a[i]=a[i]+sc.nextInt();
		}
		int times = sc.nextInt();
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int wink = hours*60+minutes-times;
		Arrays.sort(a);
		int ans=0;
		for(int i = 0;i<n;i++){
			if(a[i]<=wink) ans=a[i];
			else break;
				
		}		
		System.out.println(ans/60+"  "+ans%60);
	}

}