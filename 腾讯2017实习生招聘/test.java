package 腾讯2017实习生招聘;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		int min =arr[1]-arr[0];
		int num =0;//差值最小的对数
		int num2 =0;
		if(map.size()==n){
			num=1;
			for (int i = 1; i < arr.length; i++) {
				int sub = arr[i+1]-arr[i];
				if (min<sub){
					continue;
				}else if(min==sub){
					num++;
				}else{
					min = sub;
					num = 1;
				}
			}
		}else{
			for(Integer key : map.keySet()){
				int value =map.get(key);
				if(value>1){
					num+=(value-1)*value/2;
				}
			}
		}
		int num_min =map.get(arr[0]);
		int num_max =map.get(arr[n-1]);
		num2 =num_min*num_max;
		System.out.println(num+" "+num2);
	}
		sc.close();
	}

}
