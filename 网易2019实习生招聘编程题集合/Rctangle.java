package 网易2019实习生招聘编程题集合;
import java.util.Arrays;
import java.util.Scanner;

public class Rctangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x1[]= new int[n];
		int y1[]= new int[n];
		int x2[]= new int[n];
		int y2[]= new int[n];
		int x[]=new int [2*n];
		int y[]=new int[2*n];
		int [][]array=new int[2*n][2*n];
		for (int i = 0; i < n; i++) {
			x1[i]=sc.nextInt();
			x[i]=x1[i];
		}
		for (int i = 0; i < n; i++) {
			y1[i]=sc.nextInt();
			y[i]=y1[i];
		}
		for (int i = 0; i < n; i++) {
			x2[i]=sc.nextInt();
			x[n+i]=x2[i];
		}
		for (int i = 0; i < n; i++) {
			y2[i]=sc.nextInt();
			y[i+n]=y2[i];
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int num=0;
		for(int i=0;i<x.length-1;i++){
			for (int j = 0; j < y.length-1; j++) {
				for (int k = 0; k < n; k++) {
					if(x1[k]<x[i]&&x[i]<=x2[k]&&y1[k]<y[j]&&y[j]<=y2[k]){
						array[i][j]++;
						num=Math.max(num, array[i][j]);
					}
				}
			}
		}
		System.out.println(num);
	}

}

