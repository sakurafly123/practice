package ����2019ʵϰ����Ƹ����⼯��;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Reword {
	public static void main(String[] msg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��������
		int m = sc.nextInt();//����
		int t0,t1;//t0=�����Ѷȣ�t1=��������
		int[]a =new int[m+n];
		int[]b = new int[n];
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			t0=sc.nextInt();
			a[i]=t0;
			t1=sc.nextInt();
			if(hm.containsKey(t0)){
				int value = hm.get(t0);
				if(value<t1){
					hm.replace(t0, value, t1);
					continue;
				}
			}
			hm.put(t0, t1);
		}
		for (int i = 0; i < m; i++) {
			t0=sc.nextInt();
			a[n+i]=t0;
			b[i]=t0;
			if(!hm.containsKey(t0)){
				hm.put(t0, 0);
			}
		}
		Arrays.sort(a);
		int max=0;
		for (int i = 0; i <a.length; i++) {
			int value =hm.get(a[i]);
//			if(value==0){
//			hm.replace(a[i], 0, max);
//			continue;
//			}
			max=max>value?max:value;
			hm.put(a[i],max);
		}
		for(int i =0;i<m;i++){
			System.out.println(hm.get(b[i]));
		}
		sc.close();
	}
	
}
