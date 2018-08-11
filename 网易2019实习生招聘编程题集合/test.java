package 网易2019实习生招聘编程题集合;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
//		String a = ".XXX..XX..XX";
//		char b = a.charAt(0);
//		int temp=0;
//		int num=0;
//		for (int j = 0; j <a.length(); j++) {					
//			char c = a.charAt(j);
//			if(c=='.'){temp++;}
//			if(c=='X'){
//				num=(temp+2)/3+num;
//				temp=0;
//			}
//		}
//		System.out.println(num);
		ArrayList a = new ArrayList<Integer>();
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);
		Integer b = a.indexOf(3);
		System.out.println(b);
	}

}
