package ����2019ʵϰ����Ƹ����⼯��;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for(int y =k+1;y<=n;y++){
	//		int a = n/y;//���ٸ���yΪ���ȵķ�������
			int b = (n/y)*(y-k);//�����������ķ����ж��ٸ�����,��Ϊ����˸�0�������ܵķ�������Ϊn+
			//��û���������n+1-(n/y)*y
	//		int c = n+1-(n/y)*y;n=(n/y)*y+n%y;
	//		int c  =1 +n%y;//���һ������ʣ�µ���[1��y]
	//���һ����������һ����n������Ϊn%y;�ȽϺ�k�Ĵ�С;
			int rest= Math.max(n%y-k+1,0);
			count=count+b+rest;
			if(k==0)count--;
		}
		System.out.println(count);
	}

}
