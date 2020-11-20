找出10~1000能同时被7，11整除并且十位是3的数
package class1;
public class Test {
	public static void main(String[] args){
		int n=10;
		do{
		if(n/10%10==3 && n%77==0){ System.out.println(n);}
    ++n;}
		while (n<1000 );
		}
	}
  
  
package class1;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		int n ;
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三位数：");
		n=input.nextInt();
		a=n/100; b=n/10%10; c=n%10; d=c*100+b*10+a; 
		System.out.println(d);
		}
	}
