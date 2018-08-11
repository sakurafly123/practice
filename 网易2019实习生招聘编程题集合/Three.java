package 网易2019实习生招聘编程题集合;
import java.util.Scanner;

public class Three {
  public static void main(String msg[]){
	  Scanner sc = new Scanner(System.in);
	  int l = sc.nextInt();
	  int n = sc.nextInt();
	  
	  int num = 0;
	  int rest = 0;
	  int sub = n -l+1;
	  int num_3 =sub/3;
	  int rest_3=sub%3;
	  if(rest_3==0){
		  rest=0;
	  }else if(rest_3==1){
		  if(n%3==1){
			  rest=0;
		  }else{rest=1;}
	  }else if(rest_3==2){
		  if(n%3==0){
			  rest=2;
		  }else{
			  rest=1;
		  }
	  }
	  num = num_3*2+rest;
	  System.out.println(num);
	  sc.close();
  }
}
