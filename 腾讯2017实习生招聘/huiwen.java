package ÌÚÑ¶2017ÊµÏ°ÉúÕÐÆ¸;

import java.util.ArrayList;
import java.util.Scanner;

public class huiwen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s1 = sc.next();
			String s2 = new StringBuffer(s1).reverse().toString();
			int maxlen = MAXLEN(s1,s2);
			System.out.println(s2.length()-maxlen);
		}
		sc.close();
	}
	private static int MAXLEN(String s1, String s2) {
		int length1=s1.length();
		int length2=s2.length();
		int [][]MAXLEN = new int[s1.length()+1][s2.length()+1];
		for(int i = 0;i<length1;i++){
			for(int j = 0;j<length2;j++){
				if(s1.charAt(i)==s2.charAt(j)){
					MAXLEN[i+1][j+1]=MAXLEN[i][j]+1;
				}else{
					MAXLEN[i+1][j+1]=Math.max(MAXLEN[i][j+1], MAXLEN[i+1][j]);
				}
				
			}
		}
		return MAXLEN[length1][length2];
	}

}
