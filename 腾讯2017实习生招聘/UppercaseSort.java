package 腾讯2017实习生招聘;

import java.util.Scanner;

public class UppercaseSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char ch[]=sc.next().toCharArray();
			boolean flag=false;//判断有没有大写字母出现
			int len=0;//大写字母的长度；
			for(int i=0;i<ch.length;i++){
				if('a'<=ch[i]&&ch[i]<='z'){
					if(!flag){
						continue;
					}else{
						exchange(len,i,ch);
					}
				}else if('A'<=ch[i]&&ch[i]<='Z'){
					len++;
					flag=true;//出现后true
				}
			}
			String a = new String(ch);
			System.out.println(a);
		}
	}

	private static void exchange(int len, int i,char[] ch) {
		for(int j=i-len;j<=i-1;j++){
			char temp=ch[j];
			ch[j]=ch[i];
			ch[i] = temp;
		}
			
	}

}
